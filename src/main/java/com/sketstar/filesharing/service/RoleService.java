package com.sketstar.filesharing.service;

import com.sketstar.filesharing.models.Role;

import java.util.List;

public interface RoleService {

    Role load (Long id);

    Role load (String name);

    Role save (Role role);

    void remove (Role role);

    List<Role> all();

    boolean checkExistName (Role role, String name);
}
