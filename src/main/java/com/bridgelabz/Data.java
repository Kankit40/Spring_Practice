package com.bridgelabz;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Data {
    private String name;
    private int id;
    private List<String> phone;
    private Set<String> city;
    private Map<String,String> game;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setList(List<String> list) {
        this.phone = list;
    }

    public void setSet(Set<String> set) {
        this.city = set;
    }

    public void setMap(Map<String, String> map) {
        this.game = map;
    }





    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", city=" + city +
                ", game=" + game +
                '}';
    }
}
