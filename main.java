import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int λ, μ, c;
        double p, lq, wq,w;
        byte opcion = 0;
        do{
            System.out.println ("\n \n \tMenu");
            System.out.println("1. Modelo m/m/1");
            System.out.println("2.Modelo m/m/c");
            System.out.println("5. Salir");
            System.out.println("Opcion");
            opcion = sc.nextByte();
            swhitch (opcion) {
                case 1 ->(opcion) {
                    System.out.println( "Modelo m/m/1");
                    System.out.print("Escribe el valor del llegadas λ: ");
                    λ = sc.nextInt();
                    System.out.print("Escribe el valor del Promedio servicio μ: ");
                    μ = sc.nextInt();
                    p= (double) λ / μ;
                    lq =  (Math.pow(λ, 2)) / (μ*(μ - λ));
                    wq = lq/λ;
                    w= wq/μ
                    System.out.println("Resultados:");
                    System.out.println("Utilizacion del sistema p: " + p(p*100) + "%");
                    System.out.println("Numero promedio de clientes en la cola Lq: " + lq);
                    System.out.println("Tiempo promedio de espera en la cola Wq: " + wq + " horas o "+ (wq*60)+ " minutos");
                    System.out.println("Tiempo promedio en el sistema W: " + w + " horas o "+ (w*60)+ " minutos");
                }
                case 2 -> {
                    System.out.println("Modelo m/m/c");
                    System.out.print("Escribe el valor del llegadas λ: ");
                    λ = sc.nextInt();
                    System.out.print("Escribe el valor del Promedio servicio μ: ");
                    μ = sc.nextInt();   
                    System.out.print("Escribe el numero de servidores c: ");
                    c = sc.nextInt();

                }
            }

        }while (opción !=5);
        
    }

}    