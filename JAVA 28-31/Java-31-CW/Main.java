class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
  // 3) Create two animal objects in the init function and store each animal in a variable.
	Animal animal1 = new Animal("Dog",35,24);
	Animal animal2 = new Animal("Cat",15,13);

  // 4) Display if each of the animals is healthy or unhealthy using the function isHealthy(). Also display the weight of each animal in kilos.
    
	if (animal1.isHealthy() ){
		print(animal1.animalSpecies + "is healthy");
	} else{
		print(animal1.animalSpecies + "is not healthy");
	}
	
  }

}