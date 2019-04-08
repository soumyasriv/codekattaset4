import java.util.Scanner;
public class Solution
{
public sttaic void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for (int i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
int no_of_guest=sc.nextInt();
double area,largest_piece,min;
min=a[0];
for (int i=0;i<=n;i++)
{
if (min>a[i])
{
min=a[i];
}
else 
{min =a[i];
}
} 
area=3.14*min*min;
largest_piece=area/no_of_guest;
System.out.println(largest_piece);
}
}
