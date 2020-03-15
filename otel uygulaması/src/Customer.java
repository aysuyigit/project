/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruşan Oğuz
 */
public class Customer {
    private String name;
    private String surname;
    private int age;
    private String id;
    private String phone;
    private int memnumber;
    private String roomnumber;
    private String entrydate;
    private String exitdate;
    private int price;

    public Customer(String name, String surname, int age, String id, String phone, int memnumber, String roomnumber, String entrydate, String exitdate,int price) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.phone = phone;
        this.memnumber = memnumber;
        this.roomnumber = roomnumber;
        this.entrydate = entrydate;
        this.exitdate = exitdate;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMemnumber() {
        return memnumber;
    }

    public void setMemnumber(int memnumber) {
        this.memnumber = memnumber;
    }

    public String getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(String roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getExitdate() {
        return exitdate;
    }

    public void setExitdate(String exitdate) {
        this.exitdate = exitdate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
