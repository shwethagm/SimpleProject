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
    //program6-AverageOfNumbers

    public void averageOfNumbers(){
        Scanner input=new Scanner(System.in);
        System.out.println("Give the first number: ");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number: ");
        int num2=Integer.valueOf(input.nextLine());
        double avgOf2Num= (num1+num2)/2;
        System.out.println(avgOf2Num);

    }
    //program6-AverageOfThreeNumbers

    public void averageOfThreeNumbers(){
        Scanner input=new Scanner(System.in);
        System.out.println("Give the first number: ");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number: ");
        int num2=Integer.valueOf(input.nextLine());
        System.out.println("Give the third number: ");
        int num3=Integer.valueOf(input.nextLine());

        //multiply by 1.0
        double avgOfThreeNum=1.0*(num1+num2+num3)/3;
        System.out.println(avgOfThreeNum);

    }

    //program7-simple calculator

    public void simpleCalculator(){
        Scanner input= new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int num2=Integer.valueOf(input.nextLine());

        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(1.0*num1/num2));



    }
    //part1-6-conditional statements

    //program1-Speeding ticket

    public void speedingTicket(){

        Scanner input=new Scanner(System.in);
        System.out.println("Give speed:");

        int speed=Integer.valueOf(input.nextLine());
        if(speed>120){
            System.out.println("Speeding ticket!");
        }
    }
    //program2-orwell

    public void orwell(){
        Scanner input=new Scanner(System.in);
            System.out.println("Give a number:");
                int num=Integer.valueOf(input.nextLine());
                    if(num==1984){
                        System.out.println("Orwell");
                    }

    }
    //program3-ancient

    public void ancient(){
        Scanner input=new Scanner((System.in));
        System.out.println("Give a year:");
        int num=Integer.valueOf(input.nextLine());
        if(num<2015){
            System.out.println("Ancient history!");
        }

    }
    //program4-positivity
    public void positive(){

        Scanner input=new Scanner(System.in);
        System.out.println("Give a number:");
        int num=Integer.valueOf(input.nextLine());
        if(num>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative");
        }

    }
    //program5-adult

    public void adultOrNOt(){

        Scanner input=new Scanner(System.in);
        System.out.println("How old are you?");
        int old=Integer.valueOf(input.nextLine());
        if(old>=18){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are not an adult");
        }
    }
    //program6-Numbersaregreater

    public void largerThanOrEqualTo(){
        Scanner input=new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNumber=Integer.valueOf(input.nextLine());
        System.out.println("Give the second number:");
        int secondNumber=Integer.valueOf(input.nextLine());

        if(firstNumber>secondNumber){
            System.out.println("Greater number is:"+firstNumber);
        }else if (firstNumber<secondNumber){
            System.out.println("Greater number is:"+secondNumber);

        }else{
            System.out.println("The numbers are equal!");
        }
    }

   // program7-Grader And Points

    public void gradesAndPoints(){

        Scanner input=new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int points=Integer.valueOf(input.nextLine());
        if(points<0){
            System.out.println("Grade: impossible!");
        }else if(points>0&&points<=49){
            System.out.println("Grade: failed");
        }else if(points>=50&&points<=59){
            System.out.println("Grade: 1");
        }else if(points>=60&&points<=69){
            System.out.println("Grade: 2");
        }else if(points>=70&&points<=79){
            System.out.println("Grade: 3");
        }else if(points>=80&&points<=89){
            System.out.println("Grade: 4");
        }else if(points>=90&&points<=100){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }
    }
    //program8-EvenorOdd

    public void evenOrOdd(){
        Scanner input=new Scanner(System.in);
        System.out.println("Give a number: ");
        int number=Integer.valueOf(input.nextLine());
        if(number%2==0){
            System.out.println("Number "+ number+" is even.");
        }else{
            System.out.println("Number "+ number+" is odd.");
        }

    }
    //program9-password

    public void password(){
      Scanner input=new Scanner(System.in);
        System.out.println("Password?");
        String password=input.nextLine();
        if(password.equals("Caput Draconis")){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }

    }
    //program10- same

    public void same(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first=input.nextLine();
        System.out.println("Enter the second string: ");
        String second=input.nextLine();
        if(first.equals(second)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }

    }
    //program11-checkage

    public void checkAge(){

        Scanner input=new Scanner(System.in);
        System.out.println("How old are you? ");
        int age=Integer.valueOf(input.nextLine());
        if((age>=0)&&(age<=120)){
            System.out.println("OK");
        }else{
            System.out.println("Impossible");
        }
    }
    //program12-LeapYear

    public void leapYear(){

        Scanner input=new Scanner(System.in);
        System.out.println("Give a year: ");
        int year=Integer.valueOf(input.nextLine());

        if((year%4==0 ) && (year%100==0) && (year%400==0) ){
            System.out.println("The year is a leap year"+year);
        }else{
            System.out.println("The year is not a leap year"+year);
        }
    }
}
