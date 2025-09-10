class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    
    /* 
    Lesson 6: Use the Input Class provided to you to get input from a user via the keyboard. In the examples below, the function calls for each datatype: int, double, string, char, boolean. 
   */
 
    // Always prompt the user for what information you are requesting
    // Declare the variables you will need to store the information
    // Print the information
    
    // Problem 1:   Ask a student for their age.  
    int age = 0;
    System.out.println("Enter your age:");
    age = Input.readInt();
    System.out.println("Your age is: "+age);
    
    
    // Problem 2:   Ask a student for their GPA.
    double gpa=0;
    System.out.println("Enter your gpa:");
    gpa = Input.readDouble();
    System.out.println("Your gpa is: "+gpa);
    
    
    // Problem 3:   Ask a student for their first name.
    System.out.println("Enter your first name:");
    String firstName ="";
    firstName = Input.readString();
    System.out.println("Your first name is: "+firstName);
    

    // Problem 4:   Ask a player if they want to continue to play  
    // There are a few ways to do this (maybe Y/N for Yes or No)
    System.out.println("Enter Y for yes or N for no:");
    char playOn = Input.readChar();
    System.out.println("Continue playing? : "+playOn);
    
      
    
    System.out.println("======== ++++++ =======\n*** End of exercise ***");
  }
}