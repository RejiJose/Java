/* 
Lesson 6: Use the Input Class provided to you, to get input from a user via the keyboard. In the examples below, the function calls for each datatype: int, double, string, char, boolean. 
*/
class Main{
	  public static void main(String[] args) {
    	(new Main()).init();
	  }

  void init(){
    // Always prompt the user for what information you are requesting
    
    // a) Ask user for age
    System.out.println("Enter your age:");
    int age;
    age = Input.readInt();
    System.out.println("Age is: "+age);
    

    // b) Ask user for a measurement that might include a decimal portion
    System.out.println("Enter the measurement to 100th place:");
    double measure = Input.readDouble();
    System.out.println("Measure is: "+measure);

    
    // c) Ask user's name
    System.out.println("Enter your Name");
    String name = Input.readString();
    System.out.println("Your name is: "+name);

    
    // d) Ask for user's first initial
    System.out.println("Enter your first initial:");
    char firstInitial;
    firstInitial = Input.readChar();
    System.out.println("Your first initial : "+firstInitial);


    // e) Ask if alive or not
    System.out.println("Enter true if alive or false if not alive");    
    boolean stillAlive = Input.readBoolean();
    System.out.println("Are you alive? : "+stillAlive);

    
    System.out.println("======== ++++++ =======\n*** End of exercise ***");

  }
}