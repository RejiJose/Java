class Student{
  // Class variables - make private (demo that you have no access)
  private String firstName;
  private int gradeLevel;

  // Constructor - a special function to initialize class variables when an object is created. The keyword "this" is used to refer to the object of that class.
  Student(String firstName, int gradeLevel){
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
  }

  // "Getter" functions - return the values of class variables that are private.
  String getFirstName(){
    return this.firstName;
  }
  
  int getGradeLevel(){return this.gradeLevel;}

  // "Setter" functions - set values to class variables, if warranted.
  void setGradeLevel(int gradeLevel){
    this.gradeLevel = gradeLevel;
  }
  
}