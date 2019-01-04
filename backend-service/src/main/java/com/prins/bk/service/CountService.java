package com.prins.bk.service;

import org.springframework.stereotype.Service;

/**
 * @author prinswu
 * @version v1.0
 * @since v1.0 2019-01-04
 */
@Service
public class CountService implements ICountService {
    private int count = 1;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int addCount() {
        count++;
        return getCount();
    }
}
