package com.sketstar.filesharing.repositories;

import com.sketstar.filesharing.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLogin(String login);

    int countByLogin(String login);

}
