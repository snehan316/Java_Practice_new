package com.sneha.practice.customimpls;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap implements Map {
	
	private Object[] map = {};

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return map.length;
	}

	public boolean add(String string, int i) {
		// TODO Auto-generated method stub
		Object[] temp = Arrays.copyOf(map, i + 1);
		temp[i] = string;
		map = temp;
		return true;
	}

	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return map.length == 0;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
