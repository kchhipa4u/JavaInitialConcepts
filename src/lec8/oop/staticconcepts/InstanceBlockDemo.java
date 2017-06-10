package lec8.oop.staticconcepts;

public class InstanceBlockDemo {

	int z =0;  // instance/member
	
	static int count=0;  // class/Static
	
	{
		 z = 25;
		 System.out.println("Inside instance block...");
	}
	
	static{
		System.out.println("Only Once");
	}
	
	public InstanceBlockDemo() {
		System.out.println("Kan");
	}
	
	private void display()
	{
		final int b = 10;
		System.out.println("Display something...");
	}
	
	public static void disp(){
		System.out.println("Static Display");
	}

	int x =10;
	
	public static void main(String[] args) {
		
		InstanceBlockDemo first = new InstanceBlockDemo();
		InstanceBlockDemo second = new InstanceBlockDemo();
        System.out.println(first.x);
        System.out.println(first.z);
        //first.
        disp();
        InstanceBlockDemo.disp();
        first.disp();
        
        
        
	}
	
}
