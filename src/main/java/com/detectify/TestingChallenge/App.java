package com.detectify.TestingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

//import org.junit.*;
//import static org.junit.Assert.*;

/**
 * 
 * Unit test for simple App.
 */
public class App
    
{
      public static void main(String args[]) throws JsonProcessingException{
    	  
    	  String url1 = "https://hooks.slack.com/services/TXXXXXXXX/BXXXXXXXX/YYYYYYYYYYYYYYYYYYYYYYYY" ;
    	  String url2 = "//hooks.slack.com/services/TXXXXXXXX/BXXXXXXXX/YYYYYYYYYYYYYYYYYYYYYYYY" ;
     	 
    	  List<String> message_types1 = Arrays.asList("ScanStarted","ScanFinished",
    			  									  "VulnCritical","VulnMedium",
    			  									   "VulnNotice");
     	 
    	  List<String> message_types2 = Arrays.asList("ScanStarted","ScanFinished");

    	  List<String> message_types3 = Arrays.asList("VulnCritical","VulnMedium","VulnNotice");
    	  List<String> message_types4 = Arrays.asList("VulnNotice");
    	  
    	Hook hook1 = new Hook(url1,	message_types1);
    	Hook hook2 = new Hook(url1,	message_types2);
    	Hook hook3 = new Hook(url1,	message_types3);
    	Hook hook4 = new Hook(url1,	message_types4);
    	Hook hook5 = new Hook(url2,	message_types1);
    	
    	List hooks1 = new ArrayList<Hook>();
    	hooks1.add(hook1);
    	
    	List hooks2 = new ArrayList<Hook>();
    	hooks2.add(hook2);
    //	hooks2.add(hook3);
    	
    	List hooks3 = new ArrayList<Hook>();
    	hooks3.add(hook3);
    	hooks3.add(hook4);
    	
    	List hooks4 = new ArrayList<Hook>(); /// wrong URL
    	hooks4.add(hook5);
    	  
   	 	 int targetId = 11111;
    	 int targetId1 = 0;
    	 String targetId2 = "12345";
    	 Setting setting1 = new Setting(targetId,hooks1);
    	 Setting setting2 = new Setting(targetId1,hooks2);
    	 Setting setting3 = new Setting(targetId1,hooks3);
    	 Setting setting4 = new Setting(targetId1,hooks4);
    	 
    	 SettingStr setting33 = new SettingStr(targetId2,hooks4);
    	 
    	
    	 
    	 
    	 WebClient.getStatus();
    	 WebClient.testSettings(setting1.getTarget_id());
    	 WebClient.loadSettings(setting1.getTarget_id());
    	 WebClient.saveSettings(setting1);
    	 WebClient.testSettings(setting1.getTarget_id());
    	 WebClient.loadSettings(setting1.getTarget_id());
    	 WebClient.deleteSettings(setting1.getTarget_id());
    	 WebClient.loadSettings(setting1.getTarget_id());
    	 

    	 WebClient.saveSettingsStr(setting33);
    	 
    	 WebClient.saveSettings(setting2);
    	 WebClient.deleteSettings(setting2.getTarget_id());
    	 
    	 WebClient.saveSettings(setting3);
    	 WebClient.deleteSettings(setting3.getTarget_id());
    	  
      }
	
	
	
	
}
