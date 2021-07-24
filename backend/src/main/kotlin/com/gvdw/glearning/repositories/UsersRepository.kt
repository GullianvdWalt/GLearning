package com.gvdw.glearning.repositories

import com.gvdw.glearning.models.Users
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

/**
 * @author Gullian Van Der Walt
 * Created at 11:28 on Jul, 2021
 */

interface UsersRepository : JpaRepository<Users, Long>{
    override fun findById(id: Long): Optional<Users>
    fun findByUsername(username: String): Users?
    fun findByEmail(email: String): Users?
}