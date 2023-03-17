/*
11) Write Java Program to Demonstrate Arrays Class with any 5 Methods.
import java.util.Arrays;
*/


class Main1 {
public static void main(String[] args)
{
// Get the Arrays
int intArr[] = { 10, 20, 15, 22, 35 };
// Get the second Arrays
int intArr1[] = { 10, 15, 22 };
// To compare both arrays
System.out.println("Integer Arrays on comparison: "+ Arrays.compareUnsigned(intArr, intArr1));
int intArr2[] = { 10, 15, 22 };
// To compare both arrays
System.out.println("Integer Arrays on comparison: "+ Arrays.compare(intArr, intArr2));
//intArr.sort(intArr);
int intKey = 22;
System.out.println(intKey+ " found at index =" + Arrays.binarySearch(intArr, 1, 3, intKey));
System.out.println("Integer Array as List: "+ Arrays.asList(intArr));
}
}
