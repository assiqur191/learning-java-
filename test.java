import java.util.Scanner;

class test{

public static void main(String[] args ){
    int a = 0;
    System.out.println("Enter Your choice: \n For add enter : 1 \n For minus enter : 2 \n For multi enter : 3 \n for div enter : 4  ");
    Scanner x = new Scanner(System.in);
    a = x.nextInt();

    if(a == 1)
    {
        add();
    }
    if (a == 2)
    {
        minus();
    }
    if(a == 3)
    {
        multi();
    }
    if (a == 4 )
    {
        div();
    }
    else
    {
        System.out.println("Nothing");
    }
}
    public static void add()
    {
        int a, b, c;


        System.out.println("Enter first number: ");
        Scanner ka = new Scanner(System.in);
        a = ka.nextInt();

        System.out.println("Enter Second Number: ");
        Scanner kb = new Scanner(System.in);
        b = kb.nextInt();



        c = a + b;

        System.out.println("Total Sum : "+ c);
    }

    public static void minus() 
    {
     int a, b,c;
     System.out.println("inter the first number :");
     Scanner ka = new Scanner(System.in);
     a = ka.nextInt();

     System.out.println("inter the second number : ");
     Scanner kb = new Scanner(System.in);
     b = kb.nextInt();
    
       c = a - b;
     System.out.println("the minus valu :- "+ c);
    

    }
    public static void multi() 
    {
     int a, b,c;
     System.out.println("inter the first number");
     Scanner ka = new Scanner(System.in);
     a = ka.nextInt();

     System.out.println("inter the second number");
     Scanner kb = new Scanner(System.in);
     b = kb.nextInt();

     c = a * b;
     System.out.println("the multi valu :- "+ c);
    
    }

    public static void div() 
    {
     int a, b,c;
     System.out.println("inter the first number");
     Scanner ka = new Scanner(System.in);
     a = ka.nextInt();

     System.out.println("inter the second number");
     Scanner kb = new Scanner(System.in);
     b = kb.nextInt();

     c = a / b;
     System.out.println("the minus valu :- "+ c);
    
    }



}









