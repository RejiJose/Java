class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // Invoke functions here
    System.out.println( creditCardType("3400-1234-5678-0015") );
    System.out.println( creditCardType("5522-1234-5678-0015") );

    System.out.println( pigLatin("Holiday") );
    System.out.println( pigLatin("Regal") );

    System.out.println( nycLocate("11361") );
    System.out.println( nycLocate("10004") );

    System.out.println( getMonth("11/07/2023") );
    System.out.println( getMonth("03/13/2019") );

    System.out.println( validatePswd("123#why?") );
    System.out.println( validatePswd("abcd") );
    System.out.println( validatePswd("abc*123") );
  }

  /*
  Challenge 1:
  Write a function creditCardType() that accepts a credit card number (as a string) and returns the type of credit card based on the starting numbers (see below)
  Starts with:
  4 - Visa
  34 or 37 - American Express
  36 - Diner's Club
  51 or 55 - Mastercard
  6011 or 65 - Discover
  */
  String creditCardType(String num){
    if(num.substring(0,1).equals("4"))
      return "Visa";
    else if (num.substring(0,2).equals("34") || num.substring(0,2).equals("37"))
      return "American Express";
    else if (num.substring(0,2).equals("51") || num.substring(0,2).equals("55"))
      return "Mastercard";
    else if (num.substring(0,2).equals("36"))
      return "Diner's Club";
    else if (num.substring(0,2).equals("65") || num.substring(0,4).equals("6011"))
      return "Discover";
    else
      return "Unknown card type";
  }

  /*
  Challenge 2:
  Write a function pigLatin() which accepts a word and returns a new word made up by switching the fist letter with the rest of the word and adding "ay" after. Example: "pig"==> "igpay"
  */
  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }


  /*
  Challenge 3:
  Write a function nycLocate() that accepts a zip code (as a string) and returns the appropriate NYC borough determined by the fist three numbers of the zip code.
  Starting numbers of zip code:
  Manhattan :100, 101, 102
  Staten Island : 103
  Bronx : 104
  Brooklyn : 112
  Queens : 113, 114, 111
  */
  String nycLocate(String zip){
    String pre = zip.substring(0,3);

    if(pre.equals("100") || pre.equals("101") || pre.equals("102"))
      return "Manhattan";
    else if (pre.equals("103"))
      return "Staten Island";
    else if (pre.equals("103"))
      return "Bronx";
    else if (pre.equals("112"))
      return "Brooklyn";
    else if(pre.equals("113") || pre.equals("111") || pre.equals("114"))
      return "Queens";
    else
      return "Unknown";
  }

  /*
  Challenge 4:
  Create a function getMonth() that accepts a date in the format MM/DD/YYYY and returns the month: Example 07/21/2023 ==> "July"
*/
  String getMonth(String date){
    String month = date.substring(0,2);
    if (month.equals("01"))
      return "January";
    else if (month.equals("02"))
      return "Febuary";
    else if (month.equals("03"))
      return "March";
    else if (month.equals("04"))
      return "April";
    else if (month.equals("05"))
      return "May";
    else if (month.equals("06"))
      return "June";
    else if (month.equals("07"))
      return "July";
    else if (month.equals("08"))
      return "August";
    else if (month.equals("09"))
      return "September";
    else if (month.equals("10"))
      return "October";
    else if (month.equals("11"))
      return "November";
    else if (month.equals("12"))
      return "December";
    else 
      return "Unknown";
  }

  /*
  Challenge 5:
  Create a function validatePswd() that accepts a password. The password must have 5 to 8 characters that are letters, numbers or any symbol except ^, *, (, )
  Return true if it's a valid password; otherwise return false.
  */
  boolean validatePswd(String pswd){

    if(pswd.length()>=5 && pswd.length()<=8){
      if( pswd.indexOf("^") == -1 && pswd.indexOf("*") == -1 &&
          pswd.indexOf("(") == -1 && pswd.indexOf(")") == -1 )
        return true;
      else
        return false;
    }
    else
      return false;
  }
  
}