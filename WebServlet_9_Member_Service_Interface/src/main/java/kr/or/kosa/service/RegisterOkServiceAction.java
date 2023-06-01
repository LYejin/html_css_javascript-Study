package kr.or.kosa.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dao.RegisterDao;
import kr.or.kosa.dto.RegisterDto;

public class RegisterOkServiceAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		 int id = Integer.parseInt(request.getParameter("id"));
	  	    String pwd = request.getParameter("pwd");
	  	    String email = request.getParameter("email");
	  	    
			RegisterDao rdo = new RegisterDao();
			
			int row = rdo.writeOk(new RegisterDto(id, pwd, email)); // try catch 문 insert에 걸어서 실행된다.(같은 값 걸어도)
			
			String resultdata = "";
			if (row > 0) {
				resultdata = "welcome to kosa" + id + "님";
			} else {
				resultdata = "Insert Fail ... retry ...";
			}
			// 데이터 저장
			request.setAttribute("resultdata", resultdata);
			
			// 뷰 설정하기
			//viewpage = "/WEB-INF/views/register/register_welcome.jsp";
			//ActionForward 객체를 통해(viewpage: redirect, forward) 지정, 경로 설정
			ActionForward forward = new ActionForward();
			forward.setRedirect(false); //forward 방식으로
			forward.setPath("/WEB-INF/views/register/register_welcome.jsp");
			return forward;
	}
	
}