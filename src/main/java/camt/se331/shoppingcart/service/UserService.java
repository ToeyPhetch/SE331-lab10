package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.User;

import java.util.List;

/**
 * Created by Dto on 26/4/2016.
 */
public interface UserService {
    public List<User> findAll();
    public User findByUserName(String username);
}
