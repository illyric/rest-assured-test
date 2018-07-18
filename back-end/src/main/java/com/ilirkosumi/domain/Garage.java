package com.ilirkosumi.domain;

public class Garage {
    private final String name;
    private final Info info;

    public Garage(String name, Info info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public Info getInfo() {
        return info;
    }
}
