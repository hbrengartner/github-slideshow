import java.util.Random;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		
//		# Control Flow Project
//		
//		The following instructions and exercises constitute the project for understanding and applying Java Control Flow 
//		statements.  There will be some instructions that involve classes and/or operation that have not been covered yet.  
//		In those cases code will be provided for basic operations, but you are encouraged to use online resources to obtain 
//		further documentation and examples.
		
		
//		### Overview
		
//		You will be building an interactive command-line program which will take input from the user, process it, and then 
//		display the results.  It will be built in phases and will begin from a presentation-only system to a fully function 
//		request-response system.
//		First, create a simple Java project that prints "Hello World".  This will verify your environment, settings, and 
//		ability to run a project on the command line.  Depending on build tools and/or IDE this process can be done from the 
//		actual command line or in a console output window.  The instructions assume the use of an IDE such as Eclipse or 
//		Spring Tool Suite; if a plain editor and command line tools are used those steps will have to be done by the user.
		
		System.out.println("Hello, World!");
//		
//		#### Project Steps
		

		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();

//		Next, set up a simple interaction with the user.  After printing the valid characters, ask the question `Please enter your name: `.  When the user inputs their name, simply respond to them by echoing back `Hello Tom` (if they input Tom of course). See more detailed instructions below on reading input from the keyboard.
//		#### Scanner class
		
		scanner_1:{
		Scanner name = new Scanner(System.in);
		System.out.print("Please enter your name");     // type a word and hit enter
		String nameString = name.next();
		
		System.out.printf("Hello %s!\n",nameString);
		}
//		```
//		Implement the following:
//		After the name prompt, ask the user if they wish to continue to the interactive portion. If they enter 'yes' or 'y',
		//continue.  Otherwise quit the program with a message to please return later to complete the survey.
//		Use a loop to repeatedly ask the user some questions. What will be done is to gather some random information from 
		//the user and then generate their potential winning Powerball numbers.  At the end, ask them if they would like
		//to generate another set of numbers.  Note that it may be helpful to put example responses after each question.
