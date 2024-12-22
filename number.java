import java.util.Random; 
public class number { 
    public static void main(String[] args) { 
        Random rand = new Random(); 
        for (int i = 0; i < 5; i++) { 
            int randomNumber = rand.nextInt(9000) + 1000; 
            System.out.println("Random Number " + (i+1) + ": " + randomNumber); 
        } 
    } 
}