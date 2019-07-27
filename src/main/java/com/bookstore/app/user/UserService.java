package com.bookstore.app.user;

import com.bookstore.app.role.RoleType;
import com.bookstore.app.passwordRestToken.PasswordDto;


public interface UserService {

    User saveUser(UserDto userDto, RoleType roleType);

    void changeUserPassword(User user, PasswordDto passwordDto);
}
