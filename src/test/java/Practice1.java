import java.util.Scanner;

class Practice {

    public  void practice() {
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
          public void messageReader(){
            Scanner input = new Scanner(System.in);
            System.out.println("Greetings! How are you doing?");
            String messageone = input.nextLine();
            System.out.println("Oh, how interesting. Tell me more!");
            String messagetwo = input.nextLine();

            System.out.println("Thanks for sharing!\n");
            String messagethree = input.nextLine();

        }

public void story(){
        Scanner input=new Scanner(System.in);
    System.out.println("I will tell you a story, but I need some information first.\n" +
            "What is the main character called?");
    String name=input.nextLine();
    System.out.println("What is their job?");
    String job =input.nextLine();
    System.out.println("Here is the story:\n" +
            "Once upon a time there was Bob, who was a builder."+"\n" +
            "On the way to work,"+name+" reflected on life." +"\n"+
            "Perhaps "+name+" will not be a "+"" +
            job+" forever."+"\n");

}

//chapter4-Variables

    }
