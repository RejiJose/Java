class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // For this example, we will substitute a vowel with a specific unicode character as per the arrays sub[] and sub2[] below.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';

    char[] sub2 = new char[5];
    sub2[0] = '\u2663';  // Club
    sub2[1] = '\u2660';  // Spade
    sub2[2] = '\u2665';  // Heart
    sub2[3] = '\u2666';  // Diamond
    sub2[4] = '\u2836';  // Braille symbol

    print(indexOf('e', sub));
    print(indexOf('\u2836', sub2));
    
    String file = Input.readFile("Original.txt");
    String encodedMsg = subEncryption(file,sub,sub2);
    Input.writeFile("Encode.txt",encodedMsg);

    String decodedMsg = subEncryption(encodedMsg, sub2, sub);
    Input.writeFile("Decode.txt", decodedMsg);
    
    
  }
  // fn to encrypt by subtitution
  String subEncryption(String s, char[] sub, char[] sub2){
    String build = "";
    char ch ='\0';
    int index= -1;
    
    for(int x=0; x<=s.length()-1; x++){
      ch = s.charAt(x);
      index = indexOf(ch,sub);
      if(index != -1){
          build += sub2[index];
      }
      else{
          build += ch;
      }
    }
    return build;
  }

  // fn to provide the index position of a character within a given array
  int indexOf(char ch, char[] arry){
    for(int x=0; x<=arry.length-1; x++){
      if(arry[x]==ch){
        return x;
      }
    }
    return -1; // index is -1 if not found
  }

  // fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}