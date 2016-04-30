package com.cmpe.finalproject.service;

import com.cmpe.finalproject.dao.OrderingDao;
import com.cmpe.finalproject.model.Ordering;

public class OrderingImpl implements OrderingService {
	
	
	OrderingDao profileDao;
	
	public OrderingImpl(OrderingDao profileDao) {
		this.profileDao = profileDao;
	}

	@Override
	public String create(Ordering profile) {
		// TODO Auto-generated method stub
		try{
			return profileDao.store(profile);
		}catch(Exception e){
			System.out.println(e);
			return "fail";
		}
		
	}

	@Override
	public String update(Ordering profile) {
		// TODO Auto-generated method stub
		try{
			return profileDao.store(profile);
		}catch(Exception e){
			System.out.println(e);
			return "fail";
		}
		
	}

	@Override
	public String delete(String userid) {
		// TODO Auto-generated method stub
		try{
			return profileDao.delete(userid);
		}catch(Exception e){
			System.out.println(e);
			return "fail";
		}
		
	}

	@Override
	public Ordering findById(String id) {
		try{
			return profileDao.findById(id);
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
		
	}

}
