package kr.or.kosa.service;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.action.Action;
import kr.or.kosa.action.ActionForward;
import kr.or.kosa.dao.MemoDao;
import kr.or.kosa.dto.Memo;

public class MemoListOkServiceAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		MemoDao dao = new MemoDao();
    	try {
			List<Memo> memolist = dao.getMemoList();
			request.setAttribute("memolist", memolist);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ActionForward forward = new ActionForward();
		forward.setRedirect(false); //forward 방식으로
		forward.setPath("/memolist.jsp");
    	return forward;
	}

}
