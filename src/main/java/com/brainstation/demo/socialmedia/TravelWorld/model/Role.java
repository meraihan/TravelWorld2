package com.brainstation.demo.socialmedia.TravelWorld.model;

import com.brainstation.demo.socialmedia.TravelWorld.model.enums.RoleName;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleName name;

    @OneToOne(mappedBy = "role")
    private User user;
}
