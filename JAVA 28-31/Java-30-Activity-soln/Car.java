class Car{
  // class variables - keep as public(default)
  String brand;
  String model;
  String color;
  int year;
  double value;

  // Constructor
  Car(String brand, String model, String color,
      int year, double value){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
  }
  
  // class functions
  void honk(){
    System.out.println("Beep Beep!");
  }
}