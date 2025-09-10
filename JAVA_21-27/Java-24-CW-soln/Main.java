class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // #1
    print( toUpper("The #12 Houses!") );

    // #2
    print( pswdGenerator() );
  }
    /*
    Problem 1:
    Write a fn toUpper() that accepts a string and converts all lower case letters to upper case and returns the result.
    */
  String toUpper(String s){
    String build = "";
    char ch ='\0'; //empty character
    int ascii = 0;
    
    for(int x=0; x<=s.length()-1; x++){
      ch = s.charAt(x);
      ascii = (int)ch;
      if (ascii>=97 && ascii<=122){ // between a and z
        ascii -= 32;
        ch = (char)ascii;
      }
      build += ch;
    }
    return build;
  }

    /*
    Problem 2:
    Write a fn pswdGenerator() that generates and returns a 9-character password.
  */
  String pswdGenerator(){
    String build="";    
    char ch = '\0';
    int ascii = 0;
    
    for(int x=1; x<=9; x++){
      ascii = randInt(33,126); //ASCII range for all single characters
      ch = (char)ascii;
      build += ch;
    }
    return build;
  }

   
  //fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }
 
}