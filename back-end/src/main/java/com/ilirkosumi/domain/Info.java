package com.ilirkosumi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "info")
public class Info {
    @Id
    @GeneratedValue
    private Long Id;

    @NotNull
    private Integer slots;

    @NotBlank
    private String status;

    public Info() {}

    public Info(Integer slots, String status) {
        this.slots = slots;
        this.status = status;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSlots() {
        return slots;
    }

    public String getStatus() {
        return status;
    }
}
