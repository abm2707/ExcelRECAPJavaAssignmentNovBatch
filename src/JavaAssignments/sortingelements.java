package JavaAssignments;

public class sortingelements {

	public static void main(String[] args) {
		int arr[] = {60,39,55,100,96,72};
		int temp = 0;
		for(int i=0 ; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}
