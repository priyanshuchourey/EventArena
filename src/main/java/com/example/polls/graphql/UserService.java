package com.example.polls.graphql;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.polls.model.*;
import com.example.polls.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository ;
    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository ;
    }

    @Transactional
    public User createUser(final String userName, final String password) {
        final User user = new User();
        user.setPassword(password);
        user.setUsername(userName);
        return this.userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> getUsers(final int count) {
        return this.userRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<User> getUser(final String userName) {
        return this.userRepository.findByUsername(userName);
    }
}
