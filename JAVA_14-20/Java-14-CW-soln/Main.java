class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    range(1,8,2);
    compound(1000, 0.07, 5);    
  }

/*
  1) 
  Write a function range() that accepts a start value, end value and incremental step to display all the integers from the start to end values (inclusive). 
  For example start=1, end=7, step=2 function displays 1 3 5 7
*/
  void range(int start, int end,int step){
    System.out.println(start+", "+end +", "+step);
    for(int x=start; x<=end; x+=step){
      System.out.print(x+" ");
    }
    System.out.println();
  }

   /* 
    2) Compound Interest
    Write a function compound() that accepts an investment amount, annual interest rate and the # of years of investment. Display how the investment grows per year.
    For example: 
    Investment $1,000, interest rate 5% and term 3 years:
    Year 1: 1070.00
    Year 2: 1144.90
    Year 3: 1225.04
  */
  void compound(double prin, double rate, int years){
    double newAmt=0;
    for(int t=0; t<=years; t++){
      newAmt = prin*Math.pow(1+rate,t);
      System.out.println("Year "+t+" : $"+newAmt);
    }
  }

  
}