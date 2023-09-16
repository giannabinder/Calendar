import java.util.Scanner; //import Scanner class

public class FinalMajorAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Input = new Scanner (System.in); //declare Input as an object of Scanner, tells java this will be the input
        
        //tell user what the program will do
        System.out.println("Program one prints a 12 month calendar of any given year from year 1900.\n"
                + "Program two prints a month calendar for any month of any year after 1900.\n"
                + "Program three returns the day of the week for any given date from year 1900.\n"
                + "Program four displays the date from any number of days after February 26, 2021.");
        
        System.out.println(); //create an empty line for organization
        
        //declare variable to determine whether the while loop will run
        char run = 'y';
        
        //create while loop to continue program as long as 'run''s value is 'y' or 'Y'
        while (run == 'y' || run == 'Y'){
            
            //declare variables
            int program;
            
            //ask user which program they would like to run
            System.out.print("Which program would you like to run, 1, 2, 3, 4? If you would like to run them all, enter 5: ");
            program = Input.nextInt();
            
            //create while loop so correct input for program is entered
            while (program != 1 && program != 2 && program != 3 && program != 4 && program != 5){
                
                System.out.println(); //create an empty line for organization
                
                //tell user they entered an invalid input
                System.out.println("Invalid input!");
                System.out.println("Please re-enter the program you would like to run.");
                    
                System.out.println(); // create empty line for organization
                
                //ask user which program they would like to run
                System.out.print("Which program would you like to run, 1, 2, 3, 4? If you would like to run them all, enter 5: ");
                program = Input.nextInt();
            }
            
                            
            System.out.println(); // create empty line for organization
            System.out.println("----------------------------------------------------------------"); //create line for organization
            System.out.println(); // create line for organization
            
            //if user wants to run the year calendar program or all
            if (program == 1 || program == 5){
                
                System.out.println("\nProgram 1: Year Calendar"); //tell user which program is running

                //variable declaration
                int year;


                //ask user to input the value of the variables
                System.out.print("Enter the year (1900 or later): ");
                year = Input.nextInt();
                
                //invalid input entered
                while (year < 1900){
                    
                    System.out.println(); //create an empty line for organization
                    
                    //tell user the input was invalid
                    System.out.println("Invalid input!");
                    System.out.println("Re-enter the year");
                    System.out.println(); //create an empty line for organization
                    
                    //ask user to input the value of the variables
                    System.out.print("Enter the year (1900 or later): ");
                    year = Input.nextInt();
                }
                
                System.out.println(); //create an empty line for organization
                    
                //call method
                yearCalendar(year);
                
                                
                System.out.println(); // create empty line for organization
                System.out.println("----------------------------------------------------------------"); //create line for organization
                System.out.println(); // create line for organization

            }
            
            //if user wants to run the month calendar program or all
            if (program == 2 || program == 5){
                
                System.out.println("\nProgram 2: Month Calendar"); //tell user which program is running

                //variable declaration
                int year;
                String month;
                
                //ask user to input the value of the variables
                System.out.print("Enter the month (Upper-case starting letter and full word): ");
                month = Input.nextLine();//********************************************************************
                month = Input.nextLine();
                
                //invalid input for month
                while (!month.equals ("January") && !month.equals ("February") && !month.equals ("March") && 
                        !month.equals ("April") && !month.equals ("May") && !month.equals ("June") && !month.equals ("July") 
                        && !month.equals ("August") && !month.equals ("September") && !month.equals ("November") && !month.equals ("October") && 
                        !month.equals ("December")){
                    System.out.println(); //create an empty line for organization
                    
                    //tell user the input was invalid
                    System.out.println("Invalid input!");
                    System.out.println("Re-enter the month.\nIt must be spelled correctly, be the full word, and start with a capital letter.");
                    System.out.println(); //create an empty line for organization
                    
                    //ask user to input the value of the variables
                    System.out.print("Enter the month (Upper-case starting letter and full word): ");
                    month = Input.nextLine();//********************************************************************
                    month = Input.nextLine();
                }
                
                //ask user to input the value of the variables
                System.out.print("Enter the year (1900 or later): ");
                year = Input.nextInt();
                
                //invalid input entered for year
                while (year < 1900){
                    
                    System.out.println(); //create an empty line for organization
                    
                    //tell user the input was invalid
                    System.out.println("Invalid input!");
                    System.out.println("Re-enter the year, it must not be less than 1900");
                    System.out.println(); //create an empty line for organization
                    
                    //ask user to input the value of the variables
                    System.out.print("Enter the year (1900 or later): ");
                    year = Input.nextInt();
                }
                
                System.out.println(); //create an empty line for organization
                    
                //call method
                monthCalendar(month, year);
                                
                System.out.println(); // create empty line for organization
                System.out.println("----------------------------------------------------------------"); //create line for organization
                System.out.println(); // create line for organization

            }
            
            //if user wants to run the day name finder program or all
            if (program == 3 || program == 5){
                
                System.out.println("\nProgram 3: Day Name Finder"); //tell user which program is running

                //variable declaration
                int year, day;
                String month;
                
                //ask user to input the value of the variables
                System.out.print("Enter the month (Upper-case starting letter and full word): ");
                month = Input.nextLine();//********************************************************************
                month = Input.nextLine();

                //invalid input for month
                while (!month.equals ("January") && !month.equals ("February") && !month.equals ("March") && 
                        !month.equals ("April") && !month.equals ("May") && !month.equals ("June") && !month.equals ("July") 
                        && !month.equals ("August") && !month.equals ("September") && !month.equals ("November") && !month.equals ("October") && 
                        !month.equals ("December")){
                    System.out.println(); //create an empty line for organization
                    
                    //tell user the input was invalid
                    System.out.println("Invalid input!");
                    System.out.println("Re-enter the month");
                    System.out.println(); //create an empty line for organization
                    
                    //ask user to input the value of the variables
                    System.out.print("Enter the month (Upper-case starting letter and full word): ");
                    month = Input.nextLine();//********************************************************************
                    month = Input.nextLine();
                }


                //ask user to input the value of the variables
                System.out.print("Enter the year (1900 or later): ");
                year = Input.nextInt();
                
                //invalid input entered for year
                while (year < 1900){
                    
                    System.out.println(); //create an empty line for organization
                    
                    //tell user the input was invalid
                    System.out.println("Invalid input!");
                    System.out.println("Re-enter the year");
                    System.out.println(); //create an empty line for organization
                    
                    //ask user to input the value of the variables
                    System.out.print("Enter the year (1900 or later): ");
                    year = Input.nextInt();
                }
                
                //ask user to input the value of the variables
                System.out.print("Enter the day: ");
                day = Input.nextInt();
                
                //find if the input for the date is valid
                if (month.equals ("February") && leapYear(year)){
                    while (day < 1 || day > 29){
                        //tell user the input is invalid
                        System.out.println("Invalid Input");
                        System.out.println(year + " is a leap year. The date cannot be less than one or more the 29.");
                        System.out.println("Please re-enter the date.");
                        //ask user to input the value of the variables
                        System.out.print("Enter the day: ");
                        day = Input.nextInt();
                    }
                }
                
                else if  (month.equals ("February") && !leapYear(year)){
                    while (day < 1 || day > 28){
                        
                        //tell user the input is invalid
                        System.out.println("Invalid Input");
                        System.out.println(year + " is not a leap year. The date cannot be less than one or more the 28.");
                        System.out.println("Please re-enter the date.");
                        //ask user to input the value of the variables
                        System.out.print("Enter the day: ");
                        day = Input.nextInt();
                    }
                }
                
                else if (month.equals ("January") || month.equals ("March") || month.equals ("May") || month.equals ("July") ||
                        month.equals ("August") || month.equals ("October") || month.equals ("December")){
                    while (day < 1 || day > 31){
                        //tell user the input is invalid
                        System.out.println("Invalid Input");
                        System.out.println(month + " cannot have a day greater than 31 or less than 1");
                        System.out.println("Please re-enter the date.");
                        //ask user to input the value of the variables
                        System.out.print("Enter the day: ");
                        day = Input.nextInt();
                    }
                }
                
                if (month.equals ("April") || month.equals ("June") || month.equals ("September") || month.equals ("November")){
                    while (day < 1 || day > 30){
                        //tell user the inout is invalid
                        System.out.println("Invalid Input");
                        System.out.println(month + " cannot have a day greater than 30 or less than 1");
                        System.out.println("Please re-enter the date.");
                        //ask user to input the value of the variables
                        System.out.print("Enter the day: ");
                        day = Input.nextInt();
                    }
                }
                
                System.out.println(); //create an empty line for organization
                    
                //call method
                //print the answer to the user
                System.out.println("The day of the week for " + month + " " + day + ", " + year + " is a " + dayNameFinder(month, day, year) + ".");
                
                System.out.println(); // create empty line for organization
                System.out.println("----------------------------------------------------------------"); //create line for organization
                System.out.println(); // create line for organization

            }
            
            //if user wants to run program 4 or all
            if (program == 4 || program == 5){
                
                System.out.println("\nProgram 4: Date Finder"); //tell user which program is running

                //variable declaration
                int n;


                //ask user to input the value of the variables
                System.out.print("Enter number of days: ");
                n = Input.nextInt();
                
                //invalid input entered
                while (n < 1){
                    
                    System.out.println(); //create an empty line for organization
                    
                    //tell user the input was invalid
                    System.out.println("Invalid input!");
                    System.out.println("Re-enter a number, it must be positive");
                    System.out.println(); //create an empty line for organization
                    
                    //ask user to input the value of the variables
                    System.out.print("Enter number of days: ");
                    n = Input.nextInt();
                }
                
                System.out.println(); //create an empty line for organization
                    
                //call method
                dateFinder(n);
                
                                
                System.out.println(); // create empty line for organization
                System.out.println("----------------------------------------------------------------"); //create line for organization
                System.out.println(); // create line for organization

            }
 
            System.out.println(); // create empty line for organization


            //Ask user if they would like to rerun the program
            System.out.print ("Would you like to run this program again (enter 'y' or 'Y' if you would)? ");
            run = Input.next().charAt(0); //first letter entered will be recorded



            System.out.println(); // create empty line for organization
            System.out.println("----------------------------------------------------------------"); //create line for organization
            System.out.println(); // create line for organization 
        }
        
        //Thank user for using this program
       System.out.println ("Thank you for using this program!");
       
       
       System.out.println(); // create empty line for organization
       System.out.println("----------------------------------------------------------------"); //create line for organization
       System.out.println(); // create line for organization

    }
    
    //define methods
    
    //method to print the year 
    public static void yearCalendar(int year){
        //print year, formatted
        System.out.printf("%29s\n", year);
        
        //declare variable
        String month;
        
        //create for loop so the calendar prints multiple months
        for (int monthNum = 1; monthNum <= 12; monthNum++){
            
            //names the months
            switch (monthNum){
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                default:
                    month = "December";
                    break;          
            }
            //call method to print the month
            monthCalendar(month, year);
        }
    }
    
    //method to print a month
    public static void monthCalendar(String month, int year){
        
        //declare varaible
        int days, dayOfWeek, monthNum;
        
        
        //create switch statement to give a value to monthNum and determine how many days are in each month 
        switch (month){
            case "January":
                
                //determine how many days are in the month
                days = 31;
                break;
                
                
            case "February":
                month = "February";
                
                //determine how many days are in the month
                if (leapYear(year))
                    days = 29;

                else 
                    days = 28;
                break;

                
                
            case "March":
                month = "March";

                //determine how many days are in the month
                days = 31;
                break;
                
                
            case "April":
                
                //determine how many days are in the month
                days = 30;
                break;
                
                
            case "May":
                
                //determine how many days are in the month
                days = 31;
                break;
                
                
            case "June":
                
                //determine how many days are in the month
                days = 30;
                break;
                
            case "July":
                month = "July";
                
                //determine how many days are in the month
                days = 31;
                break;
                
            case "August":
                month = "August";
                
                //determine how many days are in the month
                days = 31;
                break;
                
            case "September":
                month= "September";
                
                //determine how many days are in the month
                days = 30;
                break;
                
            case "October":
                
                //determine how many days are in the month
                days = 31;
                break;
                
            case "November":
                
                //determine how many days are in the month
                days = 30;
                break;

            default:
                
                //determine how many days are in the month
                days = 31;
 
                break;
        }
        //find the day of the week the month starts on
        dayOfWeek = dayStart(month, year);
        
        //call method to get the variable "monthNum"
        monthNum = monthNum(month);
        //call method to print the calendar
        printMonth(dayOfWeek, days, year, monthNum, month);
    }
    
    //method to print the week days and the spaces to line up the dates
    public static void printMonth(int dayOfWeek , int days, int year, int monthNum, String month){
        
        //print the month, formatted
        System.out.printf("%30s\n", month);

        //print the days of the week, formatted
        System.out.printf("%7s%7s%7s%7s%7s%7s%7s\n", "Mon", 
                "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

        //variable declaration 
        int num;
        
        //determine which day the month starts on by calling the method
        switch (dayStart(month, year)){
            
            //Tuesday
            case 1:
                //print spaces so the date lines up with the day of the week
                System.out.printf ("%7s", " ");
                
                //update variable
                num = 1;
                break;
                
            //Wednesday
            case 2: 
                //print spaces so the date lines up with the day of the week
                System.out.printf ("%14s", " ");
                
                //update variable
                num = 2; 
                break;
                
            //Thursday
            case 3: 
                //print spaces so the date lines up with the day of the week
                System.out.printf ("%21s", " ");
                
                //update variable
                num = 3;
                break;
                
                    
            //Friday
            case 4: 
                //print spaces so the date lines up with the day of the week
                System.out.printf ("%28s", " ");
                
                //update variable
                num = 4;
                break;
                
                    
            //Saturday
            case 5: 
                //print spaces so the date lines up with the day of the week
                System.out.printf ("%35s", " ");
                
                //update variable
                num = 5;
                break;
                
            //Sunday
            case 6: 
                //print spaces so the date lines up with the day of the week
                System.out.printf ("%42s", " ");
                
                //update variable
                num = 6;
                break;
                
            //Monday
            default:
                //no spaces will print as Monday is the start of the month on this calendar
                
                //update variable
                num = 0;
                break;
        }
                
        //call method to print the calendar
        printCalendar(num, days);
           
    }
    
    //print the dates
    public static void printCalendar(int num, int days){
        
        //create for loop to print the dates, variable 'dates' will increase by one until it equals the number of days in the month the user entered
        for (int dates = 1; dates <= days; dates++ ){
            //print the dates, formatted
            System.out.printf ("%7s", dates);
            
            //when the end of the week is reached, print the following dates on the next line
            if ((dates + num) % 7 == 0)
                System.out.println();
        }
        
        System.out.println(); // create empty line for organization 
    } 
    
    //determine if the year is a leap year
    public static boolean leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0)|| (year % 100 == 0 && year % 400 == 0))
            return true;
        else
            return false;    
    }
    
    //helps determine what day the month starts on
    public static int dayStart(String month, int year){
        
        //declare variable
        int numDays = 0;
        
        //call method to get the variable "monthNum"
        int monthNum = monthNum(month);
        
        //create if statement to find how much to add to 365
        for (int i = 1; i <= monthNum; i++)
        {
            switch(i){
                case 2:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    numDays += 31;
                    break;
                case 5:
                case 7:
                case 10:
                case 12:
                    numDays += 30;
                case 3:
                    if (leapYear(year))
                        numDays += 29;

                    else 
                        numDays += 28;
            }
        }
        
        //find amount of leap days have passed from 1900 to the year entered
        for (int year2 = 1900; year2 <= year; year2++){
            if (leapYear(year2))
                numDays += 1;
        }
  
        //assign variable a value and declare the variable
        int yearNum = year - 1900;
        
        //determine what day the month starts on, declare and assign value to variable
        int dayOfWeekNum = ((365 * yearNum) + numDays) % 7;

        
        return dayOfWeekNum;
    }
    
    //translate the month to a number
    public static int monthNum (String month){
        //declare varaible
        int monthNum;
        
        
        //create switch statement to give a value to monthNum and determine how many days are in each month 
        switch (month){
            case "January":
                
                //determine which number the month is
                monthNum = 1;
                break;
                
                
            case "February":
                
                //determine which number the month is
                monthNum = 2;
                break;

                
                
            case "March":

                //determine which number the month is
                monthNum = 3;
                break;
                
                
            case "April":
                
                //determine which number the month is
                monthNum = 4;
                break;
                
                
            case "May":
                
                //determine which number the month is
                monthNum = 5;
                break;
                
                
            case "June":
                
                //determine which number the month is
                monthNum = 6;
                break;
                
            case "July":
                month = "July";
                
                //determine which number the month is
                monthNum = 7;
                break;
                
            case "August":
                
                //determine which number the month is
                monthNum = 8;
                break;
                
            case "September":
                
                //determine which number the month is
                monthNum = 9;
                break;
                
            case "October":
                
                //determine which number the month is
                monthNum = 10;
                break;
                
            case "November":
                
                //determine which number the month is
                monthNum = 11;
                break;

            default:
                
                //determine which number the month is
                monthNum = 12;
 
                break;
        }
        
        return monthNum;
    }
    
    //method to find which day of the week the date entered is
    public static String dayNameFinder(String month, int day, int year){
        //declare variable
        int numDays = 0;
        
        //call method to get the variable "monthNum"
        int monthNum = monthNum(month);
        
        //create if statement to find how much to add to 365
        for (int i = 1; i <= monthNum; i++)
        {
            switch(i){
                case 2:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11:
                    numDays += 31;
                    break;
                case 5:
                case 7:
                case 10:
                case 12:
                    numDays += 30;
                case 3:
                    if (leapYear(year))
                        numDays += 29;

                    else 
                        numDays += 28;
            }
        }
        
        //find amount of leap days have passed from 1900 to the year entered
        for (int year2 = 1900; year2 <= year; year2++){
            if (leapYear(year2))
                numDays += 1;
        }
  
        //assign variable a value and declare the variable
        int yearNum = year - 1900;
        
        //determine what day the month starts on, declare and assign value to variable
        int dayOfWeekNum = ((365 * yearNum) + numDays + day - 1) % 7; //******************************************88
        
        //find the day of the week
        
        //declare variable
        String dayOfWeek;
        
        //create switch statement to get the day of the week
        switch (dayOfWeekNum){
            case 1:
                dayOfWeek = "Tuesday";
                break;
            case 2:
                dayOfWeek = "Wednesday";
                break;
            case 3:
                dayOfWeek = "Thursday";
                break;
            case 4:
                dayOfWeek = "Friday";
                break;
            case 5:
                dayOfWeek = "Saturday";
                break;
            case 6:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Monday";
                break;
        }
        return dayOfWeek;
    }
    
    //method to find the date after Feb. 1 2021
    public static void dateFinder (int n){
        
        //variable declaration
        int date = 1, year = 2021, monthNum = 2;
        
        for (int i = 1; i <= n; ++i){
            
            //update variable
            ++date;
            
            //if the month is complete, go to the next month and restart the date to 1
            if (leapYear(year) && monthNum == 2 && date > 29){
                monthNum = 3;
                date = 1;
            }
            
            else if (!leapYear(year) && monthNum == 2 && date > 28){
                monthNum = 3;
                date = 1;
                
            }
            
            else if ((monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10) && date > 31){
                monthNum++;
                date = 1; 
                
            }
            else if ((monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) && date > 30){
                monthNum++;
                date = 1; 
                
            }
            
            //if the year is complete go to January and the next month
            else if (monthNum == 12 && date > 31){
                monthNum = 1;
                date = 1;
                year++;
                
            }
        }
        
        //variable declaration
        String month;
        
        //create switch to get the month's word
        switch (monthNum){
            case 1:
                month = "January";
                break;
                
            case 2:
                month = "February";
                break;
                
            case 3:
                month = "March";
                System.out.println(month);
                break;
                
            case 4:
                month = "April";
                break;
                
            case 5:
                month = "May";
                break;
                
            case 6:
                month = "June";
                break;
                
            case 7:
                month = "July";
                break;
                
            case 8:
                month = "August";
                break;
                
            case 9:
                month = "September";
                break;
                
            case 10:
                month = "October";
                break;
                
            case 11:
                month = "November";
                break;
                
            default:
                month = "December";
                break;
        }
        
        //output the date to the user
        System.out.println(n + " days after February 1, 2021 is " + month + " " + date + ", " + year + ".");
    }
}