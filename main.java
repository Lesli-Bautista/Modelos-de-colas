import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int λ, μ, c;
        double p, lq, wq,w, a, p0, sumatoria=0.0,t1,t2, pEspera,l;
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
                    System.out.println("Utilizacion del sistema p: " + (p*100) + "%");
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
                    a=(double) λ / μ;
                    p=a/c;
                    //Procedimiento para calcular la probabilidad de que no haya nadie en el sistem
                    for (int n=0;n<= c-1; n++){
                        sumatoria += Math.pow (a,n)/factorial (n);
                    }
                    System.out.println ("Resultados");
                    t1=Math.pow (a,c)/factorial (c);
                    t2=1/(1-p);
                    p0=1/(sumatoria+t1*t2);
                    System.out.println ("Probabilidad de que no haya nadie en el sistema: "+ p0);
                    //Procedimiento para calcular la probabilidad de que un cliente tenga que esperar
                    pEspera=(Math.pow (a,c)/(factorial (c)*(1-p)))*p0;
                    System.out.println ("Probabilidad de que un cliente tenga que esperar: "+ pEspera);
                    //Longitud promedio en cola
                    lq=(pEspera*p)/(1-p);
                    System.out.println ("Longitud promedio en cola: "+ lq);
                    //Tiempo promedio de espera en la cola
                    wq=lq/λ ;
                    System.out.println ("Tiempo promedio de espera en la cola");
                    //Tiempo total en el sistema
                    w=wq+(1/μ);
                    System.out.println ("Tiempo total en el sistema");
                    //Numero promedio en el sistema
                    l=λ*w;
                    System.out.println ("Numero promedio en el sistema");
                    
                }
                case 3->{

                }
                case 4 ->{
                    System.out.print("Salir ");
                }
            }

        }while (opción !=5);
        
    }
    public static double factorial (double numero){
        if(numero == 0 || numero ==1){
            return 1;
        }else{
            return numero * factorial (numero - 1);
        } 
    }

}    