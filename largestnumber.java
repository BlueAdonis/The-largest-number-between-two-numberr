import java.util.*;
public class largestnumber {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.print("Enter the first number=");
        int firtNumber = getNumber.nextInt();
        System.out.print("Enter the second number=");
        int secondNumber = getNumber.nextInt();
        if (firtNumber >= secondNumber)
		{
            System.out.print(firtNumber +     " largest number");
        } 
		else
        {
            System.out.print(secondNumber +   "largest number");
        }
    }
}