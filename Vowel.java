import java.util.*;
class A
{
 boolean isVowel(char ch)
{
return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
}


class Vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine().toLowerCase();
int c=0;
A t=new A();
boolean vowPres=false;
for(int i=0;i<s.length();i++)
{
char p=s.charAt(i);
if(t.isVowel(p))
{
c++;
}
}
if(c>0)
{
System.out.println("Vowels are present in String:");
System.out.println("count of vowels is:"+c);
}
else
{
System.out.println("there are no vowels present in the string:");
}
}
}
