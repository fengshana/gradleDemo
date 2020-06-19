package com.fsn.modle;

public class UserInfo {

    private String username;
    private int age;
    private int gender;
    private String desc;


    public UserInfo(){

    }

    public UserInfo(String username,int age, int gender, String desc){
        this.username=username;
        this.age=age;
        this.gender=gender;
        this.desc=desc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
