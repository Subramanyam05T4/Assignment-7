import java.util.*;
class Year
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter current year:");
int c=sc.nextInt();
System.out.println("Enter the year in which employee joined:");
int j=sc.nextInt();
int d=c-j;
int b=0;
if(d>5)
{
b=5000;
}
else if(d>=3 && d<=5)
{
b=3000;
}
else
{
b=0;
}
System.out.print("You are given a bonus of:"+b);
}
}