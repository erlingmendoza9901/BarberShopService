package edu.erling.barber.security

import edu.erling.barber.utils.Constants

import java.time.LocalDateTime

class Permission {

    int code

    String name
    String description

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "permissions"

        description sqlType: "text"
    }
}
