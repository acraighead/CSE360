package cse360assignment02;

//A main program to test AddingMachine.Java, included for documentation
//but containing mostly random code for testing
public class AddingMachineTest {

	public static void main(String[] args) {
		AddingMachine test = new AddingMachine();
		
		test.add(5);
		test.toString();
		test.subtract(4);
		test.toString();
		test.clear();
		test.toString();
		test.add(27);
		test.toString();
		test.subtract(35);
		test.toString();
	}

}
