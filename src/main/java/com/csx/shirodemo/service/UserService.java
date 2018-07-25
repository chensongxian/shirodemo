package com.csx.shirodemo.service;

import com.csx.shirodemo.model.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: TODO
 * @author: csx
 * @Date: 2018-07-18
 */
public interface UserService {
    User findByUsername(String username);
}
