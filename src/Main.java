import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int DATA_LENGTH = 100;
        int[] dataPoints = new int[DATA_LENGTH];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //initialize data points
        for(int x = 0; x < dataPoints.length; x++ )
        {
            dataPoints[x] = rnd.nextInt(DATA_LENGTH) + 1;

            System.out.print(dataPoints[x] + " | ");

        }

        System.out.println("");
        int sum = 0;
        double avg = 0.0;

        for(int x = 0; x < dataPoints.length; x++)
        {
            sum+= dataPoints[x];

            avg = sum / DATA_LENGTH;
        }

        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);

        //Task 6

        int searchTarget = SafeInput.getRangedInt(in, "\n\nEnter an integer to search for: ", 1, 100);

        boolean targetFound = false;
        int acum = 0;

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == searchTarget)
            {
                targetFound = true;
                acum += 1;
            }
        }

        if(targetFound)
        {
            System.out.println("\nWe found " + searchTarget + ", " + acum + " times!");
        }
        else
            System.out.println("\nWe could not find " + searchTarget + "!");

        //Task 7

        searchTarget = SafeInput.getRangedInt(in, "\n\nEnter an integer to search for: ", 1, 100);

        targetFound = false;
        int index = 0;

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == searchTarget)
            {
                targetFound = true;
                index = x;
                break;
            }
        }

        if(targetFound)
        {
            System.out.println("\nWe found " + searchTarget + " at spot " + index + "!");
        }
        else
            System.out.println("\nWe could not find " + searchTarget + "!");

        //Task 8

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(min > dataPoints[x])
                min = dataPoints[x];
            if(max < dataPoints[x])
                max = dataPoints[x];
        }

        System.out.println("The minimum is " + min + ", and the maximum is " + max);

        //Task 9
        System.out.println("The average of the set is " + getAverage(dataPoints));

    }

    public static double getAverage(int value[])
    {
        int sum = 0;
        double avg = 0.0;

        for(int x = 0; x < value.length; x++)
        {
            sum+= value[x];

            avg = sum / value.length;
        }
        return avg;
    }
}