package JavaAssignments;

import java.util.HashSet;

public class firstRepeatingElement {

	void firstRepeat(int a[], int len)   //takes two parameters i)array ii)length
    {
        HashSet<Integer> set = new HashSet<Integer>();  //creating a hashset
        
        int majority = -1;   // creating integer variable called majority
        
        for (int i = 0; i < len; i++){
            
            if (set.contains(a[i])) {
                majority = i;
            } else {
                set.add(a[i]);
            }
        }
        
        System.out.println(a[majority]);
    }
	public static void main(String[] args) {
		firstRepeatingElement obj = new firstRepeatingElement();
        int arr[] = {10, 5, 3, 4, 3, 5, 6, 10};
        int len = arr.length;  //gives the length of array
        obj.firstRepeat(arr, len); //calling the function firstRepeat
	}
}
