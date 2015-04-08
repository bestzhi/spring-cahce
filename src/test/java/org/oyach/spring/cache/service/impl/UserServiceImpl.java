package org.oyach.spring.cache.service.impl;

import org.oyach.spring.cache.domain.User;
import org.oyach.spring.cache.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author liuzhenyuan
 * @version Last modified 15/4/8
 * @since 0.0.1
 */
@Service
public class UserServiceImpl implements UserService {

    public User getUser(long id) {
        System.out.println("==========getUser=========");

        User user = new User();
        user.setId(2L);
        user.setUsername("oyach");
        user.setNickname("欧阳澄泓");
        return user;
    }

    public User getUserByIdAndUsername(long id, String name) {
        System.out.println("==========getUserByIdAndUsername=========");

        User user = new User();
        user.setId(2L);
        user.setUsername("oyach");
        user.setNickname("欧阳澄泓");
        return user;
    }

    public User updateUser(User user) {
        System.out.println("==========updateUser=========");
        return user;
    }

    public boolean deleteUser(long id) {
        System.out.println("==========deleteUser=========");

        return true;
    }
}
