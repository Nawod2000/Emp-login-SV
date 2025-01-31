package org.icet.emoployee.service;

import org.icet.emoployee.dto.User;

public interface UserService {
    boolean login(User user);
    String register(User user);
}
