package com.example.contact.bean;

// model层的实体类，数据访问层
public class User {
    private int ID;
    private String Name;
    private String Phone_number;

    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone_number() {
        return Phone_number;
    }
    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }
}
