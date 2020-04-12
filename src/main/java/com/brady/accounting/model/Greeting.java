package com.brady.accounting.model;

/**
 * Created by Brady on 2020/4/12.
 */
public class Greeting {

    private final Long id;
    private String name;

    public Greeting(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
