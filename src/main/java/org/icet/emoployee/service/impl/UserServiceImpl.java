package org.icet.emoployee.service.impl;

import org.icet.emoployee.dto.User;
import org.icet.emoployee.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        return null;
    }
}
