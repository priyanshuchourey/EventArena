package com.example.polls.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.polls.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserMutation implements GraphQLMutationResolver {
    @Autowired
    private UserService userService;
    public User createUser(final String userName, final String password) {
        return this.userService.createUser(userName, password);
    }
}