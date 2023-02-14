package TRABALHO_AV2;


public class Principal {
    public static void main(String[] args) {
      Cliente c1 = new Cliente("Anderson", "Rua Apolo, Pavuna", "343");
      Cliente c2 = new Cliente("Alexia", "Rua Sargento Antônio ernesto, Pavuna" , "632");

      LinhaTelefonica fixa1 = new Fixa(c1, 35, "3333-3333");
      LinhaTelefonica movel1 = new Movel(c1, 235, "99999-9999", true);

      LinhaTelefonica fixa2 = new Fixa(c2, 28, "4444-44444");
      LinhaTelefonica movel2 = new Movel(c2, 285, "98888-8888", false);

      c1.getLinhaTelefonica().add(fixa1);
      c1.getLinhaTelefonica().add(movel1);
      c2.getLinhaTelefonica().add(fixa2);
      c2.getLinhaTelefonica().add(movel2); 
      
      System.out.println(c1);
      System.out.println(c2);


    } 
}
