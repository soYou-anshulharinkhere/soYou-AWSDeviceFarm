package com.slack.api;
import com.file.utils.ExternalResourcePath;
import com.file.utils.FileUtility;
import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.methods.request.channels.ChannelsListRequest;
import com.github.seratch.jslack.api.methods.request.chat.ChatPostMessageRequest;
import com.github.seratch.jslack.api.methods.request.files.FilesUploadRequest;
import com.github.seratch.jslack.api.methods.response.channels.ChannelsListResponse;
import com.github.seratch.jslack.api.methods.response.chat.ChatPostMessageResponse;
import com.github.seratch.jslack.api.methods.response.files.FilesUploadResponse;
import com.github.seratch.jslack.api.model.Channel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.github.seratch.jslack.api.methods.SlackApiException;

public class SlackMessenger {


	public static SlackMessenger loadSlackConfigProperty(String slackConfigFile){

		ExternalResourcePath.setSlackConfigPropertyFilePath(slackConfigFile);
		return new SlackMessenger();
	}
	
//	public  void sendTextMessage(String message) throws IOException, SlackApiException{
//		
//		 Slack slack = Slack.getInstance();
//	
//	        ChannelsListResponse channelsResponse = slack.methods().channelsList(ChannelsListRequest.builder().token(SlackConfig.getToken()).build());
//	       
//	        // find #general
////	        Channel general = channelsResponse.getChannels().stream()
////	                .filter(c -> c.getName().equals(SlackConfig.getChannel())).findFirst().get();
////	        System.out.println(SlackConfig.getChannel()); 
//	        //Check whether text message to be sent
//	        if(SlackConfig.isTextMessageToBeSent()){	
//	        	ChatPostMessageResponse postResponse = slack.methods().chatPostMessage(ChatPostMessageRequest.builder()
//	        			.token(SlackConfig.getToken())
//	        			.channel(general.getId())
//	        			.text(message)
//	        			.build());
//	        	 
//  
//	        	if(!postResponse.isOk()){
//	        		System.out.println("Unable to send message in slack channel");
//	        	}
//	        }
//	}

	
//	public  void sendFile() throws IOException, SlackApiException{
//		 Slack slack = Slack.getInstance();
//	
//		 ChannelsListResponse channelsResponse = slack.methods().channelsList(ChannelsListRequest.builder().token(SlackConfig.getToken()).build());		 
//		 // find #general
//		 Channel general = channelsResponse.getChannels().stream()
//				 .filter(c -> c.getName().equals(SlackConfig.getChannel())).findFirst().get();
//
//
//		 List<String> channelList=new ArrayList<String>();
//		 channelList.add(general.getId());
//		 //Check  whether text message to be sent in Slack channel
//		 if(SlackConfig.isTextMessageToBeSent()){
//			 //Check whether file path exist which provided in properties config file
//			 System.out.println(SlackConfig.getFilePath());
//			 if(FileUtility.isFileExist(SlackConfig.getFilePath())){
//				 System.out.println("0987654");
//				 FilesUploadResponse	response = slack.methods().filesUpload(FilesUploadRequest.builder()
//						 .token(SlackConfig.getToken())
//						 .channels(channelList)
//						 .file(new File(SlackConfig.getFilePath()))
//						 .filename(SlackConfig.getFileName())
//						 .initialComment(SlackConfig.getInitialCommnet())
//						 .title(SlackConfig.getTitle())
//						 .build());
//				
//				 if(response.isOk()){
//					 System.out.println("The File ' "+response.getFile().getName()+" 'has been uploaded successfully in slack channel");
//					 
//				 }else{
//					 System.out.println("Unable to upload the file '"+response.getFile().getName()+"' in slack channel");
//				 }
//			 }else{
//				 System.out.println("File not found to be sent . Pleae provide the proper file name");
//			 }
//
//		 }
//
//	}
}
