import java.util.Scanner; 

public class Diego{

public void main String [] args{

    Scanner x = new Scanner(System.in);

    System.out.println("Escoja un número");
    System.out.println("1) If else");
    System.out.prinltn("2) Switch case");

    a = x.nextInt();
    boolean z = true;
    switch (a) {
        case 1:
            System.out.println("Ingrese el 1 si quiere ver el texto de falso");
            System.out.println("Ingrese el 2 si quiere ver el texto de verdadero");
            b = x.nextInt();
                if(b == 1){
                    System.out.println("FALSO");
                }else if(b == 2){
                    System.out.println("VERDADERO");
                }
                break;
        case 2: 
            System.out.println("Ingrese el 3 si quiere sumar números");
            System.out.println("Ingrese el 4 si quiere restar números");
            c = x.nextInt();
            switch(c){
                case 1: 
                System.out.println("Ingrese el primer número");
                d = x.nextInt();
                System.out.println("Ingrese el segundo número");
                e = x.nextInt();
                System.out.println("===============================");
                System.out.println("El resultado es: " + d+e);
                break;
                case 2:
                System.out.println("Ingrese el primer número");
                f = x.nextInt();
                System.out.println("Ingrese el segundo número");
                g = x.nextInt();
                System.out.println("===============================");
                System.out.println("El resultado es: " + d-e);
                break; 
            }        
        }   
    } 
}