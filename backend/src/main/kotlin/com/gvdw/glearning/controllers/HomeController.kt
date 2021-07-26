package com.gvdw.glearning.controllers

import com.gvdw.glearning.services.UsersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Gullian Van Der Walt
 * Created at 14:12 on Jul, 2021
 */
@RestController
@RequestMapping("/api/home")
class HomeController {

    @Autowired
    lateinit var usersService: UsersService


}