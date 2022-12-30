public class MinhaClasse {

    public static void main (String [] args) {
        //System.out.print("Olá turma, sejam bem-vindos");
        // String meuNome = "Carla";
        // int anoFabricacao = 2022;
        // boolean verdadeira = true;
        // anoFabricacao = 2018;
        String primeiroNome = "Carla";
        String segundoNome = "Franco";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}
