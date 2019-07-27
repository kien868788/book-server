package com.bookstore.app.passwordRestToken;

import com.bookstore.app.user.User;

import javax.mail.MessagingException;

public interface PasswordResetTokenService {
    void createPasswordResetTokenForUser(User user) throws MessagingException;

    boolean validateResetToken(Long userId, String token);
}
