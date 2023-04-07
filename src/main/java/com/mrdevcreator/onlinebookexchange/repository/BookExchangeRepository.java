package com.mrdevcreator.onlinebookexchange.repository;

import com.mrdevcreator.onlinebookexchange.model.BookExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookExchangeRepository extends JpaRepository<BookExchange, UUID> {
}
