/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.smsapp;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC8a35558f1f7ed99075c76856772f09c3";
  public static final String AUTH_TOKEN = "6d339f43b9661ef129fa670ff8e6f1a6";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+233573570516"),
        new PhoneNumber("+17472325022"), 
        "Popsi this is my sms messenging app i just want you to see it sent from my laptop \n\n\n\n\t MIMI WATER").create();

    
    System.out.println(message.getStatus());
  }
}