package com.howtodoinjava.service;

import java.util.List;


import com.howtodoinjava.entity.MyEntity;

public interface Myclass {
	
	public void add(MyEntity employee);
    public List<MyEntity> getAllEmployees();
    public void delete(Integer Id);

}
