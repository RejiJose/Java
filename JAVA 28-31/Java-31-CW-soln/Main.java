class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
	  
// 3) Create two animal objects in the init function and store each animal in a variable.

    // create objects
    Animal wolf = new Animal("Wolf", 90, 30.3);
    Animal goat = new Animal("Goat", 29, 20.1);
	
// 4) Display if each of the animals is healthy or unhealthy using the function isHealthy(). Also display the weight of each animal in kilos. 
 
    // output
    if(wolf.isHealthy()){
      print("Wolf is healthy");
    }
    else{
      print("Wolf is unhealthy");
    }
    print( "Weight: " + wolf.convertPoundsToKilos() + " Kg");
    print("\n");
    
    if(goat.isHealthy()){
      print("Goat is healthy");
    }
    else{
      print("Goat is unhealthy");
    }
    print( "Weight: " + goat.convertPoundsToKilos() + " Kg");    
  }

}