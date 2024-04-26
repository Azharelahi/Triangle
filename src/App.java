public class App {
    public static boolean isIsosceles(int side1, int side2, int side3) {
        // Check if any side is equal to zero or negative
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return false;
        }

        // Check if the triangle inequality holds
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return false;
        }

        // Check if two sides are equal
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public static void main(String[] args) {
        int side1 = 5;
        int side2 = 5;
        int side3 = 7;

        if (isIsosceles(side1, side2, side3)) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }
    }
}
