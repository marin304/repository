package com.inti.service.interfaces;

import com.inti.entities.Employe;

public interface IEmployeService extends IService<Employe>{
	Employe getEmployeByLoginAndPassword(String login, String pwd);

	Employe getEmployeByLogin(String login);
}
