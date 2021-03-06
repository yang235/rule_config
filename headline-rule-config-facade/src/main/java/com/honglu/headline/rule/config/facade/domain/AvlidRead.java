package com.honglu.headline.rule.config.facade.domain;



import java.awt.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AvlidRead implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.id
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.read_name
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String readName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.read_type
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String readType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.read_gold
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String readGold;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.state
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.version
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.create_time
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.create_user
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.create_user_name
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.modify_time
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.modify_user_name
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String modifyUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read.modify_user
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String modifyUser;




    //子规则详细 规则详细
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.id
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String detailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.avlid_read_id
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String avlidReadId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.read_rule_name
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String readRuleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.read_rule_code
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String readRuleCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.read_time
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String readTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.state
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String sonState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sc_avlid_read_rule_detail.version
     *
     * @mbggenerated Thu Dec 07 11:27:35 CST 2017
     */
    private String sonVersion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReadName() {
        return readName;
    }

    public void setReadName(String readName) {
        this.readName = readName;
    }

    public String getReadType() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType = readType;
    }

    public String getReadGold() {
        return readGold;
    }

    public void setReadGold(String readGold) {
        this.readGold = readGold;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getAvlidReadId() {
        return avlidReadId;
    }

    public void setAvlidReadId(String avlidReadId) {
        this.avlidReadId = avlidReadId;
    }

    public String getReadRuleName() {
        return readRuleName;
    }

    public void setReadRuleName(String readRuleName) {
        this.readRuleName = readRuleName;
    }

    public String getReadRuleCode() {
        return readRuleCode;
    }

    public void setReadRuleCode(String readRuleCode) {
        this.readRuleCode = readRuleCode;
    }

    public String getReadTime() {
        return readTime;
    }

    public void setReadTime(String readTime) {
        this.readTime = readTime;
    }

    public String getSonState() {
        return sonState;
    }

    public void setSonState(String sonState) {
        this.sonState = sonState;
    }

    public String getSonVersion() {
        return sonVersion;
    }

    public void setSonVersion(String sonVersion) {
        this.sonVersion = sonVersion;
    }
}