package guessNuber;

import java.util.Scanner;

public class GuessANumber{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("please enter the UserName");
	    String userName=sc.next();
	    int randomnumber=1*(int)(10 * Math.random());
	    System.out.println("welcome to guess the Number Game please enter 1 to 10 ");
	    int i=0,Number;
	    do {
	    	System.out.println("please guess the Number ");
	    	Number=sc.nextInt();
	    	i=i+1;
	    }
	    while(randomnumber!=Number);
	    if(randomnumber==Number) {
	    	System.out.println("Congratulations !"+userName+" finally you entered currect Number of attemts "+i);
	    }
	    System.out.println("the final Guess and Random Number is "+randomnumber);

	}

}
