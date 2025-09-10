class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
   
    String s1 = "Larry";
    String s2 = "Mo";
    
    // Comparing if two strings are equal
    // The .equals() function returns a boolean
    System.out.println( s1.equals("Larry") );
    System.out.println( s1.equals(s2) );
    
    if(s1.equals("Larry"))
      System.out.println("Larry is Larry");
    
    // To ignore case sensitivity when comparing strings, use equalsIgnoreCase()
    if(s1.equalsIgnoreCase("larry"))
      System.out.println("larry is still Larry");

    // How to check if a string is not equal to another string
    if( !s1.equals(s2) ){
      System.out.println("Strings are not equal");
    }

    // How to check if a course is a Math or CS course? (their codes start with "M")
    String course = "MKUFTC";
    if (course.substring(0,1).equals("M"))
      System.out.println("This is a Math/CS course");
  }

}