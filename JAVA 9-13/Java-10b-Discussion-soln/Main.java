class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    // 1: Covid Test
    System.out.println(covidTest(12));
    System.out.println(covidTest(10));
    
    // 2: Weather 1
    System.out.println(weather1(69));
    System.out.println(weather1(40));
    
    // 3: Weather 2
    System.out.println(weather2(69));
    System.out.println(weather2(40));
    
    // 4: play Today
    System.out.println(playToday(67,9));
    System.out.println(playToday(67,16));

  }

  /* 1:
    Write a function covidTest() that takes a gradeLevel 
    (ie, 9,10,11,12) and returns a string "Nasal Test today"
    for a student who is either a freshman or senior; otherwise it
    returns "Not today".
   */
  String covidTest(int gradeLevel){
    if(gradeLevel == 9 || gradeLevel==12)
      return "Nasal Test today";
    else
      return "Not today";
  }
   
    
  /*2: 
    Write a function weather1() that takes a 
    temperature and returns a string "Nice Weather"
    if the temperature is between 60 and 80 degrees 
    inclusive (i.e., it includes 60 and 80); otherwise it returns
    "Not Nice Weather"
    
    Do this using the 'and' logical operator    
  */
    String weather1(double temp){
      if (temp>=60 && temp<=80)
        return "Nice Weather";
      else
        return "Not Nice Weather";
    }  

  /* 3:
    Write a fuction weather2() that is the same as the
    function weather1 above, except use nested if statements.
  */
  
  String weather2(double temp){
      if (temp>=60)
          if(temp<=80)
            return "Nice Weather";
          else
            return "Not Nice Weather";
      else 
        return "Not Nice Weather";
    }

   
  /* 4:
    Write a function playToday() that accepts a temperature and 
    the number of players and returns a string display "Game is on!" 
    if the temperature is between 60 and 70 exlusively (not including 
    60 and 70) and the number of players is 9 or 18; otherwise return 
    "No Game today."
  */

  String playToday(double temp, int players){
    if (temp>=60 && temp<=70 && (players == 9 || players==18) )
      // Note: the use of ( ) to control proper logic
      return "Game is on!";
    else
      return "No Game today";
  }

}