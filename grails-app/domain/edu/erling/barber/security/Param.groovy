package edu.erling.barber.security

import edu.erling.barber.model.enums.ParamValueType
import edu.erling.barber.utils.Constants

import java.time.LocalDateTime

class Param {

    int code

    String name
    String description

    String value
    ParamValueType paramValueType

    boolean enabled = true
    String createdBy = Constants.SYSTEM
    String modifyBy = Constants.SYSTEM
    LocalDateTime created
    LocalDateTime updated

    static mapping = {
        table "params"

        description sqlType: "text"
    }
}
