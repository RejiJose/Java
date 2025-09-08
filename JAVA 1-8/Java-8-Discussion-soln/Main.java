    /*    Functions (called Methods in Java)
      1) A method is a block of code which only runs when it is called.

      2) You can pass data, known as parameters, into a method.

      3) Functions are used to perform certain actions

      4) Functions can return data.

      5) Why use functions? To reuse code: define the code once, and use it many times.

      Summary:      
      Functions usually "take in" data, "process" it, and "return" a result. Once a function is written, it can be used over and over again.
    */

class Main {

 	public static void main(String[] args) {
    	(new Main()).init();
	}

  // Example 1:
  void welcome(){
    System.out.println("Welcome...");
  }

  // Example 2:
  void welcome2(String name){
    System.out.println("Welcome " + name + " to Java!");
  }

  // Example 3:
  String welcomeMsg(String name){
    return "Welcome " + name + ", to Java programming class";
  }

  // Example 4:
  double meterToInches(double m){
    // 1 meter = 39.37in
    return  m * 39.37;
  }

  void init() {
    // call the functions and test if they work    
    welcome();

    welcome2("Joe");

    String msg = welcomeMsg("Jane");
    System.out.println(msg);
    
    double inches = meterToInches(1);
    System.out.println(inches+" inches");

  }

}