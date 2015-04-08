package org.oyach.spring.cache.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.oyach.spring.cache.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author liuzhenyuan
 * @version Last modified 15/4/8
 * @since 0.0.1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-cache.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUser() throws Exception {
        User user = userService.getUser(2L);
        System.out.println("----");
        User user2 = userService.getUser(2L);
        System.out.println();
    }

    @Test
    public void testGetUserByIdAndUsername() throws Exception {
        User user = userService.getUserByIdAndUsername(2L, "oyach");
        System.out.println("----");
        User user2 = userService.getUserByIdAndUsername(2L, "oyach");
        System.out.println();
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = userService.getUser(2L);
        System.out.println("----");

        User newUser = new User();
        newUser.setId(2L);
        newUser.setUsername("oyach2");
        newUser.setNickname("欧阳澄泓2");

        User user1 = userService.updateUser(newUser);
        System.out.println();

        User user2 = userService.getUser(2L);
        System.out.println();
    }

    @Test
    public void testDeleteUser() throws Exception {
        User user = userService.getUser(2L);
        System.out.println("----");

        userService.deleteUser(2L);

//        User newUser = userService.getUser(2L);
        System.out.println();
    }


}