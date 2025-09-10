import java.util.Scanner;

public class Ruin
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int startAmount = in.nextInt();
        double winChance = in.nextDouble();
        int winLimit = in.nextInt();
        int totalSimulations = in.nextInt();
        int count = 1;
        int game = 0;
        
        while (startAmount > 0 && startAmount < winLimit)
        {
            for (int cola = 0; cola < totalSimulations;)
        {
        
            if(winChance > Math.random())
            {
                System.out.println("SIMULATION " + count + ":" + " WIN");
                startAmount ++;
            }
            else
            {
                System.out.println("SIMULATION " + count + ":" + " LOSE");
                startAmount --;
            }
            game ++;
        
        count ++;
        cola ++;
        }
        
        }
    
    }

}
