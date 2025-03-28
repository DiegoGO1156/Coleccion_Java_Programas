public class Barra{
    public static void main(String[] args)  {

        try {
            System.out.println("Buscando...");
                for (int i = 0; i < 10; i++) {
                    System.out.print("////////////////////////////////////////////////////////////////////////\r");
                    Thread.sleep(200);
                    System.out.print("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\r");
                    Thread.sleep(200);
                    System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\r");
                    Thread.sleep(200);
                }
                System.out.println(" ");
                System.out.println("ERROR");
                System.out.println("SELECCION NO ENCONTRADA"); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}