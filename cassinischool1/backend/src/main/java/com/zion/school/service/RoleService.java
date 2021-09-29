package com.zion.school.service;

import com.zion.school.model.security.Role;
import com.zion.school.model.security.User;
import com.zion.school.repo.security.RoleRepository;
import com.zion.school.repo.security.RoleRepository;
import com.zion.school.repo.security.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Lenovo on 20-09-2021.
 */
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    public Role createNewRole(Role role){
        return  roleRepository.save(role);
    }

    public List<Role> getAll(){
        Set<User> users1 = new HashSet<>();
        List<Role> roles= roleRepository.findAll();

//        for (Role role : roles){
//            List<User> users = userRepository.findAll();
//
//            for(User user : users){
//                for(Role role1 : user.getRoles()){
//                    if(role.getName().equals(role1.getName())){
//                        users1.add(user);
//                    }
//
//                }
//                role.setUsers(users1);
//            }
//
//        }
        return  roles;
    }

    public Role updateRole(Long id , Role role){
        return  roleRepository.save(role);
    }
    public void deleteRole(Long id){
        roleRepository.deleteById(id);
    }
}
