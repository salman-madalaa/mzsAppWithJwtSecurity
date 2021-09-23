package com.zion.school.controller;

import com.zion.school.core.BaseController;
import com.zion.school.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 20-09-2021.
 */
@RestController
@RequestMapping(value = "roles")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;
}
