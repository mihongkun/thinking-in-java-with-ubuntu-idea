package com.mihk.ch11;

interface Interface {
    void doSomething();

    void somethingElse(String args);
}

class RealObject implements Interface {
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("somethingElse " + args);
    }
}

class SimpleProxy implements Interface {

    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("SimpleProxy somethingElse " + args);
        proxied.somethingElse(args);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface i) {
        i.doSomething();
        i.somethingElse("bonobo");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}