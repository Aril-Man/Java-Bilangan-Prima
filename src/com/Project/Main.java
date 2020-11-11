package com.Project;

public class Main {

    public static void main(String[] args) {

        int input = 100;

        System.out.println("================ Bilangan Prima 1 - 100 ================");

        for(int i=2; i<input; i++) {
            boolean pri = true;

            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    pri = false;
                    break;

                }
            }
            if(pri==true){
                System.out.print(i+",");
            }
        }

    }
}
