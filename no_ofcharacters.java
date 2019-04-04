import java.util.Scanner;
class Solution
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int i,count=0;
char[] ch=str.toCharArrray();
while (i<=ch.length-1)
{
if (ch[i]>='0' && ch[i]<='9')
{
count++;
i++;
}
else
i++;
}
System.out.print(count);
}}

