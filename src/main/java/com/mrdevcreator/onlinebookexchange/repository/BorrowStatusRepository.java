package com.mrdevcreator.onlinebookexchange.repository;

import com.mrdevcreator.onlinebookexchange.model.BorrowStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BorrowStatusRepository extends JpaRepository<BorrowStatus, UUID> {
}
