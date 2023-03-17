import java.util.*;
class SBI_Bank { int cust_id;
String cust_name; String cust_city; long mob_num; long acc_num; double acc_amt;
SBI_Bank(int id, String name, String city, long num, long acc, double amt) { cust_id = id;
cust_name = name; cust_city = city; mob_num = num; acc_num = acc; acc_amt = amt;
}
void display() {
System.out.println("Customer ID: " + cust_id); System.out.println("Customer Name: " + cust_name);
System.out.println("Customer City: " + cust_city); System.out.println("Mobile Number: " + mob_num);
System.out.println("Account Number: " + acc_num);
System.out.println("Account Amount: " + acc_amt);
}
}
class Account_info extends SBI_Bank {
Account_info(int id, String name, String city, long num, long acc, double amt) { super(id, name, city, num, acc,
amt);
}
void calculateTotalAmount() {
double total = acc_amt + (acc_amt * 0.12); System.out.println("Total amount with interest: " + total);
}
}
class Main {
public static void main(String[] args) {
ArrayList<SBI_Bank> bankList = new ArrayList<SBI_Bank>();
SBI_Bank bank1 = new SBI_Bank(1, "sourabh", "mumbai", 99758, 8735478, 6000.00);
bankList.add(bank1);
SBI_Bank bank2 = new SBI_Bank(2, "rushi", "delhi", 8765432, 7643284, 50000.00);
bankList.add(bank2);
SBI_Bank bank3 = new SBI_Bank(3, "rahul", "kolkata", 7654327, 5478845, 7800.00);
bankList.add(bank3);
for (SBI_Bank bank : bankList) { bank.display();
Account_info acc = new Account_info(bank.cust_id, bank.cust_name, bank.cust_city, bank.mob_num,
bank.acc_num, bank.acc_amt);
acc.calculateTotalAmount();
System.out.println();
}

}
}
