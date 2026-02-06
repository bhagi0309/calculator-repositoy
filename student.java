package bha;

class stu1 {
	
//		variables
		int rollno;
		String name;
		int age;
		int totalmarks;
		static String schoolname="Abc school";
		
		
		//constructor
		public stu1(int rollno, String name, int age, int totalmarks)
		{
			this.rollno = rollno;
			this.name = name;
			this.age = age;
			this.totalmarks = totalmarks;
		}
		public void displayDetails()
		{
			System.out.println(this.rollno);
			System.out.println(this.name);
			System.out.println(this.age);
			System.out.println(this.totalmarks);
			
		}
	}

		public class student {
			public static void main(String[] args) {
				stu1 s1 = new stu1(1, "Raju", 34, 45);
				stu1 s2 = new stu1(2, "rani", 35, 50);
				stu1 s3 = new stu1(3, "ramu", 36, 60);
				stu1 s4 = new stu1(4, "ravi", 37, 75);
				stu1 s5 = new stu1(5, "rahul",38, 80);
				s1.displayDetails();
				
				
			}
				
		
		

	
		// TODO Auto-generated method stub

	}