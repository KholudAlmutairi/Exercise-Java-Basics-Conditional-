import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // Exercise (Java Basics)
        //----------------------------------------------1---------------------------------------------
        /*1. Develop a program that takes the weight (in kilograms) and height (in meters) as
        input and calculates the BMI, then prints it*/

        /*System.out.print("Weight (kg) =: ");
        float weight = input.nextFloat();
        System.out.print("Height (m) : ");
        float height = input.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);*/


        //-----------------------------------------------2---------------------------------------------
        /*2. Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.*/

        /*System.out.print("Obtained Marks = ");
        float obtainedMarks = input.nextFloat();
        System.out.print("Total Marks= ");
        float totalMarks = input.nextFloat();
        float Percentage= (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage = " + Percentage+"%");*/

        //-----------------------------------------------3---------------------------------------------
       /* 3. Create a program that takes an amount in one currency and an exchange rate as
        input, then converts and prints the amount in another currency*/


        /*System.out.print("Amount in USD: ");
        double amountUSD = input.nextDouble();
        System.out.print("Exchange Rate (USD to EUR) : ");
        double exchangeRate = input.nextDouble();
        double amountEUR =  amountUSD * exchangeRate;

        System.out.print("Amount in EUR="+" "+ amountEUR);*/


        //-----------------------------------------------4---------------------------------------------
       /* 4. Create a program that takes a string as input, calculates its length, and then reverses
        the string using the StringBuilder class, finally printing both the length and reversed
        string*/

        /*System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Length of the string: " + str.length()+" And Reversed string: " + reversedStr);*/


        //-----------------------------------------------5---------------------------------------------

      /* 5. Develop a program that takes a sentence as input and extracts a substring from it,then prints the extracted substring.*/

       /*
        System.out.print("Enter the Sentence =");
        String str1= input.nextLine();
        System.out.print("Start Index=");
        int startIndex= input.nextInt();
        System.out.print("End Index=");
        int endIndex= input.nextInt();
        System.out.println(str1.substring(startIndex, endIndex));*/

        //-----------------------------------------------6---------------------------------------------
       /* 6. Write a program that takes a sentence and a keyword as input, then check if the
        keyword is present in the sentence and prints the result.*/

        /*System.out.print("Enter the Sentence=");
        String sentence = input.nextLine();
        System.out.print("Enter the keyword=");
        String keyword = input.nextLine();
        if(sentence.contains(keyword)){
            System.out.print("Keyword " + keyword + " is present in the sentence.");

        } else
           { System.out.print("Keyword "+ keyword+" is not present in the sentence.");}*/

        //-----------------------------------------------7---------------------------------------------

       /* 7. Develop a program that takes a sentence and a word to replace as input, then replace all
       occurrences of the word with another word and prints the modified sentence.*/

        /*System.out.print("Enter the Sentence=");
        String sentence=input.nextLine();
        System.out.print("Enter the Replace Word =");
        String replaceWord =input.nextLine();
        System.out.print("Enter the Replacement Word=");
        String replacementWord=input.nextLine();
        System.out.println(sentence.replace(replaceWord,replacementWord));*/


        //-----------------------------------------------8---------------------------------------------
      /*  8. Write a program that takes two strings as input and check if they are equal, ignoring
        the case, then prints whether they are equal or not.*/
        /*System.out.println("Enter the String 1=");
        String str1 = input.nextLine();
        System.out.println("Enter the String 2=");
        String str2 = input.nextLine();
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are equal");
        }else
            System.out.println("Strings are not equal");*/

        //Exercise (Conditional)
        //-----------------------------------------------1---------------------------------------------
        //1.Write a program that checks the role of the user
               /* System.out.print("Enter your role (admin, superuser, user): ");
                String role = input.next();
                if ("admin".equalsIgnoreCase(role)) {
                    System.out.println("Welcome admin");
                } else if ("superuser".equalsIgnoreCase(role)) {
                    System.out.println("Welcome superuser");
                } else if ("user".equalsIgnoreCase(role)) {
                    System.out.println("Welcome user");
                } else {
                    System.out.println("Invalid role");
                }*/

        //-----------------------------------------------2---------------------------------------------
        /*Take three numbers from the user and print the greatest number. */
         /*System.out.print("Input the 1st number: ");
         int firstNum = input.nextInt();
         System.out.print("Input the 2nd number: ");
         int secondNum = input.nextInt();
         System.out.print("Input the 3rd number: ");
         int thirdNum = input.nextInt();
         int greatestNumber;
            if (firstNum>= secondNum && firstNum >= thirdNum) {
                greatestNumber = firstNum;
            } else if (secondNum>= firstNum && secondNum >= thirdNum) {
                greatestNumber = secondNum;
            } else {
                greatestNumber = thirdNum;
            }
            System.out.println("The greatest: " + greatestNumber);*/
        //-----------------------------------------------3---------------------------------------------
        /*System.out.println("Enter an integer between 1 and 7 and displays the name of the weekday");
        int numberWeekday = input.nextInt();

        switch (numberWeekday) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number");*/
        //-----------------------------------------------4---------------------------------------------
        /*4. Write a program that takes a numeric score as input and prints the
        corresponding letter grade using the grading scale.*/

        System.out.print("Enter your numeric score: ");
        int score = input.nextInt();
        System.out.println("Numeric Score: " + score);
        char grade;
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }

        // Print the corresponding letter grade
        System.out.println("Letter Grade: " + grade);

        //-----------------------------------------------5---------------------------------------------
        /* 5. Write a Java program that takes a person's age as input and
        categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.*/

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age < 13) {
            System.out.println("You are a Child ");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager ");
        } else {
            System.out.println("You are an Adult ");
        }


    }
    }




















































































