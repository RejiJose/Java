class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    print( rollDice() );
    print("------ * ------");
    
    print( "Lotto #s: " + lotto() );
    print("------ * ------");
	
	diceDistribution(100);
	print("\n");
	diceDistribution(1000);
	print("\n");
	diceDistribution(10000);
	print("\n");
    diceDistribution(100000);
    print("------ * ------");

    print(additionTutor());
    print("------ * ------");

    print( mathQuiz() );
  }

  /*
  Challenge 1:
  Write a function rollDice() that rolls a die once and returns a value from 1 to 6.
  Example:
  rollDice() ==> "2"
  */
  int rollDice(){
    int dice1=(int)(Math.random()*6) +1;
    return dice1;
  }

  /*
  Challenge 2:
  Write a function lotto() that returns a string of 5 numbers from 1 to 48.
  Example:
  lotto() ==> "1 23 34 9 18"
  */
  String lotto(){
    String result ="";
    for(int x=1; x<=5; x++)
      result += (int)( Math.random()*(48-1+1) ) +1 +" ";

    return result;
  }

  /*
  Challenge 3:
  Write a function diceDistribution() that accepts an integer N and rolls a die N times, keeps a counter of the number of times 1,2,3,4,5,6 was rolled (need a counter for each) and displays the counters for each.
  Test with N values of 100, 1000, 100000, and 1000000.  What do the results look like as the number N gets larger?
  */
  void diceDistribution(int N){
    int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0;
    for(int x=0; x<N; x++){
      int roll = (int)( Math.random()*6 ) +1;
      if(roll==1)
        d1++;
      else if(roll==2)
        d2++;
      else if(roll==3)
        d3++;
      else if(roll==4)
        d4++;
      else if(roll==5)
        d5++;
      else if(roll==6)
        d6++;
    }
    print("roll of 1: "+d1);
    print("roll of 2: "+d2);
    print("roll of 3: "+d3);
    print("roll of 4: "+d4);
    print("roll of 5: "+d5);
    print("roll of 6: "+d6);
  }

  /*
  Challenge 4:
  Write a function additionTutor() that generates two random numbers and prompts the user to enter the sum of the two numbers. The random integers should range from -20 to 20 (inclusively). If the answer is correct return "Correct!" otherwise return "Incorrect".
  */
  String additionTutor(){
    int n1 = (int)( Math.random()*(20-(-20)+1) ) +(-20);
    int n2 = (int)( Math.random()*(20-(-20)+1) ) +(-20);
    print("Find the sum:");
    print(n1+ " + "+n2+" = ?");
    int ans = Input.readInt();
    if(ans == n1+n2){
      return "Correct!";
    }
    else{
      return "Incorrect.";
    }      
  }

  /*
  Challenge 5:
  Write a function mathQuiz() that generates a random addition, subtraction, multiplication or division problem of two random integers, prompts the user for the answer. It returns "Correct!" if the answer is correct, otherwise returns "Incorrect". The random integers should range from -20 to 20 (inclusively).
  Hint: For the random operations (+,-,*,/) using a random number from 0 to 3 where 0 means +, 1 means -, 2 means * and 3 means /.
  */
  String mathQuiz(){
    String op="";
    double answer =0;
    
    int n1 = (int)( Math.random()*(20-(-20)+1) ) +(-20);
    int n2 = (int)( Math.random()*(20-(-20)+1) ) +(-20);
    int operation = (int)( Math.random()*(3-0+1) ) +0;

    if( operation == 0){
      answer = n1+n2;
      op=" + ";
    }
    else if (operation == 1){
      answer = n1-n2;
      op=" - ";      
    }
    else if (operation == 2){
      answer = n1*n2;
      op=" * ";      
    }
    else if (operation == 3){
      answer = n1/n2;
      op=" / ";      
    }
    
    print("Enter the answer:");
    print(n1+ op + n2+" = ?");
    int ans = Input.readInt();
    if(ans == answer){
      return "Correct!";
    }
    else{
      return "Incorrect.";
    }
      
  }

}