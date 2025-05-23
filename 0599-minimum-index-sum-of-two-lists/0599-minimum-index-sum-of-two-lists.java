class Solution {
public String[] findRestaurant(String[] list1, String[] list2) {
    //Initialize a String[] for result
    String[] result = new String[list1.length];
    
    
    //Check the extreme condition
    if(list1.length == 1){
        return list1;
    }
    else if(list2.length == 1){
        return list2;
    }
    
    //Create a HashMap to store the list1
    HashMap<String, Integer> map = new HashMap<> ();
    for(int i = 0; i < list1.length; i++){
        map.put(list1[i], i);
    }
    int size1 = map.size();
    
    //Get the value for minimum and res string
    int minimum = Integer.MAX_VALUE;
    LinkedList<String> linkedList = new LinkedList<>();
    //Check the string of list2[] with HashMap
    for(int i = 0; i < list2.length; i++){
        if(map.containsKey(list2[i])){
            if(i + map.get(list2[i]) < minimum){
                linkedList.clear();
                minimum = i + map.get(list2[i]);
                linkedList.add(list2[i]);
            }
            else if(i + map.get(list2[i]) == minimum){
                linkedList.add(list2[i]);
            }
            
        }
    }
    
    //Convert LinkedList to string[]
    result = linkedList.toArray(new String[linkedList.size()]);
    
    return result;
    
 }
}          