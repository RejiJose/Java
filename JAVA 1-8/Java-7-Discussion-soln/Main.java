class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  /*
    Demonstrate on repl.

      1) Y = x^5
      2) Y = (x+1)^3
      3) Y = x^3/sqrt((x-1)^2)
      4) Y = sin(π/6)            // to type Pi, use Alt + 227 (on number pad only)
  */
  // Note: The Math class is an object. All objects names, by Java convention, are capitalized followed by the dot and function name.

  void init(){

    double Y=0,x=2.3;

    //1: Y = x^5
    Y = Math.pow(x,5);
    System.out.println("#1 : "+Y);
    
    //2 :  Y = (x+1)^3
    Y = Math.pow(x+1,3);
    System.out.println("#2 : "+Y);

    //3  Y = x^3/sqrt((x-1)^2)
    Y= Math.pow(x,3)/Math.sqrt( Math.pow(x-1,2) );
    System.out.println("#3 : "+Y);

    //4  Y = sin(π/6)
    Y = Math.sin( Math.PI/6);
    System.out.println("#4 : "+Y);
    
    Y = Math.sin( Math.toRadians(30)); // first convert deg to radians
    System.out.println("#4 : "+Y);

  }

}