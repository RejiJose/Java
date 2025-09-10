class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // 1) Encode a simple string with a 'z' in it
    String msg ="ABCDXYZ abz";
    String encodedMsg = encode(msg);
    
    System.out.println("Original msg: " + msg);
    System.out.println("encoded msg: " + encodedMsg);

    // 2) Read in an original text file, encode it, and save file
     msg = Input.readFile("Original.txt"); // readFile() will read from a file
     encodedMsg = encode(msg);
     Input.writeFile("Encoded.txt",encodedMsg); // writeFile() will write to a file
    
    print("\n Check contents of Encoded.txt");
    
    // 3) Decode the encoded message
    encodedMsg = Input.readFile("Encoded.txt");
    String decodedMsg = decode(encodedMsg);
    Input.writeFile("Decoded.txt",decodedMsg);

    print("\n Check contents of Decoded.txt");
  }
  
  // fn for Caesar Cipher encoding(encrypting)
   String encode(String txt){
    String build="";
    int ascii = 0;
    char ch = '\0'; //empty character
     
    for(int x=0; x<=txt.length()-1; x++){
      ch = txt.charAt(x);
      ascii = (int)ch;
      
      if(ascii == 90){ //make 'Z' into 'A'
        ascii = 65;
      }
      else if(ascii == 122){ //make 'z' into 'a'
        ascii = 97;
      }
      else{ //increment all other ASCII codes by 1
        ascii++;
      }
      build += (char)ascii;
    }
     
    return build;
  }

  // fn to decode(decrypt) a Caesar Cipher
  String decode(String txt){
    String build = "";
    int ascii = 0;
    char ch = '\0';
    
    for(int x=0; x<=txt.length()-1;x++){
      ch = txt.charAt(x);
      ascii = (int)ch;
      
      if(ascii == 65){ //make 'A' into 'Z'
        ascii = 90;
      }
      else if( ascii == 97){ //make 'a' into 'z'
        ascii = 122;
      }
      else{
        ascii -= 1;  //decrement other ASCII codes by 1
      }
      build += (char)ascii;
    }
    return build;
  }

  //fn to generate random integer
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}