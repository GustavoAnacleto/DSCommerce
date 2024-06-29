package com.guganascimento.dscommerce.dto;

import java.time.Instant;

public class CustomError {
	
	private Instant timetamp;
	private Integer status;
	private String error;
	private String path;
	
	public CustomError(Instant timetamp, Integer status, String error, String path) {
		super();
		this.timetamp = timetamp;
		this.status = status;
		this.error = error;
		this.path = path;
	}

	public Instant getTimetamp() {
		return timetamp;
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getPath() {
		return path;
	}
	
	
    

}
