class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(swapCharacter("the seen","e","%"));
    print("------- * -------");
    
    print(encryption2("abcdefgh"));
    print(encryption2("abcdefghi") );
    print("------- * -------");
    
    print(encryption3("abcdef"));
    print(encryption3("abcde"));
    
  }

  // reverse function for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  /*
  Problem 1:
  Write a function swapCharacter() that accepts a string to modify, a string(one character) to find, and a string(one character) to replace. The function returns a string with the 'find' strings replaced by the 'replace' string.
  Example: swapCharacter("the seen","e","%")  ==> "th% s%%n"
  */
  String swapCharacter(String s, String find, String replace){
    String build = "";

    for(int x=0; x<=s.length()-1; x++){
      if(s.substring(x,x+1).equals(find))
          build += replace;
      else
          build += s.substring(x,x+1);
    }
    return build;
  }

  /*
  Problem 2:
  Write a function encryption2() that accepts a string and returns the string where the orginal string is split in half and each letter from each half is used to create a new string.
  Examples:
  encryption2("abcdefgh") ==> "aebfcgdh"
    process:  "abcdefgh" -> "abcd" "efgh"  -> "aebfcgdh"

  encryption2("abcdefghi") ==> "aebfcgdhi"
   process:  "abcdefghi" -> "abcd" "efghi"  -> "aebfcgdhi"  
  */
  String encryption2(String s){
    String build="";
    int len = s.length();
    String fHalf = s.substring(0,len/2);
    String sHalf = s.substring(len/2);

    for(int x=0; x<=fHalf.length()-1; x++)
        build += fHalf.substring(x, x+1) + sHalf.substring(x, x+1);

    //if string is of odd length, add the last letter of second half-string
    if(len%2==1)
        build += sHalf.substring(sHalf.length()-1);
    
    return build;
  }

  /*
  Problem 3:
  Write a function encryption3() that accepts a string and returns the string that rearranges the characters of the original string in the order: 1st,last,2nd,last-1,3rd,last-2,...   and so on.
  Example:
  encryption3("abcdef")==> "afbecd"
  encryption3("abcde")==> "aebdc"
  */
  String encryption3(String s){
    String build="";
    int len=s.length();
    String fHalf = s.substring(0,len/2);
    String sHalf = s.substring(len/2);
    String sHalfRvrs = reverse(sHalf);

    for(int x=0; x<=fHalf.length()-1;x++){
      build += fHalf.substring(x,x+1) + sHalfRvrs.substring(x,x+1);
    }
    //if string is of odd length, add the last letter of reversed second half-string
    if(len%2==1)
      build += sHalfRvrs.substring(sHalfRvrs.length()-1);
    
    return build;
  }

  
}