class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
  
  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
  double FtoC(double F){
    return 5./9*(F-32);
  }

  //3: Sphere volume
  double sphereVolume(double radius){
    return 4/3.*Math.PI*Math.pow(radius,3);
    
  }
  
  //4: Cone volume
  double coneVolume(double radius,double height){
    return 1/3.*Math.PI*Math.pow(radius,2)*height;
  
  }

  //5: Distance between two coordinate points
  double distance(double x1,
                  double x2,
                  double y1,
                  double y2){
    
     return  Math.sqrt( Math.pow(x1-x2,2) +
                        Math.pow(y1-y2,2) );
  }
  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter a temperature in farenhiet ");
    double F = Input.readDouble();
    print("Is "+FtoC(F)+" Celsuis");

    //3
    System.out.println("Enter the radius of the sphere ");
    double rad = Input.readDouble();
    print("The volume of a sphere with a radius of "+rad+" has a volume of "+sphereVolume(rad));

    //4
    System.out.println("Enter the radius of the cone ");
    rad = Input.readDouble();
    System.out.println("Enter the height of the cone ");
    double height = Input.readDouble();
    print("The volume of a cone with a radius of "+rad+
          " and height of "+height+
          " has a volume of "+coneVolume(rad,height));

    //5
    System.out.println("Enter x1 ");
    double x1 = Input.readDouble();
    System.out.println("Enter y1 ");
    double y1 = Input.readDouble();
    System.out.println("Enter x2 ");
    double x2 = Input.readDouble();
    System.out.println("Enter y2 ");
    double y2 = Input.readDouble();

    print("the distance between point ("+x1+","+y1+") and ("+
          x2+","+y2+") is "+distance(x1,x2,y1,y2));                 
        
  }
  
}