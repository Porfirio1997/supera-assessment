public class Chalenge3 {
    public static void main(String args[]) {
        int[] arr = {1,2,3,4};
        System.out.println(chalenge3(arr,1));
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