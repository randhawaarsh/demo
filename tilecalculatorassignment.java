package demo;
import java.util.Scanner;
public class tilecalculatorassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter tile dimensions in centimeters
		        System.out.print("Enter the length of the tile (in cm): ");
		        double tileLength = scanner.nextDouble();
		        System.out.print("Enter the width of the tile (in cm): ");
		        double tileWidth = scanner.nextDouble();

		        // Prompt the user to enter room dimensions in centimeters
		        System.out.print("Enter the length of the room (in cm): ");
		        double roomLength = scanner.nextDouble();
		        System.out.print("Enter the width of the room (in cm): ");
		        double roomWidth = scanner.nextDouble();

		        // Calculate tile and room areas
		        double tileArea = calculateTileArea(tileLength, tileWidth);
		        double roomArea = calculateRoomArea(roomLength, roomWidth);

		        // Calculate and round up the number of tiles needed
		        int tilesNeeded = roundUp(roomArea / tileArea);

		        // Display results
		        System.out.println("Square cm for one tile: " + tileArea + " cm^2");
		        System.out.println("Square cm of the floor area: " + roomArea + " cm^2");
		        System.out.println("Number of tiles estimated to be needed: " + tilesNeeded + " tiles");

		        // Close the scanner
		        scanner.close();
		    }

		    // Method to calculate the area of a tile
		    private static double calculateTileArea(double length, double width) {
		        return length * width;
		    }

		    // Method to calculate the area of a room
		    private static double calculateRoomArea(double length, double width) {
		        return length * width;
		    }

		    // Method to round up a fractional value to the nearest integer
		    private static int roundUp(double value) {
		        return (int) Math.ceil(value);
		    }
		}


	


