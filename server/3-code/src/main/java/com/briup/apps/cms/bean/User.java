package com.briup.apps.cms.bean;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.id
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.username
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.nickname
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.password
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.enabled
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.email
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.userface
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private String userface;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.regTime
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private Date regtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user.role
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.id
     *
     * @return the value of cms_user.id
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.id
     *
     * @param id the value for cms_user.id
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.username
     *
     * @return the value of cms_user.username
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.username
     *
     * @param username the value for cms_user.username
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.nickname
     *
     * @return the value of cms_user.nickname
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.nickname
     *
     * @param nickname the value for cms_user.nickname
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.password
     *
     * @return the value of cms_user.password
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.password
     *
     * @param password the value for cms_user.password
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.enabled
     *
     * @return the value of cms_user.enabled
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.enabled
     *
     * @param enabled the value for cms_user.enabled
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.email
     *
     * @return the value of cms_user.email
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.email
     *
     * @param email the value for cms_user.email
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.userface
     *
     * @return the value of cms_user.userface
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public String getUserface() {
        return userface;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.userface
     *
     * @param userface the value for cms_user.userface
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setUserface(String userface) {
        this.userface = userface == null ? null : userface.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.regTime
     *
     * @return the value of cms_user.regTime
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.regTime
     *
     * @param regtime the value for cms_user.regTime
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user.role
     *
     * @return the value of cms_user.role
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user.role
     *
     * @param role the value for cms_user.role
     *
     * @mbg.generated Sat Feb 29 11:16:20 CST 2020
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}