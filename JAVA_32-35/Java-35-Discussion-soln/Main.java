class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list = new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    int count=0;
	
	print("# of students: " + students.length);
	
    //1: Average of the grades for all students
    double sum=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      sum += student.gpa;
    }
    print("Grade avg for all students: " + sum/students.length);


    //2: Number of students for a specific teacher [ use findTeacher() ]
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Castro R")){
        count++;
      }
    }
    print("Teacher Castro R has " + count + " students");

    //3: Number of students enrolled in a specific course [ use findCourse() ]
    count=0;
    for(int x=0; x< students.length; x++){
      // Student student = students[x];
      if(students[x].findCourse("SHF21U2C")){
        count++;
      }
    }
    print("Students enrolled in course SHF21U2C: "+count);

    //4: Number of students by subject area taught by specific teacher [ use findCourseStartingWith() ]
    count=0;
    for(int x=0; x< students.length; x++){
      // Student student = students[x];
      if(students[x].findCourseStartingWith("MK") && students[x].findTeacher("Joseph")){
        //print("ID: "+ students[x].id );
        count++;
      }
    }
    print("Students in course starting with MK taught by Joseph: "+count);        
  
  }

}