class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // define arrays of grades
    double[] g1 = {100,80,90};
    double[] g2 = {65,75,60,84,70};
	
    // define arrays of courses
    String[] courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[] courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    
    //Create new student objects
    Student student1 = new Student("Tom",10,g1,courses1);
    Student student2 = new Student("Jerry",9,g2,courses2);

    /*
    1) Display first name of all students taking the course FSFC3
    2) Display first name of all freshman students taking the course HUF43X
    */
    print("Students taking FSFC3:");
    if(student1.checkCourse("FSFC3")){
      print(student1.firstName);
    }
    if(student2.checkCourse("FSFC3")){
      print(student2.firstName);
    }
    
    print("\n");
    print("Freshman students taking HUF43X:");
    if(student1.checkCourse("HUF43X") && student1.gradeLevel == 9){
      print(student1.firstName);
    }
    if(student2.checkCourse("HUF43X") && student2.gradeLevel == 9){
      print(student2.firstName);
    }

    /*
    Display the average of the class (only two students in class)
    */
    double avg = (student1.calculateAvg() + 
                  student2.calculateAvg())  / 2;

    print("\nAverage class grade: " + avg);
    
  }

}