package com.gvdw.glearning.repositories

import com.gvdw.glearning.models.UserDetails
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * @author Gullian Van Der Walt
 * Created at 11:28 on Jul, 2021
 */
@Repository
interface UserDetailsRepository : JpaRepository<UserDetails, Long> {
   override fun findById(id: Long): Optional<UserDetails>
}