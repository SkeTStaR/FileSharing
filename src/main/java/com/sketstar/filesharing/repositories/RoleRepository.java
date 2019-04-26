package com.sketstar.filesharing.repositories;

import com.sketstar.filesharing.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    int countByName (String Name);
}
