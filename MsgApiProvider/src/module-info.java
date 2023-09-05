module MsgApiProvider {
	requires MessageApi;
	requires java.desktop;
	 provides msg.service.MsgService with msg.provider.MsgServiceImpl;
	
}