//		```
while(true) {
		scanner_2:{
		Scanner interactivePortion = new Scanner(System.in); 
		
		System.out.println("Do you wish to continue to the interactive portion?");
		String yesNo = interactivePortion.next();
		
		if(yesNo.equals("no")|| yesNo.equals("n")|| yesNo.equals("No")) {
			System.out.println("Please return later to complete the survey");
			break;
		}
		
		else{
		
		Scanner input = new Scanner(System.in); 
		
//		Do you have a red car? (yes, no):
		
		System.out.println("Do you have a red car?"); 
		String redCar = input.nextLine(); 
		
//		Ask the user for the name of their favorite pet.
		
		System.out.println("What is the name of your favorite pet?");
		String petName = input.nextLine();
		
//		Ask the user for the age of their favorite pet. 
		
		System.out.println("What is the age of your favorite pet?");
		int petAge = (int)input.nextInt();
		
//		What is their lucky number?
		
		System.out.println("What is your lucky number?");
		int luckyNumber = (int)input.nextInt();
		
//		Do they have a favorite quarterback?  If so what is their jersey number?
		
		System.out.println("Do you have a favorite quarterback");
		String quarterback = input.next();
		
		if (quarterback.equals("yes")|| quarterback.equals("y")|| quarterback.equals("Yes")){
			
			System.out.println("What is their jersey number?"); 
			int jerseyNumber = (int)input.nextInt(); 
		}
		else {
			System.out.println("Okay, moving on");
		}
		
		
//		What is two-digit model year of their car?
		
		System.out.println("What are the first two-digits of your cars model year?");
		int modelYear = (int)input.nextInt();
		
//		What is the first name of the their favorite actor or actress?
		
		System.out.println("What is the first name of your favorite actor or actress?");
		String actorName = input.next();
		
//		Enter a random number between 1 and 50.
		
		System.out.println("Last Questions!");
		System.out.println("Enter a random number between 1 and 50");
		int randomNumber = (int)input.nextInt();

//		**Generating output**
//		Now that you have 6 or 7 pieces of information it's time to generate the lottery numbers.  
//      The output will 5 random numbers between 1 and 65, and the "magic ball" between 1 and 75.
//		To accomplish this you should have 3 random integers, generated in the same way as in the previous exercises.  
//		You may also want to declare constants for the max values of each set of of numbers.
//		Generate the "magic ball" first.  It should be the user's favorite quarterback jersey number *or* their lucky 
//		number, multiplied by one of the random numbers.  Make sure that the answer is less the max "magic" number of 75; 
		
		
		int randomIntOne;
		int randomIntTwo;
		int randomIntThree;
		int magicBall;
		int lotteryBallOne;
		int lotteryBallTwo;
		int lotteryBallThree;
		int lotteryBallFour;
		int lotteryBallFive;
		
		
		Random random = new Random();
			for(int i = 0; i<1; i++) {
				
				randomIntOne = random.nextInt(16);
				
				randomIntTwo = random.nextInt(16);
				
				randomIntThree = random.nextInt(16);
				
				magicBall = luckyNumber * randomIntTwo;
				
//				if it is greater than 75 then subtract 75 from the value and that value is now the "magic ball" number.
				
				if(magicBall >75) {
					magicBall = magicBall - 75;
				}
				else {
				}	 
								
//				* Find the 3rd letter of their favorite pet.  Convert that character value to an integer value.
				
				char f = petName.charAt(2);
				int petNameInt = Character.getNumericValue(f);   
		    	if(petNameInt >65) {
		    		lotteryBallOne = petNameInt - 50;
		    	}
		    	else {
		    		lotteryBallOne = petNameInt;
		    	}
				
				
//				* Use the two digit model year of their car and add their lucky number to it.
				lotteryBallTwo = modelYear + luckyNumber;
				if(lotteryBallTwo>65) {
					lotteryBallTwo = lotteryBallTwo - 20;
				}
				else {
					lotteryBallTwo = lotteryBallTwo;
				}

//				* Use the random number between 1 and 50, subtracting one of the generated random numbers.
				lotteryBallThree = randomNumber - randomIntOne;
				if(lotteryBallThree <=65 && lotteryBallThree >0) {
					lotteryBallThree = lotteryBallThree;
				}
				else if(lotteryBallThree <=0) {
					lotteryBallThree = lotteryBallThree + 2;
				}
				
//				* Convert the first letter of their favorite actor/actress to an integer and use that value.
			 	char h = actorName.charAt(0);
				int actorNameInt = Character.getNumericValue(h);  
		    	if(actorNameInt > 65) {
		    		lotteryBallFour = actorNameInt - 50;
		    	}
		    	else {
		    		lotteryBallFour = actorNameInt;
		    	}
				
//				* Use the age of their favorite pet + their car model year.
				lotteryBallFive = petAge + modelYear;
				if(lotteryBallFive <=65) {
					lotteryBallFive = lotteryBallFive;
				}
				else {
					lotteryBallFive = lotteryBallFive - 50;
				}
				
//				Once all the numbers have been calculated, print them out in this form:
//				Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
				System.out.println("Lottery numbers:" + " " + lotteryBallOne + "," +
						" " + lotteryBallTwo + "," + " " + lotteryBallThree + "," + " " +
						lotteryBallFour + "," + " " + lotteryBallFive + " " + 
						"Magic ball:"+ " " + magicBall);	
//				After the numbers have been printed, ask the user if they would like to answer
//				questions to generate another set of numbers.  If so, repeat the entire process.  
//				If not, print a thank you message and exit.
				Scanner playAgain = new Scanner(System.in); 
				System.out.println("Would you like to play again to generate new numbers?");
				String yesOrNo = playAgain.next();
				
				if(yesOrNo.equals("no")|| yesNo.equals("n")|| yesNo.equals("No")){
					System.out.println("Thanks for playing, see you next time");
					break;
				}
				break;
	
		
}}}}}}