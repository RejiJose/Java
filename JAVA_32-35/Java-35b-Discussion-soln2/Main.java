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

    //1: Average of grades for all students
    double sum=0;
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      sum += student.gpa;
    }
    print("\nGrade avg of all students: " + sum/students.length);


    //2: Number of students for a specific teacher [ use findTeacher() ]
    for(int x=0; x< students.length; x++){
      Student student = students[x];
      if(student.findTeacher("Castro R")){
        count++;
      }
    }
    print("\nTeacher Castro R has " + count + " students");

    //3: Number of students enrolled in a specific course [ use findCourse() ]
    count=0;
    for(int x=0; x< students.length; x++){
      // Student student = students[x];
      if(students[x].findCourse("SHF21U2C")){
        count++;
      }
    }
    print("\nStudents enrolled in course 'SHF21U2C': "+count);

    //4: Number of students by subject area taught by specific teacher [ use findCourseStartingWith() ]
    count=0;
    for(int x=0; x< students.length; x++){
      // Student student = students[x];
      if(students[x].findCourseStartingWith("MK") && students[x].findTeacher("Joseph")){
        //print("ID: "+ students[x].id );
        count++;
      }
    }
    print("\n# of students in course starting with MK taught by Joseph: "+count);    
     
    //5: Teacher Banu's students in gr.10 with GPA over 90 (print IDs and GPA as well as number of students)
    print("\n ============================================");
	print("\nTeacher Banu's students in gr.10 with GPA over 90"); 
    count=0;
    for(int x=0; x< students.length; x++){      
      if( students[x].gradeLevel==10 && students[x].findTeacher("Banu") && students[x].gpa>90 ){
        print("ID: "+ students[x].id+ ", GPA: " + students[x].gpa );
        count++;
      }
    }
    print("\nNumber of students: "+count); 
    
  }


  
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}