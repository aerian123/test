package com.smhrd.cloud;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//URL-Mapping 어노테이션
// - 사용자가 요청한 경로와 실제 실행할 파일을 연결해주는 기능
@WebServlet("/Ex00FirstServlet")
public class Ex00FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 최초 한번 호출: 초기화가 필요한 로직을 처리
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init() 실행!");
		//이부분 추가해주세요
		// 어떤 부분이신지 정확하게 이야기 해주세요.
	}
	
	//사용자의 요청 및 응답 처리
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 실행!");
		
		String ip = request.getRemoteAddr();
		
		System.out.println("접속한 ip주소 : "+ip);
	}
	
	//서버가 중단될 때 실행 : 지원을 해제하는 로직을 처리
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("destroy() 실행!");
	
	}
}
