import java.util.Scanner;
import java.util.Random;

public class VersionTwo {

    public static void main(String []args) {
       
        //initialized variables
        
        int aRandomInteger1;
        int aRandomInteger2;
        int numofQuestions = 1;
        int answer = 0;
        int userAnswer = 0;
        int score = 0;
        String userChoice;
        String userFeedback;
        boolean feedback = false;
        String feedbackChoice;
        boolean replay = true;
        
        Scanner userInput = new Scanner(System.in);
        String inputName;
        System.out.println("Hi, please enter your name. ");
        inputName = userInput.nextLine();
        System.out.println("Would you like feedback to your answers? y/n"); //asks if the user would like feedback to their answers.
        feedbackChoice = userInput.nextLine(); //checks the users input to the question.
        
           if (feedbackChoice.equals("y")){ //if statement to check whether they want feedback for their answers.
            feedback = true;
        }
        
        
        System.out.println("Hi " + inputName + " here is the first question.");
       
        while (replay){
        
       
          
        do {
            
          Random randomNumberChooser = new Random();  
          aRandomInteger1 = randomNumberChooser.nextInt(12); //picks the first random number up to 12.
          aRandomInteger2= randomNumberChooser.nextInt(12); //picks the second random number up to 12.
          
         while (aRandomInteger1 < 2 || aRandomInteger2 < 2) { //runs again if a number less than 2 is picked.
          aRandomInteger1 = randomNumberChooser.nextInt(12);
          aRandomInteger2= randomNumberChooser.nextInt(12);
          
            }
         
         System.out.println("What is" + aRandomInteger1 + "x" + aRandomInteger2); //the formula for giving the user a question.
         answer = aRandomInteger1 * aRandomInteger2; //formula for working out the answer.
         userAnswer = userInput.nextInt(); //takes in the users answer.
         numofQuestions ++;//number of questions given increased by 1.
        
        
         boolean guessed = false;
         
         if (answer == userAnswer) {
             score++;
             guessed = true;
            }
       
         else if (feedback == true){
            System.out.println(inputName + " the correct answer is " + answer);
            
            }
        
        
        }while (numofQuestions <= 10); //stops running once its ran 10 times.
       
      
         //switch statement to give appropriate response based on the number of correct questions answered.
         switch(score) {
            case 0: userFeedback = inputName + " You gave no correct answers - see me!";
            break;
            case 1: userFeedback = "Please revise your times table!";
            break;
            case 2: userFeedback = "Please revise your times table!";
            break;
            case 3: userFeedback = "Please revise your times table!";
            break;
            case 4: userFeedback = "Please revise your times table!";
            break;
            case 5: userFeedback = inputName + " you gave " + score + " correct answers :) - good"; 
            break;
            case 6: userFeedback = inputName + " you gave " + score + " correct answers :) - good"; 
            break;
            case 7: userFeedback = inputName + " you gave " + score + " correct answers :) - good"; 
            break;
            case 8: userFeedback = inputName + " you gave " + score + " correct answers :) - good"; 
            break;
            case 9: userFeedback = inputName + " you gave 9 correct answers - very good! :)";
            break;
            case 10: userFeedback = "Excellent, you gave 10 correct answers! - well done " + inputName;
            break;
            default: userFeedback = "Invalid";
            break;
            
            }
         
         System.out.println(userFeedback);// prints the relevant response based on the users score.   
         
         //System.out.println("Hi " + inputName + " you got " + score + " out of 10");
    
         System.out.println("Do you want to have another go? y/n");// asks if the user wants another go at the quiz.
         
         userChoice = userInput.next();//the users response.
         
      
         //if statement to run the loop again if the user reponse with "y".
         if (userChoice.equals("y")){
             
             replay = true;
             numofQuestions = 0;
           
      }
        
        else{
            
            replay = false;
            
       
       System.out.print("Thank You For Playing! See you soon " + inputName);
      }
    }
  }
}
