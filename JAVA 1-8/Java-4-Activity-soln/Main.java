class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
// Define a variable for each situation in the challenges below. Assign a value to each variable.
// Display the value of each variable to the console.

/*  Challenge 1:    
    1) student's age 
    2) number of people that live with you
    3) number of items in a cart 
*/
    int studentAge = 16;
    System.out.println("Student is " + studentAge + " years old");
    
    int numOfPeopleLiveWithMe = 3;
    System.out.println(numOfPeopleLiveWithMe + " people live with me");

    int numOfCartItems = 4;
    System.out.println("Cart contains " + numOfCartItems + " items");


/*  Challenge 2:
    1) temperature 
    2) student's GPA
    3) growth rate of your investment
*/
    double temp = 28.64;
    System.out.println(temp);

    double StudentGPA = 3.14;
    System.out.println(StudentGPA);

    double growthRate = 7.26;
    System.out.println(growthRate);

/*  Challenge 3:
    1) Student's last name 
    2) student's first initial
    3) description of an item 
*/
    String studentLastName = "Smith";
    System.out.println(studentLastName);

    char studentFirstInit = 'r';
    System.out.println(studentFirstInit);

    String itemDescription = "glass coffee table; dimensions 4 x 6 x 2 feet";
    System.out.println(itemDescription);

/*  Challenge 4:
    1) the status whether lights are on
    2) the status whether the game is over
    3) the status whether the battery is charging
*/
    boolean areLightsOn = true;
    System.out.println(areLightsOn);

    boolean gameOver = false;
    System.out.println(gameOver);

    boolean isBatteryCharging = true;
    System.out.println(isBatteryCharging);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}