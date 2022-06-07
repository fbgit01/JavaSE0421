package com.atguigu.review;

import java.util.*;

/**
 * @author Hefei Li
 * 2020/5/18 10:11
 */
public class BaseDAO<T> implements DAO<T> {

    private Map<String, T> map = new HashMap<>();

    @Override
    public void save(String id, T t) {
        map.put(id, t);
    }

    @Override
    public T get(String id) {
        return map.get(id);
    }

    @Override
    public void update(String id, T t) {
        map.put(id, t);
    }

    @Override
    public List<T> list() {
        Collection<T> coll = map.values();

        List<T> list = new ArrayList<>();

        list.addAll(coll);

        return list;
    }

    @Override
    public void delete(String id) {
        map.remove(id);
    }
}
