class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // Create a new student object 
    Student student1 = new Student("Tom", 9);
    Student student2 = new Student("Jerry", 12);

    print( student1.firstName);
    print( student2.gradeLevel);
        
  }

}