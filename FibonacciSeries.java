package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
			 int firstNum=0,secNum=1,sum,i,range=8;
			 System.out.print(firstNum+" "+secNum);  
			  
			 for(i=2;i<range;++i)
			 {  
			  sum=firstNum+secNum;
			  firstNum=secNum;
			  secNum=sum;
			  System.out.print(" "+sum); 
			 }  
			 
		}
		
	}
