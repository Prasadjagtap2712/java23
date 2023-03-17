/*
9) Create a package Package1 having one class A contains msg method.
Create second package mypack with class B, call msg method of A class in
second package.
*/

A. java //file name
package Package1;
public class A {
public void msg() {
System.out.println("Hello from class A!");
}
}
B. java // file name
package mypack;
import Package1.A;
public class B {
public static void main(String[] args) {
A obj = new A();
obj.msg();
}
}

/*
Complie code
javac -d . Package1/A.java mypack/B.java
java mypack.B



output:
Hello from class A!
*/
