package com.mrdevcreator.onlinebookexchange.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "title")
    private String bookTitle;

    @Column(name = "isbn")
    private String isbnNumber;

    @Column(name = "publish_year")
    private Year publishYear;

    @Column(name = "availability")
    private Boolean availability;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private BookAuthor author;

}
