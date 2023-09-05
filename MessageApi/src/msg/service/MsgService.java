package msg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface MsgService {

  static List<MsgService> getInstances() {
      ServiceLoader<MsgService> services = ServiceLoader.load(MsgService.class);
      List<MsgService> list = new ArrayList<>();
      services.iterator().forEachRemaining(list::add);
      return list;
  }

  void showMessage(String msg);
}