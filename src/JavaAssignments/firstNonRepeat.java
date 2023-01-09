package JavaAssignments;

public class firstNonRepeat {

	public static void main(String[] args) {
		int nums[] = { 10, 20, 30, 40, 50, 40, 30, 20, 10 };

		boolean chk;
		for (int i = 0; i < nums.length; i++) {
			chk = false;
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {                         //making sure both loops don't point at same value
					if (nums[i] == nums[j]) {      // if the values are same , then they are repeated
						chk = true;					// make check as true
						break;
					}
				}
			}
			if (!chk)     // if not repeated
				System.out.print(nums[i] + " ");  // print it
		}

	}

}
