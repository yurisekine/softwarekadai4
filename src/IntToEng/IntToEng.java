package IntToEng;
import java.util.Scanner;


public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    }
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String str = "";
    	String[] hutaketaArray = {"teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
    	int hutaketame = n / 10; //0~9
    	if (n == 1) {
    		str = "" + hutaketaArray[0];
    	} else {
    		str = hutaketaArray[1] + "";
    	}
    /*	
    	if (n == 0) str = Zero();
    	else if (n == 1) str = One();
    	else if (n == 2) str = Two();
    	else if (n == 3) str = Three();
    	else if (n == 4) str = Four();
    	else if (n == 5) str = Five();
    	else if (n == 6) str = Six();
    	else if (n == 7) str = Seven();
    	else if (n == 8) str = Eight();
    	else if (n == 9) str = Nine();
    	else if (n == 10) str = Ten();
    	else if (n == 11) str = Eleven();
    	else if (n == 12) str = Twelve();
    	
    	//else if (n / 10 == 1) str = 
    			
    	else if (n == 16) {//16,17,19
    		int amari = n % 10;
    		if (amari == 6) str = Six();//6
    		else if (amari == 7) str = Seven();
    		else if (amari == 9) str = Nine();
    		
    		String teen = Teen();
    		int hutaketame = n / 10;
    		if(hutaketame == 1) str = str + teen;
    	}
    			
    	else return str="";*/
    		return str;
    }
    
    static String Zero() {
    	return "zero";
    }
    static String One() {
    	return "one";
    }
    static String Two() {
    	return "two";
    }
    static String Three() {
    	return "three";
    }
    static String Four() {
    	return "four";
    }
    static String Five() {
    	return "five";
    }
    static String Six() {
    	return "six";
    }
    static String Seven() {
    	return "seven";
    }
    static String Eight() {
    	return "eight";
    }
    static String Nine() {
    	return "nine";
    }
    static String Ten() {
    	return "ten";
    }
    static String Eleven() {
    	return "eleven";
    }
    static String Twelve() {
    	return "twelve";
    }
    
    
    static String Teen() {
    	return "teen";
    }

}
