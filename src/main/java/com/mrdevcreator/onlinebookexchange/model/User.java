package com.mrdevcreator.onlinebookexchange.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "hostel_name")
    private String hostelName;

    @Column(name = "room_no")
    private String roomNumber;

    @Column(name = "phone_no")
    private String phoneNumber;

    @Column(name = "role")
    private String role;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "created_by", referencedColumnName = "id")
    private User createdBy;
}
