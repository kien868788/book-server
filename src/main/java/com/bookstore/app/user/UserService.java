package com.bookstore.app.user;

import com.bookstore.app.password.PasswordDto;
import com.bookstore.app.role.RoleType;


public interface UserService {

    User saveUser(UserDto userDto, RoleType roleType);

    void changeUserPassword(User user, PasswordDto passwordDto);
}
