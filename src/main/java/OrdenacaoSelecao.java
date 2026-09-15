public class OrdenacaoSelecao {

    public static int buscarMenor(int[] arr, int inicio){
        int menor = arr[inicio];
        int menorIndice = inicio;

        for(int i = inicio + 1; i < arr.length; i++){
            if(arr[i] < menor){
                menor = arr[i];
                menorIndice = i;

            }
        }
        return menorIndice;
    }

    public static int[] ordernacaoPorSelecao(int[] arr){
        int[] novoArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            novoArr[i] = arr[i];

        }

        for(int i = 0; i < novoArr.length - 1; i++){
            int menorIndice = buscarMenor(novoArr, i);

            int auxiliar = novoArr[i];
            novoArr[i] = novoArr[menorIndice];
            novoArr[menorIndice] = auxiliar;
        }

        return novoArr;
    }




   public static void main(String[] args) {

    }
}
