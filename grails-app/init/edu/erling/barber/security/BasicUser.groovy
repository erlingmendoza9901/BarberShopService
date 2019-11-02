package edu.erling.barber.security

import edu.erling.barber.model.interfaces.BootStrapInsert

class BasicUser implements BootStrapInsert {

    BasicUser() {
    }

    @Override
    void insert() {
        create("root", "root")
    }

    private User create(String username, String password) {
        User user = User.findByUsername(username)
        if (user == null) {
            user = new User()
            user.username = username
            user.password = password
            return user.save(flush: true)
        }
        return user
    }
}
