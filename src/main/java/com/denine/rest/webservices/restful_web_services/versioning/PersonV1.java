package com.denine.rest.webservices.restful_web_services.versioning;

public class PersonV1 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonV1(String name) {
        super();
        this.name = name;
    }
}
