class Student{
  // class variables
  String firstName;
  int gradeLevel;

  // Define the Constructor - a special function that initializes the class variables when an object is instantiated (created).    
  Student(String firstName, int gradeLevel){
    // The keyword "this" is used to refer to the class (object) itself.
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
  }
  
}