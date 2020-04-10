package com.example.polls.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.polls.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
@Component
public class UserQuery implements GraphQLQueryResolver {
    @Autowired
    private UserService userService;
    public List<User> getUsers(final int count) {
        return this.userService.getUsers(count);
    }
    
    public Optional<User> getUser(final String userName) {
        return this.userService.getUser(userName);
    }
}