package com.uoc;

public class Sensor {

   public String name;

    public Sensor(String name, double value) {
        this.name = name;
        this.value = value;
    }

    private double value;

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
