class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){    
    /* print(approxPi(5));
    print(approxPi(500));
    print(approxPi(2000000)); */

    // more accurate approximation of Pi
    for (int terms=100; terms<=100000; terms *= 10){
      print (moreAccuratePi(terms) );
    }
    
  }
  
/* 1:   Write a function approxPI() that accepts a value for # of terms and approximates the value of PI. (See the general forumula described in the file PI.png)

  Example: if # of terms = 5,
  approxPI = 4(1 - 1/3 + 1/5 - 1/7 + 1/9) = 3.3396825396825403
*/
  double approxPi(int terms){
    double sum=0;
    double sign=1;
  // Method 1:
     /* for(int i=0; i<terms; i++){
       sign = Math.pow(-1, i);
       sum += sign * 1.0/(2*i + 1);        
     } */
   // Method 2:
     /* for(int i=1; i<=terms; i++){
       sum+= Math.pow(-1,i-1) * (1.0/(2*i-1));
     } */

   // Method 3:
    for(int i=1; i<terms*2; i+=2){
      sum+= sign*(1.0/i);
      sign*=-1;
    }
    
    return 4*sum;
  }  

/* 2:  In order to get a more accurate approximation of PI (say, to the thousandths place), run your loop passing multiples of ten from 100 through 100000 for the # of terms).
*/    
  String moreAccuratePi(int terms){
    double sum=0;    
    for (int i=0; i<terms; i++){
      sum += Math.pow(-1, i) * 1.0/(2*i + 1);        
    }       
    return ("For "+ terms+ " terms,  Pi = "+ (sum*4) );
  }  
  
}