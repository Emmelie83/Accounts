package com.emmeliejohansson.accounts.repository;

import com.emmeliejohansson.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
