public class L06Ex11 {

    public static void main(String[] args) {
        
        int lin = 6;
        int col = 8;

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == lin -1)
                    System.out.print("---");
                else if ( j == 0)
                    System.out.print("| ");
                else if (j == col -1)
                    System.out.print("   |");
                else
                    System.out.print("   ");

            }
            System.out.println();
        }

    }
}
