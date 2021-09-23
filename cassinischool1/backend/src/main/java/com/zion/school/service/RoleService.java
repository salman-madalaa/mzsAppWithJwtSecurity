package com.zion.school.service;

import com.zion.school.repo.security.RoleRepository;
import com.zion.school.repo.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lenovo on 20-09-2021.
 */
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;
}
