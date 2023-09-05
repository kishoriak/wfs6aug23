package msg.provider;

import msg.service.MsgService;


public class MsgServiceImpl implements MsgService{
  @Override
  public void showMessage(String msg) {
      //JOptionPane.showMessageDialog(null, msg);
	  System.out.println("in implementation showmsg");
  }
}