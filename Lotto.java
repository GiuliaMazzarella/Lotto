import java.lang.Math;

public class Lotto {
    public static void main(String[] args) {
        int[][] schedina = new int[5][6];
        int j = 0;
        int i = 0;
        int[] numeriEstratti = new int[30];
        int k = 0;

            while (k <= 29) {
                int numero = nuovoEstratto();
                boolean presente = false;

                for (i = 0; i <= k; i++) {
                    if(numeriEstratti[i] == numero) {
                        presente = true;
                    }
                }

                if(!presente) {
                    numeriEstratti[k] = numero;
                    k++;
                }
            }

            k = 0;

            for (j = 0; j < 5; j++) {
                for (i = 0; i <= schedina.length; i++) {
                    schedina[j][i] = numeriEstratti[k];
                    k++;
                    System.out.printf("%4d", schedina[j][i]);
                }
                        System.out.println();
            }
    }

    public static int nuovoEstratto() {
        int numeri = 0;

        numeri = (int) (Math.random() * 90) + 1;
        return numeri;

    }
}