import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Chalenge3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i < n ;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(chalenge3(arr,k));
    }


    public static int chalenge3(int[] arr ,int alvo){
        int qtd = 0;
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                if(i==j)
                    continue;
                if(arr[i] - arr[j] == alvo)
                    qtd++;
            }
        }
        return qtd;
    }

}