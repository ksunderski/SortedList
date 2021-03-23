// Client for the Final Project class

public class FinalProjectClient {
    public static void main(String[] args) {
// Uncomment the items below as you implement the specified features in the SortedList.
//
// The general pattern you should follow is:
// 1. implement the feature (method, usually) in your SortedList.
// 2. uncomment the statements below the method line, verify that this code runs
// 3. move on to the next feature and repeat steps 1 and 2.
//
// In order for each section to be completed, those above it must be, in most cases

// first feature [20 points]:
// add() (in order,  replace existing add())
// 
    SortedList<String> first = new SortedList<String>();
    first.add("one");
    first.add("two");
    first.add("three");
    first.add("four");
    first.add("five");
    System.out.println(first);
 
// second feature [20 points]:
// addAll() (add data from a collection to an existing instance)

    SortedList<String> second = new SortedList<String>();
    second.add("one");
    second.add("two");
    second.add("three");
    second.add("four");
    System.out.println(second);
    first.addAll(second);
    System.out.println(first);
    
// third feature [20 points]:
// removeDuplicates() (find and remove duplicate data values)

    first.removeDuplicates();
    System.out.println(first);
    
// fourth feature [20 points]:
// Create a constructor that accepts an instance of another SortedList as a parameter

    SortedList<String> third = new SortedList<String>(second);
    System.out.println(third);

// fifth feature [20 points]:
// deleteBack() (delete and return to the caller the last element in this list)

    String s = third.deleteBack();
    System.out.println(s);
    System.out.println(third);
    }
}