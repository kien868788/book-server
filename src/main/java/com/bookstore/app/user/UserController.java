package com.bookstore.app.user;

import com.bookstore.app.passwordRestToken.PasswordDto;
import com.bookstore.app.role.RoleType;
import com.bookstore.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path="/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDto user) throws Exception {
        userService.saveUser(user, RoleType.ROLE_USER);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/savePassword")
    public ResponseEntity<?> savePassword(@Valid PasswordDto passwordDto) {
        User user = SecurityUtils.getLoggedInUser();
        userService.changeUserPassword(user, passwordDto);
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

//    //TODO Enable pagination on hibernate search
//    @GetMapping(path = "/search")
//    public ResponseEntity<?> searchUser(@RequestParam("keyword") String keyword) throws Exception{
//        List<User> users = userSearchService.findUsersByKeyword(keyword);
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }

}
