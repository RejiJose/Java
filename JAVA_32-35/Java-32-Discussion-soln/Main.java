class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // define grades arrays for each student (may be different sizes)
    double[] g1 = {80,100,90};
    double[] g2 = {70,60,65,60,70};
    
    // Create new student objects
    Student student1 = new Student("Tom",9,90,g1);
    Student student2 = new Student("Jerry",12,90,g2);

    print( "Student1's grade avg: " + student1.calculateAvg());
    print("\n");
    print( "Student2's grade avg: " + student2.calculateAvg());    
  }

}