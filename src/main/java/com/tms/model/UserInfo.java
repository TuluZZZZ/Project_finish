package com.tms.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(exclude = "updatedAt")
@Entity(name = "users")
public class UserInfo {
    @Id
    @SequenceGenerator(name="mySeqGen",sequenceName = "users_id_seq",allocationSize = 1)
    @GeneratedValue
       private Integer id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="created")
    private LocalDateTime createdAt;
    @Column(name="updated")
    private LocalDateTime updatedAt;
    @Enumerated(EnumType.STRING)
    private Role role;
    }
