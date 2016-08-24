import java.util.Random;

public class CustomRandomNumber {
    
        Random randomNumber = new Random();    
    
        public int getRandomInteger(int maxNumber){
            int randomInteger = 0;
            randomInteger = randomNumber.nextInt(12);
            // filter out zeros and numbers less than 2.
            while(randomInteger < 2){
                randomInteger = randomNumber.nextInt(12);
            }
            return randomInteger;
        }   
        
        
        
        
        
        
        
        
    }
