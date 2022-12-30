public class Operadores {

    public static void main (String [] args) {
        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);

        // String concatenacao = "?";
        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao); 
        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);
        // concatenacao = 1+"1"+1+"1";
        // System.out.println(concatenacao);
        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);
        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);

        // int numero = 5;
        // numero = - numero; 
        // System.out.println(numero);
        // numero = numero * -1;
        // System.out.println(numero);

        // int numero = 5;
        // numero++;
        // System.out.println(numero --);
        // System.out.println(numero);

        // boolean variavel = true;
        // variavel = !variavel;
        // System.out.println(variavel);

        // int a, b;
        // a = 6;
        // b = 6;
        // String resultado = a==b ? "verdadeiro" : "falso";
        // System.out.println(resultado);   
        
        // String nomeUm = "Carla";
        // String nomeDois = new String("Carla");
        // System.out.println(nomeUm.equals(nomeDois));
        // int numero1 = 1;
        // int numero2 = 2;
        // boolean simNao = numero1 == numero2;
        // if(numero1 == numero2) {
        //     System.out.println("A nossa condição é verdadeira");
        // }
        // System.out.println("numeroUm é igual a numeroDois? " + simNao);
        // simNao = numero1 != numero2;
        // System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        // simNao = numero1 > numero2;
        // System.out.println("numeroUm é maior que numeroDois? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && ( 7 > 4 )){
           System.out.println("As duas condições são verdadeiras"); 
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras"); 
         }

        System.out.println("Fim");

    }
    
}
