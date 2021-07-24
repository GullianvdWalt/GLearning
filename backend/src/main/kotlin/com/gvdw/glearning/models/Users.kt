package com.gvdw.glearning.models

import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

/**
 * @author Gullian Van Der Walt
 * Created at 09:13 on Jul, 2021
 */

@Entity
@Table(
    name = "users",
    uniqueConstraints = [UniqueConstraint(columnNames = arrayOf("username")), UniqueConstraint(columnNames = arrayOf("email"))]
)
class Users(
    @Id @GeneratedValue @Column(name = "user_id") var id: Long,
    @Column(name = "username", unique = true) var username: String,
    @Column(name = "email") @NotBlank @Size(max = 50) @Email var email: String,
    @Column(name = "password") @NotBlank @Size(max = 120) var password: String,
    @Column(name = "first_name") var firstname: String,
    @Column(name = "last_name") var lastname: String
)