package com.inti.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.inti.dao.interfaces.IEmployeDAO;
import com.inti.entities.Employe;
import com.inti.utils.HibernateUtility;

public class EmployeDAO extends ManagerDAO<Employe> implements IEmployeDAO{
	Session s = HibernateUtility.getSessionFactory().openSession();
	@Override
	public Employe getEmployeByLoginAndPassword(String login, String pwd) {
		Criteria criteria = s.createCriteria(Employe.class);
		criteria.add(Restrictions.eq("username",login));
		criteria.add(Restrictions.eq("password",pwd));
		return (Employe) criteria.uniqueResult(); 
		// select * from employe where username = oussama and password = ayari
	}

	@Override
	public Employe getEmployeByLogin(String login) {
		Criteria criteria = s.createCriteria(Employe.class);
		criteria.add(Restrictions.eq("username",login));
		return (Employe) criteria.uniqueResult(); 
	}
	
}
