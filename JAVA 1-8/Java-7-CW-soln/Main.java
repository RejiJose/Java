class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }


  void init(){
    // For each problem below, prompt the user for the input values for each variable in the formula.
    
  /*
    Problem 1: Translate the formula from eq1.png.
  */
    double A=2.5, x=30, z=0;
    z= Math.pow(A, 2*x+1);
	System.out.println("#1 : z = "+z);
    
  /*
    Problem 2: Translate the formula from eq2.png.
  */
    double y=0; //Since we already declared x in the function init(), don't declare it again.
    y=2*x/(Math.sin(2 * Math.toRadians(x)));
	System.out.println("#2 : y = "+y);

    
    /*
    Problem 3: Translate the formula from eq3.png.
  */
    double b=0;
    b=Math.abs(Math.pow(x,2) + 1);
	System.out.println("#3 : b = "+b);

  }
  
}