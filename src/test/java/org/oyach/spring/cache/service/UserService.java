package org.oyach.spring.cache.service;

import org.oyach.spring.cache.domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author liuzhenyuan
 * @version Last modified 15/4/8
 * @since 0.0.1
 */
public interface UserService {

    @Cacheable(value = "userCache")
    User getUser(long id);

    @Cacheable(value = "userCache")
    User getUserByIdAndUsername(long id, String name);

    @CachePut(value = "userCache", key = "#user.id")
    User updateUser(User user);

    @CacheEvict(value = "userCache")
    boolean deleteUser(long id);
}
