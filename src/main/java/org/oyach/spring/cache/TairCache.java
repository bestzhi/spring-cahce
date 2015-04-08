package org.oyach.spring.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;


/**
 * @author liuzhenyuan
 * @version Last modified 15/4/8
 * @since 0.0.1
 */
public class TairCache implements Cache {
    private static final Logger logger = LoggerFactory.getLogger(TairCache.class);

    /**
     * cache name
     */
    private String name = "default";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getNativeCache() {

        return null;
    }

    public ValueWrapper get(Object key) {

        System.out.println(key);

        return null;
    }

    public void put(Object key, Object value) {

    }

    public void evict(Object key) {

    }

    public void clear() {


    }
}
