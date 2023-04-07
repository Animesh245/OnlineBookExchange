package com.mrdevcreator.onlinebookexchange.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "book_exchange")
public class BookExchange {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "book_one", referencedColumnName = "id")
    private Book bookOne;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "book_two", referencedColumnName = "id")
    private Book bookTwo;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "owner_one", referencedColumnName = "id")
    private User bookOneOwner;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "owner_two", referencedColumnName = "id")
    private User bookTwoOwner;

    @Column(name = "rating")
    private String rating;

    @Column(name = "exchange_date")
    private LocalDateTime exchangeDate;

    @Column(name = "status")
    private String status = "pending";

    @Column(name = "comment")
    private String comment;
}
