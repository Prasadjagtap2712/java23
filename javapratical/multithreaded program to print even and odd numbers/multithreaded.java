/*
14) Write a multithreaded program to print even and odd numbers. Create
two threads, one thread prints even number and second thread prints odd
number.
*/

class PrintNumbers implements Runnable {
private int start;
private int end;
private boolean isEven;
public PrintNumbers(int start, int end, boolean isEven) {
this.start = start;
this.end = end;
this.isEven = isEven;
}
public void run() {
for (int i = start; i <= end; i++) {
if (isEven && i % 2 == 0) {
System.out.println(i);
} else if (!isEven && i % 2 != 0) {
System.out.println(i);
}
}
}
}
class Main {
public static void main(String[] args) {
// Create two threads, one for even numbers and one for odd numbers
Thread t1 = new Thread(new PrintNumbers(1, 10, true));
Thread t2 = new Thread(new PrintNumbers(1, 10, false));
// Start both threads
t1.start();
t2.start();
}
}
