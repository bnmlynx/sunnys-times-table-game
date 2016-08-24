import java.util.Scanner;
import java.util.Random;
public class VersionOne {

    public static void main(String []args) {
        
        Scanner userInput = new Scanner(System.in);
        String inputName;
        System.out.println("Hi, please enter your name. "); //System outputs the a question to get the users name.
        inputName = userInput.nextLine(); //saves the information input as inputName.
        System.out.println("Hi " + inputName + " here is the first question."); //outputs the users name back to them.
        
        //Setting up the variables.
        
        int aRandomInteger1;
        int aRandomInteger2;
        int numofQuestions = 1;
        int answer = 0;
        int userGuess = 0;
        int score = 0;
        String userChoice;
       
        boolean repeat = true;
       
        while (repeat){ //repeats the game if the users chooses.
        
          
          
        do {
            
          Random randomNumberChooser = new Random();  
          aRandomInteger1 = randomNumberChooser.nextInt(12); //picks the first random number up to 12.
          aRandomInteger2= randomNumberChooser.nextInt(12); //picks the second random number up to 12.
          
         while (aRandomInteger1 < 2 || aRandomInteger2 < 2) { //runs again if a number less than 2 is picked.
          aRandomInteger1 = randomNumberChooser.nextInt(12);
          aRandomInteger2= randomNumberChooser.nextInt(12);
          
            }
         
         System.out.println("What is" + aRandomInteger1 + "x" + aRandomInteger2); 
         answer = aRandomInteger1 * aRandomInteger2;
         userGuess = userInput.nextInt();
         numofQuestions ++;
        
        
         boolean guessed = false;
         
         if (answer == userGuess) { //checks if the user answer matches the correct answer and then adds to score if it is and turns gueesed to true.
             score++;
             guessed = true;
            }
       
         
        
        
        }while (numofQuestions <= 10); 
       
        //stops running once its ran 10 times.
            
         System.out.println("Hi " + inputName + " you got " + score + " out of 10"); //outputs the users score.
    
         System.out.println("Do you want to have another go? y/n"); //asks if they user wants to have another go.
         
         userChoice = userInput.next();
         
         if (userChoice.equals("y")){ //checks the users response.
             
             repeat = true; // if they enter y then repeat is true.
             numofQuestions = 0; //sets the number of questions back to 0.
           
      }
        
        else{
            
            repeat = false;
            
       
       System.out.print("Thank You For Playing! See you soon " + inputName); //if they choose not to then the final message is outputted.
      }
    }
  }
}
