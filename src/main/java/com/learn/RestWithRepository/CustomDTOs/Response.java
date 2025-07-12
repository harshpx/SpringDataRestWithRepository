package com.learn.RestWithRepository.CustomDTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {
  // fields
  private int status;
  private boolean success;
  private T response;
  private long timeStamp;
  // constructors
  public Response() {
    // if nothing is passed, just set timestamp
    this.timeStamp = System.currentTimeMillis();
  }
  public Response(T data) {
    // if only data is sent, treat it as success
    this.timeStamp = System.currentTimeMillis();
    this.status = 200;
    this.success = true;
    this.response = data;
  }
  public Response(T data, int status) {
    // if status and data is passed, set responseType accordingly
    this.timeStamp = System.currentTimeMillis();
    this.status = status;
    this.response = data;
    if (status >= 400) this.success = false;
    else this.success = true;
  }
  public Response(T data, int status, boolean success) {
    // if everything is passed, set accordingly
    this.timeStamp = System.currentTimeMillis();
    this.status = status;
    this.response = data;
    this.success = success;
  }
}

