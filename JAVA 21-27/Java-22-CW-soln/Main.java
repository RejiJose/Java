class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   /*
    Problem 1: 
    a) Create an array of the names of your friends.
    b) Print the 2nd name
    c) Print the size of the array
    d) Print the 2nd last name using the array size.
    e) Use the fn showArray[] provided below to display the array of friend names.
  */
    String[] friends = {"Joe","Mary","Bob","Kim"};
    print( friends[1] );
    print( friends.length );
    print( friends[friends.length - 2] );
    showArray( friends );

    // #2
    double[] tempC = {-2.5, 0, 37, 50};
    double[] tempF = convertTempCtoF(tempC);
    for(int x=0; x <= tempF.length-1; x++){      
      printt(tempF[x] +", ");
    }
    
  }
  /*
  Problem 2:
  Write a function convertTempCtoF() that accepts an array of Celsius temperature values, converts each value to Fahrenheit scale, and returns a new array with the converted temperatures. (Use the celsiusToFahrenheit function provided)
  NOTE: To test this function, create an array tempC in celsius which you will pass to test your new function.
  */
  double[] convertTempCtoF(double[] cTemps){

    double[] fTemps = new double[cTemps.length];
    for(int x=0; x<=cTemps.length-1; x++){
      fTemps[x] = celsiusToFahrenheit(cTemps[x]);
    }
    return fTemps;
  }


  // Function to print all the elements of an array (use a 'for' loop to traverse the array)
  void showArray(String[] a){
    for(int x=0; x <= a.length-1; x++){      
      printt(a[x] +", "); // print(a[x]);
    }
  }
  // fn to convert temp from degC to degF
  double celsiusToFahrenheit(double c){
        return c*9/5+32;
  }
}