public class MinhaClass {

    public static void main(String[] args) {
        String primeiroNome = "Daniel";
        String segundoNome = "Bikinho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado  do Método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
