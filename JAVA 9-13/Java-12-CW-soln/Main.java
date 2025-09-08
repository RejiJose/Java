class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
  // college credit 
  System.out.println(collegeCredit("MKUFCE1"));
  System.out.println(collegeCredit("MKUFC1"));
  // counselor
  System.out.println(getCounselor("1D0"));
  System.out.println(getCounselor("D10"));
  System.out.println(getCounselor("1F0"));
  System.out.println(getCounselor("1C0"));
  System.out.println(getCounselor("1G0"));
  System.out.println(getCounselor("X10"));
  // image type
  System.out.println(imageType("firstQuarter.png"));
  System.out.println(imageType("documentX.pdf"));
  System.out.println(imageType("pic1.JPEG"));
  System.out.println(imageType("pic2.jpg"));
  System.out.println(imageType("ironman.gif"));
    
  }
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/
  boolean collegeCredit(String course){
    if(course.substring(5,6).equals("M") ||
       course.substring(5,6).equals("E") )
      return true;
    else
      return false;
  }
  
/*
Problem 2:
Write a function getCounselor() that accepts a student's official class code and returns their guidance counselor based on the either the first or the middle character of the official class code being:
B-Berrouet
C-Chu
D-Dinn
E-Eyzengart
F-Flores
G-Gibson
*/
  String getCounselor(String ofcl){
    if(ofcl.substring(0,1).equals("D") || ofcl.substring(1,2).equals("D")){
      return  "Dinn";
    }
    else if(ofcl.substring(0,1).equals("F") || ofcl.substring(1,2).equals("F")){
      return  "Flores";
    }
    else if(ofcl.substring(0,1).equals("C") || ofcl.substring(1,2).equals("C")){
      return  "Chu";
    }
    else if(ofcl.substring(0,1).equals("G") || ofcl.substring(1,2).equals("G")){
      return  "Gibson";
    }
    else
      return "GC unknown";
  }

/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/  
  String imageType(String fileName){
    int pos = fileName.indexOf(".");
    
    if (fileName.substring(pos+1).equalsIgnoreCase("JPEG") || fileName.substring(pos+1).equalsIgnoreCase("JPG")){
        return "Joint Photograpic Experts Group";
       }
    else if (fileName.substring(pos+1).equalsIgnoreCase("PNG") ){
        return "Portable Network Graphics";
       }
    else if (fileName.substring(pos+1).equalsIgnoreCase("GIF") ){
        return "Graphics Interchage Format";
       }
    else if (fileName.substring(pos+1).equalsIgnoreCase("PDF") ){
        return "Portable Document Format(not an image type)";
       }
    else 
      return "Unknow file type";
  }
  
}