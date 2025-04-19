package com.shampoo.law.service.program;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -19 -17:18
 */
public class LRUCache<K, V> {

    private final int cap;
    private final Map<K, V> cacheMap;

    private final LinkedList<K> linkedList;

    public LRUCache(int cap, Map<K, V> cacheMap, LinkedList<K> linkedList) {
        this.cap = cap;
        this.cacheMap = new HashMap<>(cap);
        this.linkedList = new LinkedList<>();
    }

    public synchronized void put(K key, V value) {
        if (cacheMap.containsKey(key)) {
            cacheMap.remove(key);
        }
        while (cacheMap.size() >= cap) {
            K oldsetKey = linkedList.removeFirst();
            cacheMap.remove(oldsetKey);
        }
        cacheMap.put(key, value);
        linkedList.addLast(key);
    }

    public synchronized V get(K key) {
        if (cacheMap.containsKey(key)) {
            linkedList.remove(key);
            linkedList.add(key);
            return cacheMap.get(key);
        }
        return null;
    }
}
