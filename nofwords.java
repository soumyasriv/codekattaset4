import java.util.Scanner;
class main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] ch=str.toCharArray();
String s="";
while (i<=ch.length-1)
{
if (ch[i]==' ')
{
count++;
i++;
}
else
i++;
}
System.out.println(count+1);
}}
