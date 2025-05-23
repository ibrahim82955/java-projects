package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of points:");
        int point = input.nextInt();

        if (point < 2) {
            System.out.println("You need to enter at least 2 points.");
            return;
        }

        double[][] points = new double[point][2];

        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble(); // x
            points[i][1] = input.nextDouble(); // y
        }

        double distance_min = compute_distance(points[0][0], points[0][1], points[1][0], points[1][1]);
        int p1 = 0, p2 = 1;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = compute_distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (distance < distance_min) {
                    distance_min = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        System.out.println("The closest two points are (" + points[p1][0] + ", " + points[p1][1] + 
                           ") and (" + points[p2][0] + ", " + points[p2][1] + ")");
    }

    public static double compute_distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
