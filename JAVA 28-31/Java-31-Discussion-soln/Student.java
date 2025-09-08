class Student{
  // Class variables
  String firstName;
  int gradeLevel;
  double gpa;
  // Constructor
  Student(String firstName, int gradeLevel, double gpa){
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
  }

  // class functions
  double toStandardGpa(){
    return 0.04*Math.pow(this.gpa,2)/100;
  }

  char standardGpaLetterGrade(){
    
    if( this.gpa<=100 && gpa>90){
      return 'A';
    }
    else if( gpa<=90 && gpa>80){
      return 'B';
    }
    else if( gpa<=80 && gpa>69){
      return 'C';
    }
    else{
      return 'F';
    }

  }
    
}