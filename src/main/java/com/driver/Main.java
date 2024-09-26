package com.driver;
  public class Main {
    public static class A{
      String meth(){
        return "Invoking method from class A";
      }
    }
      public static class B{
        String meth(){
          return "Method is overridden in Extendend class B";
        }
      }
  
    public static void main(String[] args) {
        B objB = new B();
        objB.meth();
      // Calls the overridden meth() from class B
      B objc = new B();
      objc.meth();
    }
    
}
    

  
}
