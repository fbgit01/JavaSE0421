package com.atguigu.review;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hefei Li
 * 2020/5/18 10:23
 */
public class ListBaseDAO<T> implements DAO<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void save(String id, T t) {

    }

    @Override
    public T get(String id) {
        return null;
    }

    @Override
    public void update(String id, T t) {

    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
