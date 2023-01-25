package com.bridgelabz_const;

public class Data1 {
    private int id;
    private String name;
    private String standard;

    public Data1() {
    }

    public Data1(int id, String name, String standard) {
        this.id = id;
        this.name = name;
        this.standard = standard;
    }



    @Override
    public String toString() {
        return "Data1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Classes='" + standard + '\'' +
                '}';
    }


}
