/*
    Author brian.dsouza;
 */
import java.util.Scanner;

    /*
        This program is to get a correct result for total number of points formed in the circle,
        when any random number of steps are being executed to eliminate the points where the step
        is pointed and the last point will be the winner.
     */
    public class CircleGame {
        /*
            The function returns the last remaining point left in the circle
            after the steps are being executed.
         */
        public static int getTheLastPoint(int points, int steps){

            int lastPoint = 0;

            for(int i=2;i<=points;i++){
                lastPoint = (lastPoint+steps)%i;
            }
            return lastPoint+1;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please the enter the number of points");
            int points = sc.nextInt();
            System.out.println("Please enter the number of steps");
            int steps = sc.nextInt();

            int theLastPoint = getTheLastPoint(points,steps);

            System.out.println("With "+points+" points in the circle and "+steps +" steps taken, the last point left is "+theLastPoint+".");


        }
    }


