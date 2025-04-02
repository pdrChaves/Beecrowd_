import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int [] cedulas = {100,50,20,10,5,2,1};
        double [] moedas = {1.00,0.50,0.25,0.10,0.05,0.01};
        double N = sc.nextInt();
        double restante = N;
        if (0 < N && N < 1000000.00) {
            System.out.printf("%d\n",N);
            for (int cedula : cedulas){ 
                double qtdCedulas = restante / cedula;
                restante %= cedula;
                System.out.printf("%d nota(s) de R$ %d,00\n", qtdCedulas, cedula);
            }
            for(double moeda : moedas){
                int intmoeda = (int)(moeda);
                double qtdMoedas = restante/moeda;
                System.out.printf("%d moeda(s) de R$ %d,00\n", qtdMoedas, moedas);
            }
        }
        else {
            System.out.println("Presention Error");
        }
        }
    } 
