
public class Main {
	
	public void print(int i) {
		if(i>=0) {
			if(i%2!=0) {
				System.out.println(i);
			}
			else {
				int n=0;
				while(n<=i) {
					n=n+10;
				}
				System.out.println(n);
			}
		}
		else {
			System.out.println("Error");
		}
	}
	
	
	
	public static void main(String[] args) {
		Main mn = new Main();
		
		mn.print(-5);
		mn.print(45);
		mn.print(44);
	}
}
