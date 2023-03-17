class Example {
private int number; // private modifier
public static final double PI = 3.14; // static final modifier
public Example(int number) {
this.number = number;
}
public void printNumber() {
System.out.println("Number: " + number);
}
public static void main(String[] args) {
Example example = new Example(42);
example.printNumber();
System.out.println("PI: " + Example.PI);
}
}
