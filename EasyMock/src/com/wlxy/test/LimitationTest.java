package com.wlxy.test;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Before;
import org.junit.Test;

import com.wlxy.entity.Business;
import com.wlxy.service.Service;

public class LimitationTest {
private Business business;
private IMocksControl mocksControl;
private Service service;
@Before
public void init() {
business = new Business();
mocksControl = EasyMock.createStrictControl();
service = mocksControl.createMock(Service.class);
business.setService(service);
}
@Test
public void testDefaultBehavior() {
business.execute();
}
@Test
public void testCustomizedBehavior() {
EasyMock.expect(service.toString()).andReturn("Customized toString");
EasyMock.expect(service.hashCode()).andReturn(100000);
mocksControl.replay();
business.execute();
mocksControl.verify();
}
}