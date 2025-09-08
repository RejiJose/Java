class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

void init(){
    /*
    Task: Modify the Caesar Cipher functions encode() and decode() to shift by another number (say +2 or +4) and still keep the wrapping effect like the CW example.
    */

// 1) Encode a simple string 
    String msg ="ABCDXYZ abz";
    String encodedMsg = encode(msg);

    System.out.println("Original msg: " + msg);
    System.out.println("encoded msg: " + encodedMsg);

  // 2) Read in an original text file, encode it, and write into file Encoded.txt
    // msg = Input.readFile("Original.txt"); // readFile() will read from a file
    // encodedMsg = encode(msg);
    // Input.writeFile("Encoded.txt",encodedMsg); // writeFile() will write to a file

    // print("\n Check contents of Encoded.txt");

  // 3) Decode the encoded message and save to Decoded.txt
    encodedMsg = Input.readFile("Encoded.txt");
    String decodedMsg = decode(encodedMsg);
    Input.writeFile("Decoded.txt",decodedMsg);

    print("\n Check contents of Decoded.txt");
  }

  // fn for Caesar Cipher encoding(encrypting): shift of 2
   String encode(String txt){
    String build="";
    int ascii = 0;
    char ch = '\0'; //empty character

    for(int x=0; x<=txt.length()-1; x++){
      ch = txt.charAt(x);
      ascii = (int)ch;

      if(ascii == 89){ //make 'Y' into 'A'
        ascii = 65;
      }else if(ascii == 90){ //make 'Z' into 'B'
        ascii = 66;
      }else if(ascii == 121){ //make 'y' into 'a'
        ascii = 97;
      }else if(ascii == 122){ //make 'z' into 'b'
        ascii = 98;
      }
      else{ //increment all other ASCII codes by 2
        ascii += 2;
      }
      build += (char)ascii;
    }

    return build;
  }

  // fn to decode(decrypt) a Caesar Cipher: shift of 2
  String decode(String txt){
    String build = "";
    int ascii = 0;
    char ch = '\0';

    for(int x=0; x<=txt.length()-1;x++){
      ch = txt.charAt(x);
      ascii = (int)ch;

      if(ascii == 65){ //make 'A' into 'Y'
        ascii = 89;
      }else if(ascii == 66){ //make 'B' into 'Z'
        ascii = 90;
      }else if(ascii == 97){ //make 'a' into 'y'
        ascii = 121;
      }else if(ascii == 98){ //make 'b' into 'z'
        ascii = 122;
      }
      else{
        ascii -= 2;  //decrement other ASCII codes by 2
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