package edu.erling.barber.security

import edu.erling.barber.utils.Constants

import java.time.LocalDate
import java.time.LocalDateTime

class User {

    String firtsname
    String lastname

    LocalDate birthday

    String username
    String password

    String phone
    String email

    static hasMany = [permissions: Permission]

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "users"
        username unique: true
        password length: 500
    }
}
