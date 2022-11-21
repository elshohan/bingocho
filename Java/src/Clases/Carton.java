package Clases;

public class Carton {
    public int[][] lista = new int[11][10];

    public void mostrarCarton() {
        int aux = 1;
        // Llenar lista del 1 al 90
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                lista[i][j] = aux;
                aux++;
            }
        }
        // Mostrar lista
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println(" " + lista[i][0] + "  " + lista[i][1] + "  " + lista[i][2] + "  " + lista[i][3] + "  " + lista[i][4] + "  " + lista[i][5] + "  " + lista[i][6] + "  " + lista[i][7] + "  " + lista[i][8] + " " + lista[i][9]);
            }
            else {
                System.out.println(lista[i][0] + " " + lista[i][1] + " " + lista[i][2] + " " + lista[i][3] + " " + lista[i][4] + " " + lista[i][5] + " " + lista[i][6] + " " + lista[i][7] + " " + lista[i][8] + " " + lista[i][9]);
            }
        }
    }
}
