package com.mrdevcreator.onlinebookexchange.repository;

import com.mrdevcreator.onlinebookexchange.model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, UUID> {
}
