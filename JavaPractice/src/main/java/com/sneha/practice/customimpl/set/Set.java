package com.sneha.practice.customimpl.set;

/**
 * Created with IntelliJ IDEA.
 * User: abx
 * Date: 24/5/17
 * Time: 11:29 AM
 * Created for hashset in package PACKAGE_NAME
 *
 * @param <T> the type parameter
 */
public interface Set<T> {

    /**
     * Add an element to a set
     *
     * @param el the el
     * @return false if it's already there
     */
    boolean add(T el);

    /**
     * Remove an element from a st
     *
     * @param el the el
     * @return false if it's not there beforehand
     */
    boolean remove(T el);

    /**
     * Checks if an element is in the set
     *
     * @param el the el
     * @return false if el is not there
     */
    boolean contains(T el);

    /**
     * Size int.
     *
     * @return number of element in the set
     */
    int size();

}
