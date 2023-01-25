
/* Author         :  Mohamed Asad Bandarkar
   Program Name   :  fixErrorsTutorial1.java
   Purpose        :  The program prints to the screen the amount of years Mr Andre Henney has studied Computer Science at UWC.
   Student Number: 4271451 
*/


class Main {
  public static void main(String[] args) {
    String nameSurname;
    nameSurname = "Andre Henney";
    System.out.println("My name is "+ nameSurname);

    int yearOfFirstReg;
    yearOfFirstReg = 2019;
    System.out.println( yearOfFirstReg + " was my first year of registration for B.Sc Computer Science.");

    int currentYearOfStudy;
    currentYearOfStudy = 2022;

  

    int amountyears;
    amountyears = currentYearOfStudy - yearOfFirstReg;

    System.out.println("I have been studying for "+ amountyears +" years.");

    
  }
}