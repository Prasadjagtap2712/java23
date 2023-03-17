/*
10) Write a program of interface draw having one method, which implements
from two classes ABC and PQR with same method name.
*/


interface Drawable {
void draw();
}
class ABC implements Drawable {
public void draw() {
System.out.println("Drawing from ABC class");
}
}
class PQR implements Drawable {
public void draw() {
System.out.println("Drawing from PQR class");
}
}
class InterfaceDemo {
public static void main(String[] args) {
Drawable obj1 = new ABC();
Drawable obj2 = new PQR();
obj1.draw();
obj2.draw();
}}
