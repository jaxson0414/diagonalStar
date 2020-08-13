public class diagonalStar {
    public static void main(String[] args) {
        star(8);
    }

    public static void star(int number) {
        if (number < 5) {
            System.out.print("Invalid");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if (row == 1 || row == number || column == 1 || column == number || row == column || column == (number - row + 1)) {
                        System.out.print("*");//Im stuck by this println & println wth
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
