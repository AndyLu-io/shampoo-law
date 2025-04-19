package com.shampoo.law.service.suanfa;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author luxiaobo
 * @Description
 * @create 2025 -03 -16 -14:44
 */
public class findDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int j : nums2) {
            s2.add(j);
        }
        for (int j : nums2) {
            s1.remove(j);
        }
        for (int j : nums1) {
            s1.remove(j);
        }
        List<Integer> collect = s1.stream().collect(Collectors.toList());
        List<Integer> collect1 = s2.stream().collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        result.add(collect);
        result.add(collect1);
        return result;
    }
}
