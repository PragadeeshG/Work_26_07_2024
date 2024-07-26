package com.test1;

public class StreamResponseBody {
	private String streamingCode;
	private Integer webSocketConfigurer;
	private String registerWebSocketHandlers;
	private String webSocketHandlerRegistry;
	private String addHandler;
	private String webSocketHandler;
	private String setAllowedOrigins;
	private String websocket;
	private String configuration;
	private String enableWebSocket;
	private String webSocketMessage;
	private String webSocketSession;
	private String textWebSocketHandler;
	private String payload;

	public StreamResponseBody() {

	}

	public StreamResponseBody(String streamingCode, Integer webSocketConfigurer, String registerWebSocketHandlers,
			String webSocketHandlerRegistry, String addHandler, String webSocketHandler, String setAllowedOrigins,
			String websocket, String configuration, String enableWebSocket, String webSocketMessage,
			String webSocketSession, String textWebSocketHandler, String payload) {
		super();
		this.streamingCode = streamingCode;
		this.webSocketConfigurer = webSocketConfigurer;
		this.registerWebSocketHandlers = registerWebSocketHandlers;
		this.webSocketHandlerRegistry = webSocketHandlerRegistry;
		this.addHandler = addHandler;
		this.webSocketHandler = webSocketHandler;
		this.setAllowedOrigins = setAllowedOrigins;
		this.websocket = websocket;
		this.configuration = configuration;
		this.enableWebSocket = enableWebSocket;
		this.webSocketMessage = webSocketMessage;
		this.webSocketSession = webSocketSession;
		this.textWebSocketHandler = textWebSocketHandler;
		this.payload = payload;
	}

	public String getStreamingCode() {
		return streamingCode;
	}

	public void setStreamingCode(String streamingCode) {
		this.streamingCode = streamingCode;
	}

	public Integer getWebSocketConfigurer() {
		return webSocketConfigurer;
	}

	public void setWebSocketConfigurer(Integer webSocketConfigurer) {
		this.webSocketConfigurer = webSocketConfigurer;
	}

	public String getRegisterWebSocketHandlers() {
		return registerWebSocketHandlers;
	}

	public void setRegisterWebSocketHandlers(String registerWebSocketHandlers) {
		this.registerWebSocketHandlers = registerWebSocketHandlers;
	}

	public String getWebSocketHandlerRegistry() {
		return webSocketHandlerRegistry;
	}

	public void setWebSocketHandlerRegistry(String webSocketHandlerRegistry) {
		this.webSocketHandlerRegistry = webSocketHandlerRegistry;
	}

	public String getAddHandler() {
		return addHandler;
	}

	public void setAddHandler(String addHandler) {
		this.addHandler = addHandler;
	}

	public String getWebSocketHandler() {
		return webSocketHandler;
	}

	public void setWebSocketHandler(String webSocketHandler) {
		this.webSocketHandler = webSocketHandler;
	}

	public String getSetAllowedOrigins() {
		return setAllowedOrigins;
	}

	public void setSetAllowedOrigins(String setAllowedOrigins) {
		this.setAllowedOrigins = setAllowedOrigins;
	}

	public String getWebsocket() {
		return websocket;
	}

	public void setWebsocket(String websocket) {
		this.websocket = websocket;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getEnableWebSocket() {
		return enableWebSocket;
	}

	public void setEnableWebSocket(String enableWebSocket) {
		this.enableWebSocket = enableWebSocket;
	}

	public String getWebSocketMessage() {
		return webSocketMessage;
	}

	public void setWebSocketMessage(String webSocketMessage) {
		this.webSocketMessage = webSocketMessage;
	}

	public String getWebSocketSession() {
		return webSocketSession;
	}

	public void setWebSocketSession(String webSocketSession) {
		this.webSocketSession = webSocketSession;
	}

	public String getTextWebSocketHandler() {
		return textWebSocketHandler;
	}

	public void setTextWebSocketHandler(String textWebSocketHandler) {
		this.textWebSocketHandler = textWebSocketHandler;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}
