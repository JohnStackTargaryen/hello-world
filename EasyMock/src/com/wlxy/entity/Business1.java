package com.wlxy.entity;

import com.wlxy.service.Service1;
import com.wlxy.service.Service2;

public class Business1 {
private Service1 service1;
private Service2 service2;
public void executeService1() {
service1.method1();
service1.method2();
}
public void executeService1And2() {
service1.method1();
service1.method2();
service2.method3();
service2.method4();
}
public void setService1(Service1 service1) {
this.service1 = service1;
}
public void setService2(Service2 service2) {
this.service2 = service2;
}
}
