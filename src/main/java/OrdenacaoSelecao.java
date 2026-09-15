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




   public static void main(String[] args) {

    }
}
