import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

    public static void main(String[] args) {
        
        /*
         * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
         * modelo = gol - consumo = 14,4km/L
         * modelo = uno - consumo = 15,6km/L
         * modelo = mobi - consumo = 16,1km/L
         * modelo = hb20 - consumo = 14,5km/L
         * modelo = kwid - consumo = 15,6km/L
         */

         //Map carrosPopulares2020 = new HashMap();
         //Map<String, Double> carrosPopulares = new HashMap<>();
         //HashMap<String, Double> carrosPopulares = new HashMap<>();
         //Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

         System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
         Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
         }};
         System.out.println(carrosPopulares.toString());


         System.out.println("Substiua o consumo do gol por 15,2 km/l: ");
         carrosPopulares.put("gol", 15.2);
         System.out.println(carrosPopulares);


         System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));


         System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

         //System.out.println("Exiba o terceiro modelo adicionado: ");


         System.out.println("Exiba os modelos: ");
         Set<String> modelos = carrosPopulares.keySet();
         System.out.println(modelos);


         System.out.println("Exiba os consumos dos carros: ");
         Collection<Double> consumos = carrosPopulares.values();
         System.out.println(consumos);


         System.out.println("Exiba o modelo mais econômico e seu consumo: ");
         Double consumoMax = Collections.max(carrosPopulares.values());
         Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
         String modeloMax = "";
         for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMax)) {
            modeloMax = entry.getKey();
            System.out.println("Modelo mais eficiente: " + modeloMax + " - " + consumoMax);
            }
        }
         

         System.out.println("Exiba o modelo menos econômico e seu consumo: ");
         Double consumoMin = Collections.min(carrosPopulares.values());
         String modeloMin = "";
         for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
             if (entry.getValue().equals(consumoMin)) {
                 modeloMin = entry.getKey();
                 System.out.println("Modelo menos eficiente: " + modeloMin + " - " + consumoMin);
             }
         }


         Iterator<Double> iterator = carrosPopulares.values().iterator();
         Double soma = 0d;
         while(iterator.hasNext()) {
            soma += iterator.next();
         }
         System.out.println("Exiba a soma dos consumos: " + soma);


         System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));


         System.out.println("Remova os modeos com o consumo igual a 15,6 km/l: ");
         Iterator<Double> iterator1 = carrosPopulares.values().iterator();
         while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
         }
         System.out.println(carrosPopulares);


         System.out.println("Exiba todos os carros na ordem em que foram informados: ");
         Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{ 
                 put("gol", 14.4);
                 put("uno", 15.6);
                 put("mobi", 16.1);
                 put("hb20", 14.5);
                 put("kwid", 15.6);
             }};
         System.out.println(carrosPopulares1.toString());

         
         System.out.println("Exiba o dicionário ordenado pelo modelo: ");
         Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
         System.out.println(carrosPopulares2.toString());

         System.out.println("Apague o conjunto de carros: ");
         carrosPopulares.clear();

         System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
    
}
