package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ex06_method obj = new Ex06_method();

        String[][] name = new String[5][2];
        double[][] sco = new double[5][6];
    	
        for (int i = 0; i < name.length; i++) {
    	    System.out.println("이름 :");
    	    name[i][0] = scan.next();

    	    System.out.println("국어 :");
    	    sco[i][0] = scan.nextDouble();

    	    System.out.println("영어 :");
    	    sco[i][1] = scan.nextDouble();
    	    
    	    System.out.println("수학 :");
    	    sco[i][2] = scan.nextDouble();

    	    sco[i][3] = obj.getSum(sco[i][0], sco[i][1], sco[i][2]);
    	    sco[i][4] = obj.getAvg(sco[i][3]);
    	    name[i][1] = obj.getHak(sco[i][4]);
    	    
        	}

        

        //랭크
        for (int i = 0; i < name.length; i++) {
        	sco[i][5] = 1;
            for (int j = 0; j < name.length; j++) {
                if (sco[i][4] > sco[j][4]) {
                	sco[i][5]++;
                }
            }
        }

        //Avg
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = i + 1; j < name.length; j++) {
                if (sco[i][4] > sco[j][4]) {
                    String temp = name[i][1];
                    name[i][1] = name[j][1];
                    name[j][1] = temp;

                    double[] tempS = sco[i];
                    sco[i] = sco[j];
                    sco[j] = tempS;
                }
            }
        }
        
        

        // 출력
        for (int i = 0; i < name.length; i++) {
        	System.out.println(name[i][0] + "\t" + (int)sco[i][3] + "\t" + sco[i][4] + "\t" + name[i][1] + "\t" + (int)sco[i][5]);
        }
    }
		
		
	
}
