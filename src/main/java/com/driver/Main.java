package com.driver;

public class Main {
  class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth()); // Calls the overridden meth() from class B
    
}

  
}
