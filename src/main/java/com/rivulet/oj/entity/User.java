package com.rivulet.oj.entity;

public class User {
    private int u_id;
    private int u_account;
    private int u_password;
    private int u_email;
    private int u_mobile_num;
    private int u_created_time;
    private int u_last_time;
    private int u_authority;
    private int u_nick_name;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getU_account() {
        return u_account;
    }

    public void setU_account(int u_account) {
        this.u_account = u_account;
    }

    public int getU_password() {
        return u_password;
    }

    public void setU_password(int u_password) {
        this.u_password = u_password;
    }

    public int getU_email() {
        return u_email;
    }

    public void setU_email(int u_email) {
        this.u_email = u_email;
    }

    public int getU_mobile_num() {
        return u_mobile_num;
    }

    public void setU_mobile_num(int u_mobile_num) {
        this.u_mobile_num = u_mobile_num;
    }

    public int getU_created_time() {
        return u_created_time;
    }

    public void setU_created_time(int u_created_time) {
        this.u_created_time = u_created_time;
    }

    public int getU_last_time() {
        return u_last_time;
    }

    public void setU_last_time(int u_last_time) {
        this.u_last_time = u_last_time;
    }

    public int getU_authority() {
        return u_authority;
    }

    public void setU_authority(int u_authority) {
        this.u_authority = u_authority;
    }

    public int getU_nick_name() {
        return u_nick_name;
    }

    public void setU_nick_name(int u_nick_name) {
        this.u_nick_name = u_nick_name;
    }

    public User() {
    }

    public User(int u_id, int u_account, int u_password, int u_email, int u_mobile_num, int u_created_time, int u_last_time, int u_authority, int u_nick_name) {
        this.u_id = u_id;
        this.u_account = u_account;
        this.u_password = u_password;
        this.u_email = u_email;
        this.u_mobile_num = u_mobile_num;
        this.u_created_time = u_created_time;
        this.u_last_time = u_last_time;
        this.u_authority = u_authority;
        this.u_nick_name = u_nick_name;
    }
}
