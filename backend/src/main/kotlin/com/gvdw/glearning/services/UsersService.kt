package com.gvdw.glearning.services

import com.gvdw.glearning.models.Users

/**
 * @author Gullian Van Der Walt
 * Created at 13:56 on Jul, 2021
 */
interface UsersService {
    fun getUsers(): List<Users>?
    fun saveUser(user: Users): Void?
    fun deleteUser(user: Users): Void?
}