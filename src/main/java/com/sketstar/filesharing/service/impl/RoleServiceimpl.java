package com.sketstar.filesharing.service.impl;

import com.sketstar.filesharing.models.Role;
import com.sketstar.filesharing.repositories.RoleRepository;
import com.sketstar.filesharing.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceimpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceimpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role load(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public Role load(String name) {
        return roleRepository.findByName(name);
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void remove(Role role) {
        roleRepository.delete(role);
    }

    @Override
    public List<Role> all() {
        return roleRepository.findAll();
    }

    @Override
    public boolean checkExistName(Role role, String name) {

        if (role==null||role.getId()==null){
            return roleRepository.countByName(name)<0;
        }
        return roleRepository.countByName(name)<1;
    }
}
