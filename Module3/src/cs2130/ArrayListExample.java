package cs2130;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

  static void exampleFunction() {
    // create an ArrayList of Integers
    ArrayList<Integer> exampleArrayList = new ArrayList<Integer>();

    // add elements to the ArrayList
    exampleArrayList.add(31);
    exampleArrayList.add(23);
    exampleArrayList.add(41);
    exampleArrayList.add(12);

    // print the ArrayList
    System.out.println("The complete ArrayList");
    System.out.println(exampleArrayList);
    // sort the ArrayList
    Collections.sort(exampleArrayList);
    // print the sorted ArrayList
    System.out.println("The sorted ArrayList");
    System.out.println(exampleArrayList);

    System.out.println("The elements greater than 20");
    // loop through the ArrayList and print values greater than 20
    // using a standard for loop
    // get the size of the ArrayList
    int size = exampleArrayList.size();
    for (int i = 0; i < size; i++){
      if(exampleArrayList.get(i) > 20) {
        System.out.println(exampleArrayList.get(i));
      }
    }

    System.out.println("The elements greater than 20");
    // loop through the ArrayList and print values greater than 20
    // using a for each loop
    for (int oneElement : exampleArrayList){
      if (oneElement > 20){
        System.out.println(oneElement);
      }
    }

    // clear the ArrayList
    exampleArrayList.clear();
    System.out.println("The empty ArrayList");
    System.out.println(exampleArrayList);
  }

  static ArrayList<Integer> exampleParameterAndReturn(ArrayList<Integer> incoming) {
    ArrayList<Integer> outgoing = new ArrayList<Integer>();

    // print ArrayList sent
    System.out.println("The ArrayList sent to the function");
    System.out.println(incoming);

    // copy the third element from incoming into outgoing
    if (incoming.size() >= 3) {
      outgoing.add(incoming.get(2));
    }

    // find a value in the incoming ArrayList
    if (incoming.contains(23)) {
      outgoing.add(23);
    }

    // print ArrayList that will be returned
    System.out.println("The ArrayList being returned from the function");
    System.out.println(outgoing);

    return outgoing;
  }
}


