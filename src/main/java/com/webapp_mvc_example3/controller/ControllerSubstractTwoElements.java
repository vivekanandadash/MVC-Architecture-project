package com.webapp_mvc_example3.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.webapp_mvc_example3.model.ModelSubstractTwoElements;


@WebServlet("/substract")
public class ControllerSubstractTwoElements extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControllerSubstractTwoElements() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String fn = request.getParameter("FirstNumber");
			String sn = request.getParameter("SecondtNumber");
			if(fn==null || fn.trim().equals("")||
			   sn==null || sn.trim().equals("")) {
				request.setAttribute("result", "Please fill the input box to get the Answer");
				RequestDispatcher rd = request.getRequestDispatcher("ViewSubstractTwoElements.jsp");
				rd.forward(request, response);
				return;
			}
			int FirstNumber = Integer.parseInt(fn);
			int SecondtNumber = Integer.parseInt(sn);
			
			ModelSubstractTwoElements mste = new ModelSubstractTwoElements();
			int result = mste.substractTwoValues(FirstNumber,SecondtNumber);
			request.setAttribute("result", result);
			RequestDispatcher rd = request.getRequestDispatcher("ViewSubstractTwoElements.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("result", "Something went wrong");
			RequestDispatcher rd = request.getRequestDispatcher("ViewSubstractTwoElements.jsp");
			rd.forward(request, response);
		}
			
		}
		   
	}


