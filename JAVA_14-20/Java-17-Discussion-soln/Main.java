class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(reverse("Hello"));
    print("------- * -------");
    
    print(encryption1("father")); // even # of characters
    print(encryption1("Smith"));  // odd # of characters
  }
  // Reverse of a given string
  String reverse(String s){
    String build="";

    for(int x=s.length()-1; x>=0; x--)
        build += s.substring(x, x+1);

    return build;
  }

  // Swapping every two characters of a given string
  String encryption1(String s){
    String build = "";
    for(int x=0; x<=s.length()-2; x+=2){
        build += s.substring(x+1,x+2) + s.substring(x,x+1);
    }

    //if original string has an odd number of characters: add the last character to the end of the new string you generated
    if(s.length()%2 == 1)
        build += s.substring(s.length()-1);
    return build;
  }
  
}