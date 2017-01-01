package com.wlxy.test;

import org.easymock.EasyMock;
import org.junit.Test;

import com.wlxy.entity.Business;
import com.wlxy.entity.Business1;
import com.wlxy.service.Service1;

public class Test01 {
	@Test
	public void testMock() {
	Business1 business = new Business1();
	Service1 service1 = EasyMock.createMock("service1", Service1.class);
	business.setService1(service1);
	service1.method2();
	EasyMock.expectLastCall();
	service1.method1();
	EasyMock.expectLastCall();
	EasyMock.replay(service1);
	business.executeService1();
	EasyMock.verify(service1);
	}
}
