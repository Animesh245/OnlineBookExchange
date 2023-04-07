package com.mrdevcreator.onlinebookexchange.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "book_author")
public class BookAuthor {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "author_name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "author")
    private List<Book> bookTitle;
}
