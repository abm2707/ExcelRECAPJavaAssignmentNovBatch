package JavaAssignments;

public class creatingClassandObjects {

	String name;
	int RollNo;
	int marks;
	String mobNo;
	
	public static void main(String[] args) {
		//creating object number 1 for class
		creatingClassandObjects obj = new creatingClassandObjects();
		obj.name= "Akhil B Menon";
		obj.RollNo = 55;
		obj.marks = 100;
		obj.mobNo= "987635241";
		System.out.println("Print the details of student 1 :" );
		System.out.println("Student name is: "+obj.name);
		System.out.println("Student roll no. is: "+obj.RollNo);
		System.out.println("Student marks is: " +obj.marks);
		System.out.println("Student Mobile No. is: " + obj.mobNo);
		
		System.out.println();   // for empty spaces
		System.out.println();   // for empty spaces
		
		//creating object number 1 for class
		creatingClassandObjects obj2 = new creatingClassandObjects();
		obj2.name= "Ajay B Menon";
		obj2.RollNo = 65;
		obj2.marks = 96;
		obj2.mobNo= "987225241";
		System.out.println("Print the details of student 2 :" );
		System.out.println("Student name is: "+obj2.name);
		System.out.println("Student roll no. is: "+obj2.RollNo);
		System.out.println("Student marks is: " +obj2.marks);
		System.out.println("Student Mobile No. is: " + obj.mobNo);
		
		
		
		

	}

}
