package com.mihk.ch10;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactories {
    Service getService();
}

class Implementation1 implements Service {

    @Override
    public void method1() {
        System.out.println("Implementation1 method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2()");
    }

    public  static  ServiceFactories factories = new ServiceFactories() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };

}

class Implenemtation2 implements Service {
    @Override
    public void method1() {
        System.out.println("Implementation2 method1()");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2()");
    }
    public  static  ServiceFactories factories = new ServiceFactories() {
        @Override
        public Service getService() {
            return new Implenemtation2();
        }
    };
}





public class Factories {
    public static void serviceConsumer(ServiceFactories factories){
        Service service = factories.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factories);
        serviceConsumer(Implenemtation2.factories);
    }
}
