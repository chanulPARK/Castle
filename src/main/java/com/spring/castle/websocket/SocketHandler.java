package com.spring.castle.websocket;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;


public class SocketHandler extends TextWebSocketHandler 
{

	private List<WebSocketSession> sessionList=new ArrayList();
	private Logger logger=LoggerFactory.getLogger(SocketHandler.class);
	
/*
	
	@Override
	//사용자 연결이 되면 실행되는 메소드
	//채팅방에 입장을 하면 session을 부여하는 곳이라고 보면 됨 
	public void afterConnectionEstablished(WebSocketSession session) throws Exception 
	{
		//server접속했을때 부여하는 sessionId값이랑 다름
		//logger.info("접속한 사용자 : "+session);
		sessionList.add(session);
		//server의 session객체에 저장되어있는 값을 불러오기!
		//spring security가 적용되어있어야함! 
		Member login=(Member)session.getAttributes().get("memberLoggedIn");
		//채팅방입장하면 상대방에게 입장메세지를 출력
		for(WebSocketSession s : sessionList)
		{
			if(s==session) continue;
			s.sendMessage(new TextMessage(login.getUserId()+"님이 입장하셨습니다.!"));
		}
		
		//super.afterConnectionEstablished(session);
	}

	@Override
	//메세지를 sessionList인원들에게 전송!
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		
		Member login = (Member)session.getAttributes().get("memberLoggedIn");
		
		for(WebSocketSession s : sessionList)
		{
			//보내는 순서를 정확하게 기억을 해야함 "|"구분자로 
			
			//배열로 처리한 다음 페이지를 변경
			
			s.sendMessage(new TextMessage(login.getUserId()+"|"+message.getPayload()+"|"+session.getRemoteAddress()));
		}
		
		//super.handleTextMessage(session, message);
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception 
	{
		sessionList.remove(session);
		
		Member login = (Member)session.getAttributes().get("memberLoggedIn");
		for(WebSocketSession s : sessionList)
		{
			s.sendMessage(new TextMessage(login.getUserId()+"님이 퇴장하셨습니다."));
		}
		
		//super.afterConnectionClosed(session, status);
	}

	*/
	
}
