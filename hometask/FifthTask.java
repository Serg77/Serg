/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask;

/**
 *
 * @author Admin
 */
public class FifthTask {

    public static void main(String[] args) {
        int[][] matrix = sozdanieMatrix();

        sortMatrix(matrix);
    }

    private static void sortMatrix(int[][] matrix) {
        //сортировка
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int n = 0; n < matrix[k].length; n++) {
                        if (matrix[k][n] > matrix[i][j]) {
                            temp = matrix[k][n];
                            matrix[k][n] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }
        }
        
        
        System.out.println("\nУпорядоченный массив: ");
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] sozdanieMatrix() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
            
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Переходим на следующую строку
            
        }
        return matrix;
    }
}
