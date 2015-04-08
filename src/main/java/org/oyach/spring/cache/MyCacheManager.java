package org.oyach.spring.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

import java.util.Collection;

/**
 * @author liuzhenyuan
 * @version Last modified 15/4/8
 * @since 0.0.1
 */
public class MyCacheManager extends AbstractCacheManager {

//    private Collection<? extends MyCache> caches;

    @Override
    protected Collection<? extends Cache> loadCaches() {
        return null;
    }
}
