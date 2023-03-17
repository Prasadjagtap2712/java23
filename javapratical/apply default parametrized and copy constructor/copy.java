/*
7 ) Write a program of Constructor of accept two numbers and apply default,
parametrized and copy constructor by display that numbers. (pass values by
scanner)
*/


import java.lang.*;
class calc
{
int no1, no2;
calc(int a, int b)
{
no1 = a; // 30
no2 = b; // 10
}
/*
public void assign(int a, int b)
{
no1 = a; // 30
no2 = b; // 10
}
*/
public void sum()
{
System.out.println("Sum of "+no1+" and "+no2+" is "+(no1+no2));
}
}
class add
{
public static void main(String args[])
{
/* calc c; // object declaration. It will have null in it.
c = new calc(20,10); // Construction call
*/
calc c = new calc(30, 10);
//c.assign(30,10);
c.sum();
}
}
