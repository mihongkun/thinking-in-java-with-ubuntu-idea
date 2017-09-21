package com.mihk.ch11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodSelector implements InvocationHandler {
    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
