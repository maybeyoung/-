package com.es.service;

import com.es.entity.User;

/**
 * @Author: wsj
 */
public interface IUserService {
    User findUserByName(String userName);
}
