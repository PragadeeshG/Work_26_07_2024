package com.test1;

public class RestfullStream {
	private String streamingCode;
	private String streamingResponseBody;
	private boolean writeTo;
	private Integer outputStream;
	private String requestMappingHandlerAdapter;
	private String asynchronous;
	private String taskExecutor;
	private String exception;
	private String annotation;
	private Integer servletsId;
	private String servletName;
	private String serverSentEvent;
	private String clientRecievedEvent;

	public RestfullStream() {

	}

	public RestfullStream(String streamingCode, String streamingResponseBody, boolean writeTo, Integer outputStream,
			String requestMappingHandlerAdapter, String asynchronous, String taskExecutor, String exception,
			String annotation, Integer servletsId, String servletName, String serverSentEvent,
			String clientRecievedEvent) {
		super();
		this.streamingCode = streamingCode;
		this.streamingResponseBody = streamingResponseBody;
		this.writeTo = writeTo;
		this.outputStream = outputStream;
		this.requestMappingHandlerAdapter = requestMappingHandlerAdapter;
		this.asynchronous = asynchronous;
		this.taskExecutor = taskExecutor;
		this.exception = exception;
		this.annotation = annotation;
		this.servletsId = servletsId;
		this.servletName = servletName;
		this.serverSentEvent = serverSentEvent;
		this.clientRecievedEvent = clientRecievedEvent;
	}

	public String getStreamingCode() {
		return streamingCode;
	}

	public void setStreamingCode(String streamingCode) {
		this.streamingCode = streamingCode;
	}

	public String getStreamingResponseBody() {
		return streamingResponseBody;
	}

	public void setStreamingResponseBody(String streamingResponseBody) {
		this.streamingResponseBody = streamingResponseBody;
	}

	public boolean isWriteTo() {
		return writeTo;
	}

	public void setWriteTo(boolean writeTo) {
		this.writeTo = writeTo;
	}

	public Integer getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(Integer outputStream) {
		this.outputStream = outputStream;
	}

	public String getRequestMappingHandlerAdapter() {
		return requestMappingHandlerAdapter;
	}

	public void setRequestMappingHandlerAdapter(String requestMappingHandlerAdapter) {
		this.requestMappingHandlerAdapter = requestMappingHandlerAdapter;
	}

	public String getAsynchronous() {
		return asynchronous;
	}

	public void setAsynchronous(String asynchronous) {
		this.asynchronous = asynchronous;
	}

	public String getTaskExecutor() {
		return taskExecutor;
	}

	public void setTaskExecutor(String taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public Integer getServletsId() {
		return servletsId;
	}

	public void setServletsId(Integer servletsId) {
		this.servletsId = servletsId;
	}

	public String getServletName() {
		return servletName;
	}

	public void setServletName(String servletName) {
		this.servletName = servletName;
	}

	public String getServerSentEvent() {
		return serverSentEvent;
	}

	public void setServerSentEvent(String serverSentEvent) {
		this.serverSentEvent = serverSentEvent;
	}

	public String getClientRecievedEvent() {
		return clientRecievedEvent;
	}

	public void setClientRecievedEvent(String clientRecievedEvent) {
		this.clientRecievedEvent = clientRecievedEvent;
	}

}
