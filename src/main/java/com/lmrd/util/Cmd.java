package com.lmrd.util;
import java.io.InputStream;
/**
 * @Auther: teck
 * @Date: 2018/11/2 15:51
 * @Description:
 */
public class Cmd {

    public static void main(String[] args) {
        String path = "D:\\public.txt";
        Runtime run = Runtime.getRuntime();
        try {
            // run.exec("cmd /k shutdown -s -t 3600");
            Process process = run.exec("cmd.exe /c dir java " );
            InputStream in = process.getInputStream();
            while (in.read() != -1) {
                System.out.println(in.read());
            }
            in.close();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
