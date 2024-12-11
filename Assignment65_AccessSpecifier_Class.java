package test;

//Class with different access specifiers
class AccessSpecifierDemo {
 // Private variable - accessible only within this class
 private int privateVar = 10;

 // Default variable - accessible within this package
 int defaultVar = 20;

 // Protected variable - accessible within this package and subclasses
 protected int protectedVar = 30;

 // Public variable - accessible from anywhere
 public int publicVar = 40;

 // Private method - accessible only within this class
 private void privateMethod() {
     System.out.println("Private Method: " + privateVar);
 }

 // Default method - accessible within this package
 void defaultMethod() {
     System.out.println("Default Method: " + defaultVar);
 }

 // Protected method - accessible within this package and subclasses
 protected void protectedMethod() {
     System.out.println("Protected Method: " + protectedVar);
 }

 // Public method - accessible from anywhere
 public void publicMethod() {
     System.out.println("Public Method: " + publicVar);
 }

 // Method to demonstrate access within the same class
 public void demonstrateAccess() {
     privateMethod();
     defaultMethod();
     protectedMethod();
     publicMethod();
 }
}

public class Assignment65_AccessSpecifier_Class {
//Class in the same package to demonstrate access
 public static void main(String[] args) {
     AccessSpecifierDemo obj = new AccessSpecifierDemo();

     // Accessing variables
     // System.out.println("Private Variable: " + obj.privateVar); // Not accessible
     System.out.println("Default Variable: " + obj.defaultVar);
     System.out.println("Protected Variable: " + obj.protectedVar);
     System.out.println("Public Variable: " + obj.publicVar);

     // Accessing methods
     // obj.privateMethod(); // Not accessible
     obj.defaultMethod();
     obj.protectedMethod();
     obj.publicMethod();
 }
}
