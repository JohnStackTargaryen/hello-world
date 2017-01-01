package com.wlxy.entity;

import com.wlxy.service.Service;

public class Business {
private Service service;
public void execute() {
System.out.println("service.toString() = " + service.toString());
System.out.println("service.hashCode() = " + service.hashCode());
}
public void setService(Service service) {
this.service = service;
}
}