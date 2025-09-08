class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  
  void init(){
    // Create an array with known integer values
    int nums[] = {10,15,22,54,32,34,65,87,45,100,23,99,95,87,56,83};
    
    // Determine & print the sum of the array elements and their average.
    // print("Sum of elements: " + sumArray(nums));
    // print("Average of elements: " + avgArray(nums));

    // Create 2 parallel arrays of multiple choice quiz responses. Grade them. 
    char[] studentAns = {'A','A','B','C','C','C'};
    char[] ansKey     = {'A','B','B','C','D','C'};
    print("Score: "+ quizGrader(studentAns,ansKey));
  }

  // Fn to return the sum of array elements
  int sumArray(int[] n){
    int sum=0;
    for(int x=0; x<=n.length-1; x++){
      sum += n[x];
    }
    return sum;
  }

  // Fn to return the average of array elements
  double avgArray(int[] n){    
    return sumArray(n)/(double)n.length; // cast as double to avoid integer division
  }
  
  // Quiz grader
  double quizGrader(char[] ans, char[] ansKey){
    int score=0;
    for(int x=0; x<=ans.length-1; x++){
      if(ans[x] == ansKey[x]){
        score++;
      }
    }
    return (double)score/ans.length;
  }

  // Fn to generate random integers
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) +lower;
  }

}