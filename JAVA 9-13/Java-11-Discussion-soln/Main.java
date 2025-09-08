// Exploring String functions
class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    String msg = "cat ate";

    int n = msg.length();
    System.out.println("Size of string: " + n);

    // getting pieces of a string using substring()
    String first3 = msg.substring(0,3);
    System.out.println(first3);

    String last3 = msg.substring(4,7);
    System.out.println(last3);

    // function substring() is overloaded
    String from5th = msg.substring(4);
    System.out.println(from5th);

    //How do we get the last character of a string
    String lastChar = msg.substring(msg.length()-1);
    System.out.println(lastChar);

    /*
      If a name has the following format: last_name,first_name (comma separated). 
      Extract the first and last names from it.
    */
    String name = "Doe,Jane";
    
    n = name.indexOf(",");
    String lName = name.substring(0,n);
    String fName = name.substring(n+1);
    System.out.println("First name: "+fName);
    System.out.println("Last name: "+lName);
  }
    
}