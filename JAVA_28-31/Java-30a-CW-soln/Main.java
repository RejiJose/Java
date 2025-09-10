class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog scoob = new Dog("Breed_A", 1,"Scooby");
    Dog cliff = new Dog("Breed_B", 2,"Clifford");
    Dog snoop = new Dog("Breed_C", 3,"Snoopy");
    
    // display object property values
    print(scoob.breed);
    print(cliff.age);
    print(snoop.name);
    // invoke object behaviors(functions)
    cliff.bark();
    snoop.bark();    
  }

}