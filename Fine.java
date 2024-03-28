import java.util.*;
class Fine
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of delayed days:");
int d=sc.nextInt();
double fine=0;
if(d<=7)
{
fine=d*0.50;
}
else if(d>=8 && d<=14)
{
fine=7*0.50+(d-7)*1.0;
}
else if(d>14 && d<=21)
{
fine=7*0.50+7*1.0+(d-14)*5.0;
}
else
{
System.out.println("your membership is cancelled for returning book after 21 days.");
}
System.out.println("Fine for returning book "+d+" days late is:"+fine);
}
}
