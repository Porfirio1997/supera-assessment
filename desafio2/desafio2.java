import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Chalenge2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double valor = Double.parseDouble(st.nextToken());
        chalenge2(valor);
    }

    public static void chalenge2(Double valor){
        double[] Notas = {100,50,20,10,5,2};
        double[] Moedas= {1,0.5,0.25,0.10,0.05};

        System.out.println("NOTAS:");
        for(double Nota : Notas){
            int qtd = (int) (valor/Nota);
            System.out.printf("%d moeda(s) de R$ %.2f \n",qtd,Nota );
            valor = valor % Nota;
        }
        System.out.println("MOEDAS:");
        for(double Moeda : Moedas){
            int qtd = (int) (valor/Moeda);
            System.out.printf("%d moeda(s) de R$ %.2f \n",qtd,Moeda );
            valor = valor % Moeda;
        }
    }
}