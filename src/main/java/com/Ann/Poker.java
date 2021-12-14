package com.Ann;

public class Poker {
    public static void main(String[] args) {
        for (int i =0;i<4;i++){
            for (int j = 0;j<13;j++){
                if(i==0){
                    System.out.print((j+1)+"c");
                }else if (i==1){
                    System.out.print((j+1)+"d");
                }else if (i==2){
                    System.out.print((j+1)+"h");
                }else {
                    System.out.print((j+1)+"s");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
