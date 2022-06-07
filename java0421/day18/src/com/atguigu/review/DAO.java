package com.atguigu.review;

import java.util.List;

/**
 * @author Hefei Li
 * 2020/5/18 10:05
 */
public interface DAO<T> {

    public void save(String id, T t);

    public T get(String id);

    public void update(String id, T t);

    public List<T> list();

    public void delete(String id);

}
