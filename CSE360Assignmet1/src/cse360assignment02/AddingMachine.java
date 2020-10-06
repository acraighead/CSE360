package cse360assignment02;

//Adding Machine class that adds/subtracts values from a running total
//that starts at 0, and maintains a history of those operations to print to toString
//also includes a function to clear the current stored operations and restart from 0
public class AddingMachine {
//varibales to track total value and the string that will print to show operations
  private int total;
  private String history;
  
  //Initialize total to 0 and history to contain only that initial 0
  public AddingMachine () {
    total = 0;  
    history = "0";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  history = history + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + value;
  }

  public String toString () {
    return history;
  }

  public void clear() {
	  total = 0;
	  history = "0";
  }
}


