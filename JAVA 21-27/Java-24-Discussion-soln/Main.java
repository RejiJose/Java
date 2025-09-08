class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // cast a character to its ASCII integer(decimal) value
    int ascii = (int)'A';
    print(ascii);
    
    // cast an ASCII decimal value to its equivalent character
    char ch = (char)90;
    print(ch);

    //Introduce "charAt(index)" to traverse a string, one character at a time, and display the ASCII value
    String msg = "Welcome";
    for(int x=0; x<=msg.length()-1; x++){
      ch = msg.charAt(x); // get the character at a specific index
      // Note: substring() would give you a String, but charAt gives a char.
      print( ch+ " : "+ (int)ch );
    }

    //Generate a string of the alphabet A-Z
    String build = "";
    for(int x=65; x<=90;x++){
      build += (char)x;
    }
    print(build);
    
    //Generate a string of 10 random uppercase letters from A-Z
    build = "";
    
    for(int x=1; x<=10; x++){
      ascii = randInt(65,90);
      build += (char)ascii;
    }
    print(build);    

  }

 
  //fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}