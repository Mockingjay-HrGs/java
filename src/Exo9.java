import java.util.Random;

public class Exo9 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(42) + 1; 
        boolean isFortyTwo = (rand == 42);
        
        System.out.println("Nombre aléatoire: " + rand);
        System.out.println("Est-ce que le nombre est 42 ? " + isFortyTwo);
    }
}