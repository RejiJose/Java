class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){  

    // check if a student's age is 15
    int age;
    System.out.println("Enter the student's age");
    age = Input.readInt();

    
    // check if a student age is not 15
    System.out.println("Enter the student's age");
    age = Input.readInt();

    
    // check if the temperature is 70 degrees or hotter
    System.out.println("Enter the temperature");
    double temp = Input.readDouble();

    
    // check if the temperature is colder than 60 degrees
    System.out.println("Enter the temperature");
    temp = Input.readDouble();

    
    // check if player is still alive
    System.out.println("Enter true if player is alive, otherwise false");
    boolean alive = Input.readBoolean();
    

  }
  
}