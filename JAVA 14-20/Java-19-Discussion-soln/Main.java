class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    //display the result of Math.random(): gives you [0,1)
    print( Math.random() );
    
    // To generate numbers [0,10)? 
    //Multiply by the number of integers between 0 to 10(exclusive)
    //i.e, 0 to 9 = 10 integers
    print( Math.random()*10 );

    //To generate numbers from 0 to 10 (inclusive of 10), multiply by 11
    //(10-0)+1 = 11 integers
    print( Math.random()*(11) );
  
    //Using "Casting" (forced conversion) to truncate the decimal places, to get integers between 0 and 10
    print( (int)( Math.random()*(10-0+1)) );

    //What if we wanted to start at 3 and go up to 10
    print( (int)( Math.random()*(10-3+1) ) +3);

    //Generate random integers from 20 to 50
    print( (int)(Math.random()*(50-20+1)) +5 );

    // use a loop to generate 100 random integers between 2 and 9
    for(int x=0; x<100; x++)
      printt(randInt(2,9)+", ");

    print("\n----------------------------------\n");
    // use a loop to generate 100 random integers between -15 and 5    
    for(int x=0; x<100; x++)
      printt(randInt(-15, 5)+", ");
    
  }

  //Write a function randInt() that accepts a lower and upper limit for a range of integers to return a random integer from [a,b]

  int randInt(int min, int max){
    return (int)(Math.random()*(max-min+1)) + min;
  }
}