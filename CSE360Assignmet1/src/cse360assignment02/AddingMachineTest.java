package cse360assignment02;

//A main program to test AddingMachine.Java, included for documentation
//but containing mostly random code for testing
public class AddingMachineTest {

	public static void main(String[] args) {
		AddingMachine test = new AddingMachine();
		
		test.add(5);
		System.out.println(test.toString());
		test.subtract(4);
		System.out.println(test.toString());
		test.clear();
		System.out.println(test.toString());
		test.add(27);
		System.out.println(test.toString());
		test.subtract(35);
		System.out.println(test.toString());
	}

}
