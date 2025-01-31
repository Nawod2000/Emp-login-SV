package org.icet.emoployee.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.icet.emoployee.dto.User;
import org.icet.emoployee.entity.UserEntity;
import org.icet.emoployee.repository.UserRepository;
import org.icet.emoployee.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        repository.save(new ObjectMapper().convertValue(user, UserEntity.class));
        return "OK";
    }
}
