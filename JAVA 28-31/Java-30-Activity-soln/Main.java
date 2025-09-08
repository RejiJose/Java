class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    Car myBmw = new Car("BMW","335i","red",2022,48000);
    Car myToyota = new Car("Toyota","Camry","Grey",2021,24500);
    
    // display brand, model and value of each car
    print("Brand: " + myBmw.brand );
    print("Model: " + myBmw.model );
    print("Value: $" + myBmw.value );
    print("\n");
    print("Brand: " + myToyota.brand );
    print("Model: " + myToyota.model );
    print("Value: $" + myToyota.value );    

	//Make BMW honk
	print("\nUsing car functions(behavior):");
	myBmw.honk();
	
    // Display brand and model of any car with value over 30,000
    print("\nCars with value over $30,000:");
    
    if (myBmw.value > 30000){
      print("Brand: " + myBmw.brand );
      print("Model: " + myBmw.model );
    } 
    if (myToyota.value > 30000){
      print("Brand: " + myToyota.brand );
      print("Model: " + myToyota.model );
    } 	
	
  }

}