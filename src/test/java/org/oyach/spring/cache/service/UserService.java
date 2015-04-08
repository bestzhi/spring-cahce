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

    @Cacheable(value = "default", key = "#id",condition = "#id > 1")
    User getUser(long id);

    @Cacheable(value = {"userCache", "userCache2"})
    User getUserByIdAndUsername(long id, String name);

    @CachePut(value = {"userCache", "userCache2"}, key = "#user.id")
    User updateUser(User user);

    @CacheEvict(value = {"userCache", "userCache2"})
    boolean deleteUser(long id);
}
