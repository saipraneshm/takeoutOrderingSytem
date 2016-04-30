package com.cmpe.finalproject.dao;

/***************************************************************
 * Author : Srihaar
 * Description: This interface is responsible for handling 
 * database related operations.
 ***************************************************************/

import java.sql.SQLException;

import com.cmpe.finalproject.model.Ordering;


public interface OrderingDao {

    public String store(Ordering profile) throws SQLException;
    public String delete(String userid) throws SQLException;
    public Ordering findById(String id);
}
