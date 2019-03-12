import java.util.Scanner;
class main
{
public static void main(String args[])
{
int i=0,count=0;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] ch=str.toCharArray();
while(i<=ch.length-1)
{
if (ch[i]=' ')
{count++;
i++;}
else
i++;
}
System.out.println(count);
}}
