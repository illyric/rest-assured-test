package com.ilirkosumi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "garage")
public class Garage implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private final String name;
    @NotBlank
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
