import java.util.*;
import java.io.*;
class Sample{
	public static void main(String[] args) {
		 int[] l=new int[] {31,29,31,30,31,31,30,31,30,31};
	        int[] nl=new int[] {31,28,31,30,31,31,30,31,30,31};
	        int k=0,sum=0,year=2015,month=5,day=8;
	        if(year%400==0&&year%4==0&&year%100!=0)
	        {
	             while(k+1<month)
	            {
	                sum=sum+l[k];
	                //System.out.println(l[k]);
	                k++;
	            }

	        }
	        else
	        {
	            while(k+1<month)
	            {
	            	//System.out.println(nl[k]);
	                sum=sum+nl[k];
	                k++;
	            }
	        }
	        sum=sum+day;
	        //System.out.println(sum);
	        int re=sum%7;
	        //System.out.println(re);
	        switch(re)
	        {
	        case 0:
	        	System.out.println("MONDAY");
	        	break;
	        case 1:
	        	System.out.println("TUESDAY");
	        	break;
	        case 2:
	        	System.out.println("WEDNESDAY");
	        	break;
	        case 3:
	        	System.out.println("THURSDAY");
	        	break;
	        case 4:
	        	System.out.println("FRIDAY");
	        	break;
	        case 5:
	        	System.out.println("SATURDAY");
	        	break;
	        case 6:
	        	System.out.println("SUNDAY");
	        	break;
	        
	        	
	        }
		}
		

	}

