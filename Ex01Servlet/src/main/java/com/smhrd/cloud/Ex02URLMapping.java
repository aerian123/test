package com.smhrd.cloud;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//URL Mapping 어노테이션
// -Java 파일을 실행하기 위한 경로를 문자열로 지정
// -문자열 경로는 Java파일명과 다르게 지정
@WebServlet("/URL")
public class Ex02URLMapping extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
