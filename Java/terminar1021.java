import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int [] cedulas = {100,50,20,10,5,2};
        double [] moedas = {1.00,0.50,0.25,0.10,0.05,0.01};
        double N = sc.nextDouble();
        double restante = N;
        
        if (0 < N && N < 1000000.00) {
            System.out.printf("NOTAS:\n");
            for (int cedula : cedulas){ 
                int qtdCedulas = (int)(restante / cedula);
                restante %= cedula;
                System.out.printf("%d nota(s) de R$ %d.00\n", qtdCedulas, cedula);
            }
            System.out.printf("MOEDAS:\n");
            for(double moeda : moedas){
                int qtdMoedas = (int)(restante/moeda);
                restante %= moeda;
                System.out.printf("%d moeda(s) de R$ %.2f\n", qtdMoedas, moeda);
            }
        }
        else {
            System.out.println("Presention Error");
        }
        }
    } 
