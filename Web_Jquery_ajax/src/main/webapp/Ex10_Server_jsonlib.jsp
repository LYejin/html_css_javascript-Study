<%@page import="net.sf.json.JSONArray"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="net.sf.json.JSONObject"%>
<%@page import="kr.or.kosa.dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//객체를 json 변환
	// 1. JSONObject 사용 >> {} 객체 하나 자동 생성
	// 2. JSONArray 사용  >> [{},{},...{}]
	
	//class 가지고 생성
	Member member = new Member();
	
	JSONObject obj = JSONObject.fromObject(member);
%>
<%=obj%>
<hr>
<%
List<Member> list = new ArrayList<>();
list.add(new Member("hong","1004","서울시 강남구","0"));
list.add(new Member("kim","1004","서울시 강남구","1"));
list.add(new Member("park","1004","서울시 강남구","2"));

JSONArray memberArray = JSONArray.fromObject(list);
%>
<%=memberArray %>
