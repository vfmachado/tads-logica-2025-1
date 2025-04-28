public class Ex06 {
    public static void main(String[] args) {
        
        int linhas = 5;
        while (linhas > 0) {
            
            int asteriscos = linhas * 2 - 1;
        
            for (int i = 0; i < asteriscos; i++) {
                System.out.print("* ");
            }
            System.out.println();
            
            linhas--;
        }
    }
}
