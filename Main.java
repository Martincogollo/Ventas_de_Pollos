import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;//Manejar el switch
        double Cant_kilos, Val_kilos, pollosCria, pollosEngorde;
        do{
            System.out.println("[1] Ingresar la cantidad de pollos en fase de cría");
            System.out.println("[2] Ingresar la cantidad de pollos en fase de engorde");
            System.out.println("[3] Ingresar la cantidad de pollos en fase de cría y cantidad en fase de engorde");
            System.out.println("[4] Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    do{
                        System.out.println("Digite la cantidad de pollos en fase de cría");
                        pollosCria = teclado.nextDouble();
                    }while(pollosCria<0  || pollosCria > 1000);
                    Cant_kilos = kilos(pollosCria, opcion);
                    System.out.println("La cantidad de kilos requeridos es:" + Cant_kilos);
                    precio(Cant_kilos, opcion);//precio(kilos(pollosCria))
                    break;
                    
                case 2:
                    do{
                        System.out.println("Digite la cantidad de pollos en fase de engorde");
                        pollosEngorde = teclado.nextDouble();
                    }while(pollosEngorde <0  || pollosEngorde > 1000);
                    Cant_kilos = kilos(pollosEngorde, opcion);
                    System.out.println("La cantidad de kilos requeridos es:" + Cant_kilos);
                    precio(Cant_kilos, opcion);
                    break;
                case 3:
                    do{
                        System.out.println("Digite la cantidad de pollos en fase de cría");
                        pollosCria = teclado.nextDouble();
                    }while(pollosCria<0  || pollosCria > 1000);
                    do{
                        System.out.println("Digite la cantidad de pollos en fase de engorde");
                        pollosEngorde = teclado.nextDouble();
                    }while(pollosEngorde <0  || pollosEngorde > 1000);
                  
                    break;
                case 4:
                    System.out.println("Hasta pronto !!!");
                    break;
                default: System.out.println("Únicamente opciones de 1 a 4");
            }
        }while(opcion != 4); //Salir únicamente si opcion es igual a 4
    }
    
    static double kilos(double pollos, int caso) {
        if(caso == 1){
            return 1.2 * pollos;
        }
        else  {
            return 2.65 * pollos;
        }
       
    }    
    
    static void precio(double cantidad, int caso){
        if(caso == 1){
            System.out.println("El valor a pagar es:" + 1000 * cantidad);
        }
        else{
           System.out.println("El valor a pagar es:" + 1100 * cantidad); 
        }
    }
}