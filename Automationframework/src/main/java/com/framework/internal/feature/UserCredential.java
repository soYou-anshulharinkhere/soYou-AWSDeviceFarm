package com.framework.internal.feature;

import java.io.IOException;

import com.file.utils.FileUtility;
import com.file.utils.PropertiesFileReader;

public enum UserCredential {
	
	ADMIN_USER("admin_userid", "admin_password"),
    TEST_USER("test_userid", "test_password"),
    INVALID_USER("invalid_userid", "invalid_password"),
    UNAUTHORIZED_USER("unauthorized_userid", "unauthorized_password"),
    OTHER_USER("other_userid","other_password");

    final String  filePath=FileUtility.getTestResourceFilePath()+"/externalresource/login_credential.properties";
    private String login;
    private String password;

    UserCredential(String loginkey, String passwordkey) {
    	try{
    		this.login = PropertiesFileReader.getPropertyValue(filePath, loginkey);
    		this.password = PropertiesFileReader.getPropertyValue(filePath, passwordkey);;
    	}catch(IOException e){

    	}
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public String getValue(){
    	
    	return "";
    }
}
