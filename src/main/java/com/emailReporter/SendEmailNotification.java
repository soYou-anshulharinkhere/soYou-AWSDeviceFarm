package com.emailReporter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import com.sun.mail.util.MailConnectException;
public class SendEmailNotification{

	private static String emailFilePath;
	public   void ComposeGmail(String fromMail,String[] tomail)

	{
		Properties props = new Properties();

		props.put("mail.smtp.host", EmailConfig.get_SMTP_Host_Name());  
		props.put("mail.smtp.socketFactory.port", EmailConfig.get_SMTP_Port_Number());  
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
		props.put("mail.smtp.auth", "true");  
		props.put("mail.smtp.port", EmailConfig.get_SMTP_Port_Number());
		props.put("mail.smtp.starttls.enable","true");



		Session session = Session.getInstance(props,new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(EmailConfig.getAuthenticationEmailID(),EmailConfig.getAuthenticationPassword());}});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromMail));
			InternetAddress[] addressTo = new InternetAddress[tomail.length];
			for (int i = 0; i < tomail.length; i++){

				addressTo[i] = new InternetAddress(tomail[i]);
			}
			message.setRecipients(RecipientType.TO, addressTo); 
			message.setSubject(EmailConfig.getSubject());  

			if(EmailConfig.isAttachmentToSend()){
				if(isFileExist(EmailConfig.getAttchmentFileName())){
					addAttachment(message,readData()); 
				}else{
					
					System.out.println("Attachment File is not found in the given path , Please provide the correct path in EmailConfig.properties file --");
			  
					message.setContent(readData(),"text/html");   
				}
			}else{
				message.setContent(readData(),"text/html");   
			}


			System.out.println("Please wait till we send you the email");
			Transport.send(message);
			System.out.println("======== Email are Sent successfully ========");
		}catch(MailConnectException e){

			System.err.println("There is some problem while sending the email. Please check your internet connection and try again");
			System.out.println("===================================================================================================");
			System.out.println(e);
		} catch (MessagingException ex) {
			throw new RuntimeException(ex);
		}
	}

    private static boolean isFileExist(String filePath){
    	

    	try{
    		
    		File file=new File(filePath);
    		
    		return file.exists();
    		
    	}catch(NullPointerException e){
    	
    		return false;
    	}
    }
	private static void addAttachment(MimeMessage message,String htmlfile) throws MessagingException{

		try{
			BodyPart attachmentBodyPart = new MimeBodyPart();
			Multipart multipart = new MimeMultipart();

			DataSource source = new FileDataSource(EmailConfig.getAttchmentFileName());
			attachmentBodyPart.setDataHandler(new DataHandler(source));
			attachmentBodyPart.setFileName(EmailConfig.getAttchmentFileName());


			multipart.addBodyPart(attachmentBodyPart);
			BodyPart htmlBodyPart = new MimeBodyPart();

			htmlBodyPart.setContent(htmlfile , "text/html"); 
			multipart.addBodyPart(htmlBodyPart);
			
			

			message.setContent(multipart);
		}catch(Exception e){

			System.out.println( e);
		}




	}

	private static String readData(){StringBuilder contentBuilder = new StringBuilder();
	try {
		BufferedReader in = new BufferedReader(new FileReader(emailFilePath));
		String str;
		while ((str = in.readLine()) != null) {
			contentBuilder.append(str);
		}
		in.close();
	} catch (IOException e) {
		System.err.println();
	}
	String content = contentBuilder.toString();
	return content;
	}

	public SendEmailNotification(String outputDirectory ,String reportName){

		emailFilePath=outputDirectory+"/"+reportName;

	}

}