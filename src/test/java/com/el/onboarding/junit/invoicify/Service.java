package com.el.onboarding.junit.invoicify;

public interface Service {
	 String doSomething();
}

class ServiceStub implements Service {
    public String doSomething(){
        return "my stubbed return";
    }
}