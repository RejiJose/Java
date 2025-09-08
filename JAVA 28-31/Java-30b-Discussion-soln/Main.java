class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Create new student objects
    Student student1 = new Student("Tom", 9);
    Student student2 = new Student("Jerry", 12);

    // Since all variables are public by default, the following 2 lines produce errors:      
    print( student1.firstName );
    print( student2.gradeLevel );
    
    
    // After hiding class variables by making them private, we need "getters"(to access the values) and "setters"(to change the values). These are functions in the class itself.
    
    print( student1.getFirstName() );
    print( student2.getFirstName() );

    print( student1.getGradeLevel() );
    // change gradelevel for student1 to 10
    student1.setGradeLevel(10);
    print( student1.getGradeLevel() );
    
  }

}