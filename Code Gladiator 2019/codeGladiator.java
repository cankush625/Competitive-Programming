package com;
import java.util.Scanner;

public class codeGladiator {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int T;
        int N;

        System.out.println("Enter number of test cases");
        T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println("Enter no. of villains and players : ");
            N = scanner.nextInt();

            int[] strengthOfVillain = new int[N];
            int[] strengthOfPlayer = new int[N];

            System.out.println("Enter the strength of the villain");
            for (int j = 0; j < N; j++) {
                strengthOfVillain[j] = scanner.nextInt();
            }
            System.out.println("Enter the strength of the player");
            for (int k = 0; k < N; k++) {
                strengthOfPlayer[k] = scanner.nextInt();
            }

                switch (T) {
                    case 1:
                        bubble_sort(strengthOfPlayer);
                        bubble_sort(strengthOfVillain);

                        int gamesWon = 0;
                        int gamesLose = 0;
                        for (int l = 0; l < N; l++){
                            if (strengthOfPlayer[l] > strengthOfVillain[l]) {
                                gamesWon++;
                            }else{
                                gamesLose++;
                            }
                        }

                            if (gamesWon > (N/2)){
                                System.out.println("WIN");
                            }else{
                                System.out.println("LOSE");
                            }
                            break;
                    case 2 :
                        int gamesWon1 = 0;
                        int gamesLose1 = 0;
                        for (int l = 0; l < N; l++){
                            if (strengthOfPlayer[l] > strengthOfVillain[l]) {
                                gamesWon1++;
                            }else{
                                gamesLose1++;
                            }
                        }

                        if (gamesWon1 == N){
                            System.out.println("WIN");
                        }else{
                            System.out.println("LOSE");
                        }
                        break;
            }
        }
    }

        public static void bubble_sort ( int[] array1){

            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    swap(array1, i, i + 1);
                }
            }
        }
        public static void swap ( int[] array1, int i, int j){
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
        }
}