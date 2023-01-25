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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    public Map<String, String> getGame() {
        return game;
    }

    public void setGame(Map<String, String> game) {
        this.game = game;
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
