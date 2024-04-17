package com.ohgiraffers.demo2.common;

import java.time.LocalDateTime;


public class MemberDTO {
    private int id;
    private String name;
    private int age;
    private String address;
    private LocalDateTime registerDateTime;

    public MemberDTO(){}

    public MemberDTO(int id, String name, int age, String address, LocalDateTime registerDateTime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.registerDateTime = registerDateTime;
    }

    public MemberDTO(String name, int age, String address, LocalDateTime registerDateTime) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.registerDateTime = registerDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
}
