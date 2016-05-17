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
    	String[] doubleArray = {"","teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
    	String[] singleArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String hundred  = "hundred";
    	int doublefigures = n / 10; //0~9
    	int singlefigures = n % 10; //0~9
    	int triplefigures = n / 100;
    	
    	if(doublefigures == 0) {
    		str = doubleArray(singleArray, singlefigures);
    	}else if (doublefigures == 1) { 
    		if(singlefigures == 4 ||singlefigures == 6 || singlefigures == 7|| singlefigures == 9){ //14,16,17,19
    			str = singleArray[singlefigures] + doubleArray[1];
    		}else if(singlefigures == 0){ //10
    			str = "ten";
    		}else if(singlefigures == 1){ //11
    			str = "eleven";
    		}else if(singlefigures == 2){ //12
    			str = "twelve";
    		}else if(singlefigures == 3){ //13
    			str = "thirteen";
    		}else if(singlefigures == 5){ //15
    			str = "fifteen";
    		}else if(singlefigures == 8){ //18
    			str = "eighteen";
    		}
    		
    	} else if(doublefigures >=2 && doublefigures <= 9){ //20-99
    		if(singlefigures == 0){ //20,30,40...
    			str = doubleArray(doubleArray, doublefigures);
    		}else{
    			str = doubleArray[doublefigures] +" "+ singleArray[singlefigures];
    		}
    	} else if(doublefigures == 10){ //100
    		if(singlefigures == 0){
    			str = "one hundred"; 
    		}
    	}else{ //例外
    		str = "0~100の数字を入力してください。";
    	}
    	
    	return str;
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
    		
    }
    
	private static String doubleArray(String[] doubleArray, int doublefigures) {
		String str;
		str =doubleArray[doublefigures];
		return str;
	}

}
