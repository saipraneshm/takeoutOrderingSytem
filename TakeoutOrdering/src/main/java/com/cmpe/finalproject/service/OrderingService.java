package com.cmpe.finalproject.service;

import com.cmpe.finalproject.model.Ordering;

public interface OrderingService {

	public String create(Ordering profile);
	public String update(Ordering profile);
	public String delete(String userid);
	public Ordering findById(String id);

}
