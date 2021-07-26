package com.gvdw.glearning.services

import com.gvdw.glearning.models.UserDetails
import com.gvdw.glearning.models.Users
import com.gvdw.glearning.repositories.UserDetailsRepository
import com.gvdw.glearning.repositories.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @author Gullian Van Der Walt
 * Created at 13:56 on Jul, 2021
 */
@Service("usersService")
class UsersServiceImpl : UsersService{

    @Autowired
    lateinit var usersRepository: UsersRepository

    @Autowired
    lateinit var userDetailsRepository: UserDetailsRepository

    override fun getUsers(): List<Users>? {
        return usersRepository.getUsers()
    }

    override fun saveUser(user: Users): Void? {
     usersRepository.save(user)
        return null
    }

    override fun deleteUser(user: Users): Void? {
        usersRepository.delete(user)
        return null
    }

    override fun saveUserDetails(userDetails: UserDetails): Void? {
        userDetailsRepository.save(userDetails)
        return null
    }
}