package com.brainstation.demo.socialmedia.TravelWorld.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity(name="user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String fullName;
    private String userName;
    private String password;
    private String email;
    private Boolean isActive;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
