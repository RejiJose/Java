class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String msg = Input.readFile("paragraph.txt");
    print(numOfWords(msg) + " words");   
    print(countVowels(msg) + " vowels");  
  }

  // For each problem read from the file paragraph.txt .

  /*
  Problem 1:
  Write a function numOfWords() that accepts a string and counts the number of words in the string.
  Example: "To be or not to be"  ==> 6
  */
  int numOfWords(String s){
    int count = 1;
    for(int x=0; x<=s.length()-1; x++){
      String symbol = s.substring(x, x+1);
      if(symbol.equals(" "))
        count++;
    }
    return count;
  }

  /*
  Problem 2:
  Write a function countVowels() that accepts a string and returns the number of vowels contained in the string.
  Example: countVowels("Too be or not to be") ==> 7
  */
  int countVowels(String s){
    int count=0;
    for(int x=0; x<=s.length()-1; x++){
      String ch = s.substring(x, x+1);
      if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") ||
        ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||
        ch.equalsIgnoreCase("u") )
        count++;
    }
    return count;
  }
  
}