/*
6) Write a program to create Dmart class with accepting values of product id,
name, rate and quantity and calculate payable amount with discount.
If Amt : 5000-3000 =20 %, if Amt: 3000-2000 =15%, if Amt 2000-1000=10%,
Otherwise no discount.
*/

import java.util.Scanner;
class Dmart {
private int productId;
private String productName;
private double rate;
private int quantity;
public Dmart(int productId, String productName, double rate, int quantity) {
this.productId = productId;
this.productName = productName;
this.rate = rate;
this.quantity = quantity;
}
public double calculatePayableAmount() {
double amount = rate * quantity;
double discount = 0;
if (amount >= 5000) {
discount = 0.2;
} else if (amount >= 3000) {
discount = 0.15;
} else if (amount >= 2000) {
discount = 0.1;
}
double payableAmount = amount - (amount * discount);
return payableAmount;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter product ID: ");
int productId = scanner.nextInt();
System.out.print("Enter product name: ");
String productName = scanner.next();
System.out.print("Enter product rate: ");
double rate = scanner.nextDouble();
System.out.print("Enter product quantity: ");
int quantity = scanner.nextInt();
Dmart dmart = new Dmart(productId, productName, rate, quantity);
double payableAmount = dmart.calculatePayableAmount();
System.out.println("Payable amount with discount: " + payableAmount);
}
}
