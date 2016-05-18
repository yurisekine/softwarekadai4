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
    	String[] doubleArray = {"","", "twen", "thir", "for", "fif", "six", "seven", "eigh", "nine"}; 
    	String[] singleArray = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    	String hun  = " hundred ";
    	int triplefigures = n / 100;
    	int doublefigures = n / 10; //0~9
    	int singlefigures = n % 10; //0~9
    	
    	if(n==1000) {
    		str = "one thousand";
    	}else if(triplefigures != 0) {
    		if(n%100 != 0){
    		str = singleArray[triplefigures] + hun + translateEng(n % 100);
    		}else{
    			str = singleArray[triplefigures] + hun ;
    		}
    	}
    	if(doublefigures == 0) {//0-9
    		str = singleArray[singlefigures];
    		
    	}else if (doublefigures == 1) {  //10-19
    		//10,11,12,14
    		if(singlefigures == 0){ //10
    			str = "ten";
    		}else if(singlefigures == 1){ //11
    			str = "eleven";
    		}else if(singlefigures == 2){ //12
    			str = "twelve";
    		}else if(singlefigures == 4) {
    			str = "fourteen";
    		} else { //13,15,16,17,18,19
    			str = doubleArray[singlefigures] + "teen";    			
    		}
    		
    	} else if(doublefigures >=2 && doublefigures <= 9){ //20-99
    		if(singlefigures == 0){ //20,30,40...    
    			str = doubleArray[doublefigures] + "ty";   			
    		}else{
    			str = doubleArray[doublefigures] + "ty" + " "+ singleArray[singlefigures];
    		}
    	}else{ //例外
    		//str = "0~100の数字を入力してください。";
    	}
    	return str;	
    }
}
