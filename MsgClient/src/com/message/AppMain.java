package com.message;

import msg.service.MsgService;

import java.util.List;

public class AppMain {
  public static void main(String[] args) {
      List<MsgService> msgServices = MsgService.getInstances();
      System.out.println(msgServices.size());
      for (MsgService msgService : msgServices) {
          msgService.showMessage("A test message");
      }
  }
}