import java.util.Scanner;
class Solution {
public static voiid main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] ch=str.toCharArray();
int i=0,count=0;
while (i<=ch.length-1){
if (ch[i]=='.')
{ count++;
i++;
}
else
i++;
}
System.out.print(count+1);
}}
