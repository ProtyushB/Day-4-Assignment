
public class Student {
	private int roll=1;
	private String name="Sam";
	private int age=20;
	private int marks=250;
	
	public Student() {
		
	}
	
	public Student(int roll,String name,int age,int marks){
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public void print() {
		System.out.println("Student's Name : "+name);
		System.out.println("Student's Age : "+age);
		System.out.println("Student's Roll : "+roll);
		System.out.println("Student's Marks : "+marks);
	}
}

class main{
	public static void main(String[] args) {
		new Student().print();
		System.out.println("*******************************");
		new Student(2,"Protyush",22,470).print();
	}
}
