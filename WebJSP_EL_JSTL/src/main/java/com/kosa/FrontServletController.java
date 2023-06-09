package com.kosa;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/action.do")
public class FrontServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FrontServletController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String cmd = request.getParameter("cmd");
		
		String rms = null;
		Message ms = null;
		
		if (cmd.equals("greeting")) {
			ms = new Message();
			rms = ms.getMessage(cmd);
		}
		
		request.setAttribute("result", rms);
		request.setAttribute("result2", ms);
		
		RequestDispatcher dis = request.getRequestDispatcher("/greeting.jsp");
		
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
