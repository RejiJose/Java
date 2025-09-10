class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    //Create a new student object 
    Student student1 = new Student();
	
	// assign variables a value
    student1.firstName = "Tom";
	student1.gradeLevel = 11;
    print("Student name: " + student1.firstName);

    // have student1 speak
    student1.speak();    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }

}