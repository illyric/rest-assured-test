package com.ilirkosumi.domain;

public class Info {
    private final int slots;
    private final String status;

    public Info(int slots, String status) {
        this.slots = slots;
        this.status = status;
    }

    public int getSlots() {
        return slots;
    }

    public String getStatus() {
        return status;
    }
}
