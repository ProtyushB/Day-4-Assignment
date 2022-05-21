
public class Demo {
	public Demo() {
		this("Protyush");
		System.out.println("This is Zero Parameter Constructor");
	}
	
	public Demo(String s) {
		this(100);
		System.out.println("This is A Single String Parameter Constructor - String : '"+s+"'");
	}
	
	public Demo(int i) {
		this(7.5f);
		System.out.println("This is A Single Integer Parameter Constructor - Integer : '"+i+"'");
	}
	
	public Demo(float f) {
		System.out.println("This is A Single Float Parameter Constructor - Float : '"+f+"'");
	}
}

class Main{
	public static void main(String[] args) {
		new Demo();
	}
}