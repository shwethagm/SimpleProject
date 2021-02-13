import java.sql.SQLOutput;
import java.util.Scanner;

class Practice {

    public void practice() {
        //1 program
        System.out.println("Hello World");
        //part2 program
        // System.out.println(("Ada Lovelace"));
        //3 program
        System.out.println(("Once upon a time"));
        System.out.println(("there was"));
        System.out.println("a program");
        // 4 program
        System.out.println(" a dinosaur");
        //part3-Printing

        Scanner scanner = new Scanner(System.in);
        //System.out.println("enter the string to be entered");
        String str = scanner.nextLine();
        System.out.println(str);

        //program2

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("write your message");
        String messa = scanner1.nextLine();
        System.out.println(messa);
        System.out.println(messa);
        System.out.println(messa);

        //program3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("What is your Name");
        String name = scanner3.nextLine();
        System.out.println("Hi" + " " + name);


    }

    //program4
    public void messageReader() {
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String messageone = input.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String messagetwo = input.nextLine();

        System.out.println("Thanks for sharing!\n");
        String messagethree = input.nextLine();

    }

    public void story() {
        Scanner input = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String name = input.nextLine();
        System.out.println("What is their job?");
        String job = input.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was Bob, who was a builder." + "\n" +
                "On the way to work," + name + " reflected on life." + "\n" +
                "Perhaps " + name + " will not be a " + "" +
                job + " forever." + "\n");

    }

//chapter4-Variables

    //program1
    public void integerInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number");
        int value = Integer.valueOf(input.nextLine());
        System.out.println("You gave the number " + value);

    }

    //program2
    public void doubleInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Give a Number");
        double value = Double.valueOf(input.nextLine());
        System.out.println("You gave the number " + value);


    }
    //program3

    public void differentTypeOfInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Give a string:");
        String value = input.nextLine();

        System.out.println("Give a Integer:");
        int valueInt = Integer.valueOf(input.nextLine());

        System.out.println("Give a Boolean:");
        boolean valueBoolean = Boolean.valueOf(input.nextLine());

        System.out.println("Give a Double:");
        Double valueDouble = Double.valueOf(input.nextLine());
        System.out.println("You gave the String " + value);
        System.out.println("You gave the Integer " + valueInt);
        System.out.println("You gave the Double " + valueDouble);
        System.out.println("You gave the Boolean " + valueBoolean);

    }

//part1-5 calculating with Numbers

//program1-seconds in a day


    public void secondsInaDay() {

        Scanner input = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?\n");
        int days = Integer.valueOf(input.nextLine());
        System.out.println(days * 60 * 60 * 24);
    }

//program2-sumofnumbers

    public void sumOfNumbers() {
        Scanner input=new Scanner((System.in));
        System.out.println("Give the first number: ");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int num2=Integer.valueOf(input.nextLine());
        System.out.println("The sum of the numbers is "+(num1+num2));
        System.out.println("The sum of the numbers is "+num1+num2);


    }
    //program3-sumofthreenumbers

    public void sumOfThreeNumbers() {
        Scanner input=new Scanner((System.in));
        System.out.println("Give the first number: ");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int num2=Integer.valueOf(input.nextLine());
        System.out.println("Give the third number:");
        int num3=Integer.valueOf(input.nextLine());
        System.out.println("The sum of the numbers is "+(num1+num2+num3));
        System.out.println("The sum of the numbers is "+num1+num2+num3);


    }
    //program4-Additionformula

    public void additionFormula(){
        Scanner input=new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int num2=Integer.valueOf(input.nextLine());
        System.out.println(num1+"+"+num2+"="+(num1+num2));

    }
    //program5-Multiplication Problem

    public void multiplicationFormula(){
        Scanner input=new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int num2=Integer.valueOf(input.nextLine());
        System.out.println(num1+"*"+num2+"="+(num1*num2));

    }
}