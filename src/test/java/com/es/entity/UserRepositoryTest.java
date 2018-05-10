package com.es.entity;

import com.es.SouwuApplicationTests;
import com.es.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * Created by wsj
 */
public class UserRepositoryTest extends SouwuApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("waliwali", user.getName());
    }
}
