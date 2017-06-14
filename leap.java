class leap{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
if((a%4==0)&&(a%400==0))
System.out.println("the year is leap year");
if((a%4==0)&&(a%100!=0))
System.out.println("the year is leap year");
else if(a%100==0)
System.out.println("the year is not leap year");
else
System.out.println("the year is not leap year");
}
}