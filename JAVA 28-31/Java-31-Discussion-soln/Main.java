class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Create new student objects
    Student student1 = new Student("Tom", 11, 90.3);
    Student student2 = new Student("Jerry", 12, 65);

    // Output
    print( student1.firstName );
    print( "GPA: " + student1.toStandardGpa() );
    print( "Letter grade: " + student1.standardGpaLetterGrade() );
    print("\n");
    print( student2.firstName );
    print( "GPA: " + student2.toStandardGpa() );
    print( "Letter grade: " + student2.standardGpaLetterGrade() );    
    
  }

}