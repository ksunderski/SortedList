import java.util.*;

public class SortedList<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<T>();

    public SortedList() {}

    public SortedList(SortedList<T> sortedList2) {
        for (T element : sortedList2.getList()) {
            list.add(element);
        }
    }

    public ArrayList<T> getList() {
        return list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T e : list) {
            sb.append(e.toString() + ",");
        }
        return sb.toString();
    }
    // public int indexOf(String value) {
    // int startIndex = 0;
    // int endIndex = list.size() - 1;

    // while(startIndex <= endIndex){
    // int middleIndex = (startIndex + startIndex) /2;
    // String element = list.get(middleIndex);
    // if(value.equals(element)) {
    // list.add(middleIndex, value);
    // return middleIndex;
    // } else if(value.compareTo(element) < 0) {
    // startIndex = middleIndex + 1;

    // }else {
    // endIndex = middleIndex - 1;
    // }
    // }
    // return -1;

    // }

    public void add(T value) {
       
        int startIndex = 0;
        int endIndex = list.size() - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + startIndex) / 2;
            T element = list.get(middleIndex);
            if (value.equals(element)) {
                list.add(middleIndex, value);
                return;
            } else if (value.compareTo(element) < 0) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        list.add(startIndex, value);
    }

    public T deleteBack() {
        return this.list.remove(this.list.size() - 1);
    }

    public void removeDuplicates() {
        int i = 0;
        while (i < this.list.size() - 1) {

            if (this.list.get(i).equals(this.list.get(i + 1))) {
                this.list.remove(i);
            } else {
                i++;
            }
        }
    }

    /*
     * 1,2,3,4,5,6,7,8,9,10 7,8,9,10 -5, -4, -3, -2, 5, 7
     */
    public void addAll(SortedList<T> list2) {
        for (T element : list2.getList()) {
            add(element);
        }
    }

    // int oldStartIndex=0;

    // for(T s : list2.getList()){ //
    // int startIndex = oldStartIndex;
    // int endIndex = list2.size() -1;;
    // boolean isAdded = false;
    // while(startIndex <= endIndex){
    // int middleIndex = (startIndex + startIndex) /2;
    // T element = list.get(middleIndex);
    // if(value.equals(element)) {
    // list.add(middleIndex, value);
    // isAdded = true;
    // oldStartIndex = middleIndex;
    // break;
    // } else if(value.compareTo(element) < 0) {
    // startIndex = middleIndex + 1;

    // }else {
    // endIndex = middleIndex - 1;
    // }
    // }
    // if(!isAdded) {
    // list.add(startIndex, value);
    // oldStartIndex = middleIndex;
    // }

    // }
}
