/**
 * Created by Jimin on 9/22/17.
 * NHN 모의테스트 2
 */

import java.util.Scanner;
public class NHN_2_JimJim {
    public static void main(String[] agrv){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];
        int[][] new_matrix = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++) {
                System.out.print(matrix[j][i]);
                if(j<size-1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
