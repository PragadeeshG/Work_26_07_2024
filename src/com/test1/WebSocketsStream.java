package com.test1;

public class WebSocketsStream {
	private String streamingCode;
	private String streamingName;
	private String streamingType;
	private String webSocketMessageBroker;
	private String webSocketConfig;
	private String abstractWebSocketMessageBrokerConfigurer;
	private String configureMessageBroker;
	private String enableSimpleBroker;
	private String applicationDestinationPrefixes;
	private String registerStompEndpoints;

	public WebSocketsStream() {

	}

	public WebSocketsStream(String streamingCode, String streamingName, String streamingType,
			String webSocketMessageBroker, String webSocketConfig, String abstractWebSocketMessageBrokerConfigurer,
			String configureMessageBroker, String enableSimpleBroker, String applicationDestinationPrefixes,
			String registerStompEndpoints) {
		super();
		this.streamingCode = streamingCode;
		this.streamingName = streamingName;
		this.streamingType = streamingType;
		this.webSocketMessageBroker = webSocketMessageBroker;
		this.webSocketConfig = webSocketConfig;
		this.abstractWebSocketMessageBrokerConfigurer = abstractWebSocketMessageBrokerConfigurer;
		this.configureMessageBroker = configureMessageBroker;
		this.enableSimpleBroker = enableSimpleBroker;
		this.applicationDestinationPrefixes = applicationDestinationPrefixes;
		this.registerStompEndpoints = registerStompEndpoints;
	}

	public String getStreamingCode() {
		return streamingCode;
	}

	public void setStreamingCode(String streamingCode) {
		this.streamingCode = streamingCode;
	}

	public String getStreamingName() {
		return streamingName;
	}

	public void setStreamingName(String streamingName) {
		this.streamingName = streamingName;
	}

	public String getStreamingType() {
		return streamingType;
	}

	public void setStreamingType(String streamingType) {
		this.streamingType = streamingType;
	}

	public String getWebSocketMessageBroker() {
		return webSocketMessageBroker;
	}

	public void setWebSocketMessageBroker(String webSocketMessageBroker) {
		this.webSocketMessageBroker = webSocketMessageBroker;
	}

	public String getWebSocketConfig() {
		return webSocketConfig;
	}

	public void setWebSocketConfig(String webSocketConfig) {
		this.webSocketConfig = webSocketConfig;
	}

	public String getAbstractWebSocketMessageBrokerConfigurer() {
		return abstractWebSocketMessageBrokerConfigurer;
	}

	public void setAbstractWebSocketMessageBrokerConfigurer(String abstractWebSocketMessageBrokerConfigurer) {
		this.abstractWebSocketMessageBrokerConfigurer = abstractWebSocketMessageBrokerConfigurer;
	}

	public String getConfigureMessageBroker() {
		return configureMessageBroker;
	}

	public void setConfigureMessageBroker(String configureMessageBroker) {
		this.configureMessageBroker = configureMessageBroker;
	}

	public String getEnableSimpleBroker() {
		return enableSimpleBroker;
	}

	public void setEnableSimpleBroker(String enableSimpleBroker) {
		this.enableSimpleBroker = enableSimpleBroker;
	}

	public String getApplicationDestinationPrefixes() {
		return applicationDestinationPrefixes;
	}

	public void setApplicationDestinationPrefixes(String applicationDestinationPrefixes) {
		this.applicationDestinationPrefixes = applicationDestinationPrefixes;
	}

	public String getRegisterStompEndpoints() {
		return registerStompEndpoints;
	}

	public void setRegisterStompEndpoints(String registerStompEndpoints) {
		this.registerStompEndpoints = registerStompEndpoints;
	}

}
