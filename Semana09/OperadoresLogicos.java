public class OperadoresLogicos {
    public static void main(String[] args) {
        

        boolean a, b, c, d;

        a = true;
        b = true;
        c = false;
        d = true;

        if ( (gen == 'M' && imc < 25) || (gen == 'F' && imc < 24) ) {
            System.out.println("PASSOU NO TESTE ACIMA");
        } else {
            System.out.println("NAO PASSOU NO TESTE");
        }

    }
}
