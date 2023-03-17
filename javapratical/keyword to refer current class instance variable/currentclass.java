/*
8) Write a program of this keyword to refer current class instance variable
and to invoke current class method.
*/


class MyClass {
private int myVar;
public void setMyVar(int myVar) {
this.myVar = myVar; // using 'this' keyword to refer to instance variable
}
public void printMyVar() {
System.out.println("myVar = " + this.myVar); // using 'this' keyword to refer to instance variable
}
public void myMethod() {
System.out.println("Inside myMethod()");
this.printMyVar(); // using 'this' keyword to invoke instance method
}
public static void main(String[] args) {
MyClass obj = new MyClass();
obj.setMyVar(10);
obj.printMyVar();
obj.myMethod();
}
}
