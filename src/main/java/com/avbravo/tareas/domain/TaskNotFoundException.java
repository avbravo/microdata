package com.avbravo.tareas.domain;

public class TaskNotFoundException extends RuntimeException {

	public TaskNotFoundException(Long postId) {
		super(String.format("post id:%s not found!", postId));
	}

}
