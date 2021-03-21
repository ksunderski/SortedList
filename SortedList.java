import java.util.*;

public class SortedList<String> {
    private ArrayList<String> list;

    public SortedList() {
        list = new ArrayList<String>();
    }

    public SortedList(SortedList sortedList2) {
        for(String element : sortedList2.getList()){
            this.list.add(element);
        }
    }

    public ArrayList<String> getList() {
        return list;
    }

    // public int indexOf(String value) {
    //     int startIndex = 0;
    //     int endIndex = list.size() - 1;
        
    //     while(startIndex <= endIndex){
    //         int middleIndex = (startIndex + startIndex) /2;
    //         String element = list.get(middleIndex);
    //         if(value.equals(element)) {
    //             list.add(middleIndex, value);
    //             return middleIndex;
    //         } else if(value.compareTo(element) < 0) {
    //             startIndex = middleIndex + 1;

    //         }else {
    //             endIndex = middleIndex - 1;
    //         }
    //     }
    //     return -1;
      
    // }
    

    public void add(String value) {
        //T lowerBound = list.get(0);
        //T upperBound = list.size()-1;
        int startIndex = 0;
        int endIndex = list.size() - 1;
            while(startIndex <= endIndex){
            int middleIndex = (startIndex + startIndex) /2;
            String element = list.get(middleIndex);
            if(value.equals(element)) {
                list.add(middleIndex, value);
                return;
            } else if(value.compareTo(element) < 0) {
                startIndex = middleIndex + 1;

            }else {
                endIndex = middleIndex - 1;
            }
        }
        list.add(startIndex, value); 
      
    }

    public void deleteBack(){
        this.list.remove(this.list.size() - 1);

    }
    
    // public void removeDuplicates() {
    //     int i = 0;
    //     while(i<this.list.size() - 1) {

    //         if(this.list.get(i).equals(this.list.get(i+1)) ) {
    //             this.list.remove(i);
            
    //         } else {
    //             i++;    
    //         }

           
    //     }
    // }
    /*
    1,2,3,4,5,6,7,8,9,10
    7,8,9,10 
    -5, -4, -3, -2, 5, 7
    */
    // public void addAll(SortedList list2) {
    //     int oldStartIndex=0;
       
    //     for(String s : list2.getList()){ //
    //         int startIndex = oldStartIndex;
    //         int endIndex = get.length() -1;;
    //         boolean isAdded = false;
    //         while(startIndex <= endIndex){
    //             int middleIndex = (startIndex + startIndex) /2;
    //             String element = list.get(middleIndex);
    //             if(value.equals(element)) {
    //                 list.add(middleIndex, value);
    //                 isAdded = true;
    //                 oldStartIndex = middleIndex;
    //                 break;
    //             } else if(value.compareTo(element) < 0) {
    //                 startIndex = middleIndex + 1;
    
    //             }else {
    //                 endIndex = middleIndex - 1;
    //             }
    //         }
    //         if(!isAdded) {
    //             list.add(startIndex, value);
    //             oldStartIndex = middleIndex;
    //         }
            
    //     }

    // }
        
    
}
