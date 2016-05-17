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
    	//String[] doubleArray = {"","teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
    	String[] doubleArray = {"","", "twen", "thir", "for", "fif", "six", "seven", "eigh", "nine"}; 
    	String[] singleArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String teen = "teen";
    	String ty = "ty";
    	String hun  = " hundred ";
    	int triplefigures = n / 100;
    	int doublefigures = n / 10; //0~9
    	int singlefigures = n % 10; //0~9
    		
    	if(triplefigures != 0) {
    		//if(!= 0)
    		str = singleArray[triplefigures] + hun + translateEng(n % 100);
    	} 
    	
    	
    	if(doublefigures == 0) {//0-9
    		str = singleArray[singlefigures];
    		//str = doubleArray(singleArray, singlefigures);
    		
    	}else if (doublefigures == 1) {  //10-19
    		//10,11,12,14
    		if(singlefigures == 0){ //10
    			str = "ten";
    		}else if(singlefigures == 1){ //11
    			str = "eleven";
    		}else if(singlefigures == 2){ //12
    			str = "twelve";
    		}else if(singlefigures == 4) {
    			str = "four" + teen;
    		} else { //13,15,16,17,18,19
    			str = doubleArray[singlefigures] + teen;    			
    		}
    		
    	} else if(doublefigures >=2 && doublefigures <= 9){ //20-99
    		if(singlefigures == 0){ //20,30,40...    
    			str = doubleArray[doublefigures] + ty;   			
    		//	str = doubleArray(doubleArray, doublefigures);
    		}else{
    			str = doubleArray[doublefigures] + ty + " "+ singleArray[singlefigures];
    		}
    		
    	} else if(doublefigures == 10){ //100
    		if(singlefigures == 0){
    			str = "one hundred"; 
    		}
        	
        /*	if(triplefigures == 1) {
        		str = singleArray[triplefigures] + hun + translateEng(n%100);//100
        	} else if (triplefigures == 2) {
        		
        	}
        	*/
    	}else{ //例外
    		//str = "0~100の数字を入力してください。";
    	}
    	return str;
    		
    }
    
    
    
/*	private static String doubleArray(String[] doubleArray, int doublefigures) {
		String str;
		str =doubleArray[doublefigures];
		return str;
	}*/

}
