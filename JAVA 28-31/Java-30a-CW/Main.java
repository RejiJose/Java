class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dog1 = new Dog("Husky", 5, "Clifford");
	Dog dog2 = new Dog("Pitbull", 6, "Tom");
	Dog dog3 = new Dog("Husky", 2, "Jerry");
    // display object property values
	print(dog3.age);
    
    // invoke object behaviors(functions)
   dog2.bark();
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}