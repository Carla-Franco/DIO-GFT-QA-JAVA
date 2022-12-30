public class RodarAplicacao01 {

    public static void main(String[] args) {
        
    Carro01 carro1 = new Carro01();

    carro1.setCor("Preto");
    carro1.setModelo("Golf");
    carro1.setCapacidadeTanque(55);

    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCor());
    System.out.println(carro1.getCapacidadeTanque());
    System.out.println(carro1.totalValorTanque(6.39));

    Carro01 carro2 = new Carro01("Cinza", "Mercedes", 45);
    
    System.out.println(carro2.getModelo());
    System.out.println(carro2.getCor());
    System.out.println(carro2.getCapacidadeTanque());
    System.out.println(carro2.totalValorTanque(6.46));

    }
}
