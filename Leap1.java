class Leap1
{
  public static void main(String...args)
{
  int Year=2036;
  if(Year%4==0 && Year%100!=0 || Year%4==0 && Year%400==0)
{
  System.out.println("leap year");
}
 else
{ 
  System.out.println("not a leap year");
}
}
}