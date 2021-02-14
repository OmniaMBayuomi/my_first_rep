package com.omnia;


import java.io.IOException;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.omnia.entities.*;
import com.omnia.entities.Class;
import com.omnia.enums.EmployeeState;
import com.omnia.enums.Gender;
import com.omnia.enums.MaritalStatus;
import com.omnia.enums.WorkType;

@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
      	EntityManager em = emf.createEntityManager();
      	
      	Class cl = new Class();
      	cl.setClassNameEn("Test");
      	cl.setClassNameAr("Test");
        cl.setAgeRangeBegin((float)1.5);
        cl.setAgeRangeEnd((float)2);
        cl.setClassCode("Cl04");
        cl.setRoomNumber(6);
        
        em.getTransaction().begin();
        em.persist(cl);
        em.getTransaction().commit();
	}
}
