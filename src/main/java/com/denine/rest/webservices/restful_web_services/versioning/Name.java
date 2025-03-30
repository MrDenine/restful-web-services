package com.denine.rest.webservices.restful_web_services.versioning;

public class Name {
    private String firstName;
    private String lateName;

    public Name(String firstName, String lateName) {
        this.firstName = firstName;
        this.lateName = lateName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLateName() {
        return lateName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLateName(String lateName) {
        this.lateName = lateName;
    }
}
