/*
*
* LmSensitiveWord.java
* @author LiuSiGuang
* @date 2018-11-01
*/
package com.lmrd.entity.sensitive;

public class LmSensitiveWord {
    /**
     * 主键
     * 表字段 : lm_sensitive_word.sensitive_word_id
     */
    private Long sensitiveWordId;

    /**
     * 类型
     * 表字段 : lm_sensitive_word.sensitive_type
     */
    private String sensitiveType;

    /**
     * 主题
     * 表字段 : lm_sensitive_word.sensitive_topic
     */
    private String sensitiveTopic;

    /**
     * 文本
     * 表字段 : lm_sensitive_word.sensitive_word
     */
    private String sensitiveWord;

    /**
     * 获取 主键 字段:lm_sensitive_word.sensitive_word_id
     *
     * @return lm_sensitive_word.sensitive_word_id, 主键
     */
    public Long getSensitiveWordId() {
        return sensitiveWordId;
    }

    /**
     * 设置 主键 字段:lm_sensitive_word.sensitive_word_id
     *
     * @param sensitiveWordId the value for lm_sensitive_word.sensitive_word_id, 主键
     */
    public void setSensitiveWordId(Long sensitiveWordId) {
        this.sensitiveWordId = sensitiveWordId;
    }

    /**
     * 获取 类型 字段:lm_sensitive_word.sensitive_type
     *
     * @return lm_sensitive_word.sensitive_type, 类型
     */
    public String getSensitiveType() {
        return sensitiveType;
    }

    /**
     * 设置 类型 字段:lm_sensitive_word.sensitive_type
     *
     * @param sensitiveType the value for lm_sensitive_word.sensitive_type, 类型
     */
    public void setSensitiveType(String sensitiveType) {
        this.sensitiveType = sensitiveType == null ? null : sensitiveType.trim();
    }

    /**
     * 获取 主题 字段:lm_sensitive_word.sensitive_topic
     *
     * @return lm_sensitive_word.sensitive_topic, 主题
     */
    public String getSensitiveTopic() {
        return sensitiveTopic;
    }

    /**
     * 设置 主题 字段:lm_sensitive_word.sensitive_topic
     *
     * @param sensitiveTopic the value for lm_sensitive_word.sensitive_topic, 主题
     */
    public void setSensitiveTopic(String sensitiveTopic) {
        this.sensitiveTopic = sensitiveTopic == null ? null : sensitiveTopic.trim();
    }

    /**
     * 获取 文本 字段:lm_sensitive_word.sensitive_word
     *
     * @return lm_sensitive_word.sensitive_word, 文本
     */
    public String getSensitiveWord() {
        return sensitiveWord;
    }

    /**
     * 设置 文本 字段:lm_sensitive_word.sensitive_word
     *
     * @param sensitiveWord the value for lm_sensitive_word.sensitive_word, 文本
     */
    public void setSensitiveWord(String sensitiveWord) {
        this.sensitiveWord = sensitiveWord == null ? null : sensitiveWord.trim();
    }
}