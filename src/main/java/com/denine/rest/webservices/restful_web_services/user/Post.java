package com.denine.rest.webservices.restful_web_services.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 10,max = 4000)
    @JsonProperty("description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
