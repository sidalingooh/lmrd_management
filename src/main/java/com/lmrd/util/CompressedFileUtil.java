package com.lmrd.util;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 压缩文件
 *
 * @author kuN
 * @create 2017-12-28 15:50
 **/
public class CompressedFileUtil {

    /**
     * 使用给定密码压缩指定文件或文件夹到指定位置.
     * <p/>
     * dest可传最终压缩文件存放的绝对路径,也可以传存放目录,也可以传null或者"".<br />
     * 如果传null或者""则将压缩文件存放在当前目录,即跟源文件同目录,压缩文件名取源文件名,以.zip为后缀;<br />
     * 如果以路径分隔符(File.separator)结尾,则视为目录,压缩文件名取源文件名,以.zip为后缀,否则视为文件名.
     *
     * @param src         要压缩的文件或文件夹路径
     * @param dest        压缩文件存放路径
     * @param isCreateDir 是否在压缩文件里创建目录,仅在压缩文件为目录时有效.<br />
     *                    如果为false,将直接压缩目录下文件到压缩文件.
     * @param passwd      压缩使用的密码
     * @return 最终的压缩文件存放的绝对路径, 如果为null则说明压缩失败.
     */
    public static String zip(String src, String dest, boolean isCreateDir, String passwd) {
        File srcFile = new File(src);
        dest = buildDestinationZipFilePath(srcFile, dest);
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);           // 压缩方式
        parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);    // 压缩级别
        if (!StringUtils.isEmpty(passwd)) {
            parameters.setEncryptFiles(true);
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD); // 加密方式
            parameters.setPassword(passwd.toCharArray());
        }
        try {
            ZipFile zipFile = new ZipFile(dest);
            if (srcFile.isDirectory()) {
                // 如果不创建目录的话,将直接把给定目录下的文件压缩到压缩文件,即没有目录结构
                if (!isCreateDir) {
                    File[] subFiles = srcFile.listFiles();
                    ArrayList<File> temp = new ArrayList<>();
                    Collections.addAll(temp, subFiles);
                    zipFile.addFiles(temp, parameters);
                    return dest;
                }
                zipFile.addFolder(srcFile, parameters);
            } else {
                zipFile.addFile(srcFile, parameters);
            }
            return dest;
        } catch (ZipException e) {
            e.printStackTrace();
        }
        return src;
    }

    /**
     * 构建压缩文件存放路径,如果不存在将会创建
     * 传入的可能是文件名或者目录,也可能不传,此方法用以转换最终压缩文件的存放路径
     *
     * @param srcFile   源文件
     * @param destParam 压缩目标路径
     * @return 正确的压缩文件存放路径
     */
    private static String buildDestinationZipFilePath(File srcFile, String destParam) {
        if (StringUtils.isEmpty(destParam)) {
            if (srcFile.isDirectory()) {
                destParam = srcFile.getParent() + File.separator + srcFile.getName() + ".zip";
            } else {
                String fileName = srcFile.getName().substring(0, srcFile.getName().lastIndexOf("."));
                destParam = srcFile.getParent() + File.separator + fileName + ".zip";
            }
        } else {
            createDestDirectoryIfNecessary(destParam);  // 在指定路径不存在的情况下将其创建出来
            if (destParam.endsWith(File.separator)) {
                String fileName;
                if (srcFile.isDirectory()) {
                    fileName = srcFile.getName();
                } else {
                    fileName = srcFile.getName().substring(0, srcFile.getName().lastIndexOf("."));
                }
                destParam += fileName + ".zip";
            }
        }
        return destParam;
    }

    /**
     * 在必要的情况下创建压缩文件存放目录,比如指定的存放路径并没有被创建
     *
     * @param destParam 指定的存放路径,有可能该路径并没有被创建
     */
    private static void createDestDirectoryIfNecessary(String destParam) {
        File destDir;
        if (destParam.endsWith(File.separator)) {
            destDir = new File(destParam);
        } else {
            destDir = new File(destParam.substring(0, destParam.lastIndexOf(File.separator)));
        }
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
    }

    /**
     * 解压zip压缩包 jdk1.5
     *
     * @throws Exception
     */
    public static byte[] uncompressZip(byte[] bytes) throws Exception {
        ZipInputStream zIns ;

        //解压缩
        try {
            zIns = new ZipInputStream(new ByteArrayInputStream(bytes));
            ZipEntry ze;
            while ((ze = zIns.getNextEntry()) != null) {
                if (ze.isDirectory()) {
                    zIns.closeEntry();
                } else {
                    ByteArrayOutputStream os = new ByteArrayOutputStream();
                    IOUtils.copy(zIns, os);
                    return os.toByteArray();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
