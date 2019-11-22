package javaBasic;
import java.util.Scanner;

public class demo {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("积分为:");
		int score = input.nextInt();
		double discount = 1;
		if(score < 2000){
			discount = 0.9;
		}else if( score< 4000){
			discount = 0.8;
		}else if(score<8000){
			discount = 0.7;
		}else if(score>=8000){
			discount = 0.6;
		}
		System.out.println("该会员享受的积分是=1=1=1==1=1=1：" + discount);
	}
}