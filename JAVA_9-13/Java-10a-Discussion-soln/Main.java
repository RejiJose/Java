class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){  
    // Call the function sophomoreCheck()
     int age =15;
     String result = sophomoreCheck(age);
     System.out.println(result);
	 
    // System.out.println( sophomoreCheck(17) );

    
    // Call the function weather()
    // System.out.println( weather(40)) ;

        
    // Call the function batteryStatus()
    //System.out.println(batteryStatus(0.45));
    //System.out.println(batteryStatus(0.08));
    
  }

  // Define functions below

  /*
      Write a function sophomoreCheck() that takes in a
      student's age and if age is exactly 15, it returns a string 
      "Likely a sophomore"; otherwise it returns "Unknown".
  */
  String sophomoreCheck(int age){    
    if(age == 15){
      return "Likely a sophomore";
    }else{
      return "Unknown";
    } // Note: curly braces are used to group instructions
  }
  
  /*
      Write a function weather() that takes in a temperature in
      degrees and returns a string "Warm to Hot" if temperature
      is 70 degrees or more; otherwise it returns "Cool to Cold"
    */
  String weather(double temp){    
    if(temp >= 70)   // no need of {} for single instruction
      return "Warm to Hot"; 
    else
      return "Cool to Cold";
  }

  /*
      Write a function batteryStatus() that takes in the battery
      percentage charge and returns a string "Need to recharge" 
      if the battery charge is below 10%; otherwise it returns
      "Normal".
    */
  String batteryStatus(double charge){    
    if(charge < 0.1)
      return "Need to recharge";
    else
      return "Normal";
  }
  
}