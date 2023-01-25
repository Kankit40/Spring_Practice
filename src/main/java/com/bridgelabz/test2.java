package com.bridgelabz;

public class test2 {
    private int age;
    Data d;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Data getD() {
        return d;
    }

    public void setD(Data d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "test2{" +
                "age=" + age +
                ", d=" + d +
                '}';
    }
}
