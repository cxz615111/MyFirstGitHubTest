package com.ziyyu.model.service._07_other;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
	private final String username = "ziyuu20160315@gmail.com";
	private final String password = "sa123456789";
	private int port = 587;
	private String host = "smtp.gmail.com";
	
	public boolean sendEmail(String toMailAdd,String mailTitle,String mailBody){
		Properties props = new Properties();
		  props.put("mail.smtp.host", host);
		  props.put("mail.smtp.auth", "true");
		  props.put("mail.smtp.starttls.enable", "true");
		  props.put("mail.smtp.port", port);
		  Session session = Session.getInstance(props, new Authenticator() {
		    protected PasswordAuthentication getPasswordAuthentication() {
		    return new PasswordAuthentication(username, password);
		   }
		  });

		  try {

		   Message message = new MimeMessage(session);
		   message.setFrom(new InternetAddress("ziyuu20160315@gmail.com"));
		   message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toMailAdd));
		   message.setSubject(mailTitle);  //這是信件名稱
		   message.setText(mailBody);  //這是內容

		   Transport transport = session.getTransport("smtp");
		   transport.connect(host, port, username, password);

		   Transport.send(message);

		   return true;

		  } catch (MessagingException e) {	
			  e.printStackTrace();
		      
		  }
		  return false;
		  
		  
		
	}
	
	public static void main(String args[]) {
		
		Email test=new Email();	
		boolean type =test.sendEmail("jerrygod55123@gmail.com", "這是測試，信件標題", "這是本公司信件測試內容，如果成功在試試看用FileInputString,看到請回我，如果是垃圾信請特別告知");  
	    if(type){
	    	System.out.println("傳送成功");
	    }else{
	    	System.out.println("傳送失敗");
	    }
	    
	}
	

}
