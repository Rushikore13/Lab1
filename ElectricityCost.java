package demo.ptpl;
import java.util.Scanner;
public class ElectricityCost {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Units");
		int u=sc.nextInt(),support=0, cost=0;
        while(u!=0){
            if(u>300){
                support= u-300;
                cost += support*25;
                u -= support;
            }else if(u>200 && u<301){
                support= u-200;
                cost += support*20;
                u -= support;
            }else if(u>100 && u<201){
                support= u-100;
                cost += support*15;
                u -= support;
            }else{
                support= u;
                cost += support*10;
                u -= support;
            }
            sc.close();
           support=0; 
        }
  System.out.println(cost);
	}

}
