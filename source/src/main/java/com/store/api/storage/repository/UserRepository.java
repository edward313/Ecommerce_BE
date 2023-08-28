package com.store.api.storage.repository;

import com.store.api.storage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    User findByUsername(String userName);

    void deleteUserById(Long id);
}
