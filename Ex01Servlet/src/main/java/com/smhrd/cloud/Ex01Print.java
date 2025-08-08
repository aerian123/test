package com.smhrd.cloud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ex01Print")
public class Ex01Print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//클라이언트에게 HTML문서를 전송하도록 형식을 정의
		//+문자인코딩 설정
		response.setContentType("text/html; charset=UTF-8");
		
		// 문자열(텍스트)을 보내기 위한 통로 -> PrintWriter
		// 서버가 클라이언트에게 텍스트를 보내는 것 -> 응답(response)
		// response.getWriter() : PrinwWriter 객체(통로)를 생성
		PrintWriter out = response.getWriter();
	
		out.print("<html>");
		out.print("<head><title>Servlet실습</title></head>");
		out.print("<body>");
		out.print("8시 30분");
		out.print("</body>");
		out.print("</html>");
	}

}
