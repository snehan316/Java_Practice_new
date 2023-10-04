package com.sneha.practice.customimpl.set;

import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: abx
 * Date: 24/5/17
 * Time: 12:15 PM
 * Created for hashset in package PACKAGE_NAME
 */
public class HashSet<T> implements Set<T> {

    private final static int DEFAULT_SIZE = 3;
    
    private Object[] table; // bucket will be linked lists, but can't use LinkedList<T>[];
    int numberOfElements;

    public HashSet() {
        this.table = new Object[DEFAULT_SIZE];
        this.numberOfElements = 0; // redundant
    }

    public HashSet(int size) {
        this.table = new Object[size];
    }

    private int hash(T el) {
        return Math.floorMod(el.hashCode(), table.length);
    }

    @Override
    public boolean add(T el) {
        int bucketIndex = hash(el);
        if (table[bucketIndex] == null)
            table[bucketIndex] = new LinkedList<>();
        LinkedList<T> bucket = (LinkedList<T>) table[bucketIndex];
        if (!bucket.contains(el)) {
            bucket.add(el);
            numberOfElements++;
            return true;
        } else
            return false;
    }

    @Override
    public boolean remove(T el) {
        boolean res = false;
        int ind = hash(el);
        if (table[ind] != null) {
            LinkedList<T> bucket  = (LinkedList<T>) table[ind];
            if (bucket.contains(el)) {
                bucket.remove(el);
                numberOfElements--;
                res = true;
            }
        }
        return res;
    }

    @Override
    public boolean contains(T el) {
        int ind = hash(el);
        return (table[ind] != null && ((LinkedList<T>)table[ind]).contains(el));
    }

    @Override
    public int size() {

        return numberOfElements;
    }

    @Override
    public String toString() {
        String res = "";
        res += Arrays.asList(table).stream()
                .filter(e -> e != null)
                .flatMap(e -> ((LinkedList<T>)e).stream())
                .map(String::valueOf)
                .collect(joining(", "));

        return res;
    }
}
