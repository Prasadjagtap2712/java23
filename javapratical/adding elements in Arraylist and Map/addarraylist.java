/*
13) WAP of adding elements in Arraylist and Map.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
class Main {
public static void main(String[] args) {
// create an ArrayList
ArrayList<String> list = new ArrayList<>();
// add elements to the ArrayList
list.add("apple");
list.add("banana");
list.add("cherry");
// print the contents of the ArrayList
System.out.println("ArrayList:");
for (String s : list) {
System.out.println(s);
}
// create a Map
Map<Integer, String> map = new HashMap<>();
// add elements to the Map
map.put(1, "one");
map.put(2, "two");
map.put(3, "three");
// print the contents of the Map
System.out.println("Map:");
for (Map.Entry<Integer, String> entry : map.entrySet()) {
System.out.println(entry.getKey() + ": " + entry.getValue());
}
}
}
