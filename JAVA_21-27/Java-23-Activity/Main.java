class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // 1: Emoji
    

    // 2: Total including tax


    // 3: Integer Present ?


    // 4: Lotto


    // 5: Largest integer in array

    
    // 6: First N prime #s

  }

    /* 1:  Create an array of emojis and then display each emoji.  When printing, use the fn convertToEmoji() provided below to display the actual emoji.

  Look at "Lesson 21 CW_1_Solution": the rollDice() fn is an example of using unicodes as cards.
  Resource for unicodes: 
  https://unicode.org/emoji/charts/emoji-list.html
    */  
  String convertToEmoji(String code){
    return String.valueOf(Character.toChars( Integer.parseInt(code, 16) ));
  }


    /* 2:  Write a fn totalWithTax() that accepts an array of prices and returns the sum of the prices plus tax. Use the 2023 NYC sales tax rate of 8.875%.
  To test the function, create an array of prices in the init function.
    */ 


    /* 3:  Create a fn isPresent() that accepts an array of integers and one integer number. Return true if the number is in the array; otherwise return false.
  To test the fn, create an array of integers.
    */ 



    /* 4:  Create a fn checkLotto() that accepts an array representing 6 lotto number picks and an array representing 6 lotto numbers drawn. It returns how many winning number picks were present among the lotto numbers drawn. 
  HINT: make use of the function isPresent() from problem 3.

  To test the function, create an array representing your lotto number picks and another array representing the lotto numbers drawn
    */ 


  // 5: Write a fn biggest() that accepts an array of integers and returns the largest value in the array.

  
    /* 6:  Write a fn primeList() that takes in an integer N and returns the first N prime numbers. Use the function isPrime() provided to you.
    */ 

    

  

  // fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }
  
  // fn to determine prime # or not
  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
  
}