public class Ex08 {
    public static void main(String[] args) {
        
        int n = 18; 
        String bin = "";

        while (n > 0) {
            int resto = n%2;
            bin = resto + bin;
            n = n/2;
        }

        System.out.println(bin);
    }
}
