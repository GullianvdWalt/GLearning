package com.gvdw.glearning.models

import javax.persistence.*
import javax.validation.constraints.Size

/**
 * @author Gullian Van Der Walt
 * Created at 09:01 on Jul, 2021
 */

@Entity
@Table(name = "user_details")
class UserDetails(
    @Id @GeneratedValue @Column(name = "user_details_id") var id: Long,
    @OneToOne(mappedBy = "userDetails") var users: Users,
    @Column(name = "first_name") var firstname: String,
    @Column(name = "last_name") var lastname: String,
    @Column(name = "identity_number") @Size(max = 20) var identityNumber: String,
    @Column(name = "country") var country: String,
    @Column(name = "province") var province: String,
    @Column(name = "city") var city: String,
    @Column(name = "address") var address: String,
    @Column(name = "postal_code") var postalCode: Int,
    @Column(name = "mobile") var mobile: String,
    @Column(name = "gender") var gender: String,
)