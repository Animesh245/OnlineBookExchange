package com.mrdevcreator.onlinebookexchange.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "book_request")
public class BookRequest {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private User bookOwner;

    @Column(name = "book_title")
    private String bookTitle;

    @Column(name = "isbn")
    private String isbnNumber;

    @Column(name = "publish_year")
    private Year publishYear;

    @Column(name = "genre")
    private String genre;

    @Column(name = "condition")
    private String conditon;
}
