package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author pijiahao
 * @create 2022-01-20-17:33
 */
@Repository
public class AlphaDaoImpl implements AlphaDao {
    @Override
    public String sayHello() {
        return "hello";
    }
}
