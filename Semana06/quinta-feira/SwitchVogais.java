public class SwitchVogais {
    public static void main(String[] args) {
        
        char letra = 'a';

        // identficar se a letra é uma vogal
        switch (letra) {
            case 'a':
                System.out.println("* pq é primeira vogal");
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("É UMA VOGAL");
                break;
            default:
                System.out.println("NAO É UMA VOGAL");
        }

    }
}
