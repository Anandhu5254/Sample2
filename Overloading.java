class Overloading
{
  public static void main(String...args)
{
  int x=6; int y=3;
  Math();
  Math(x);
  Math(x,y);
}
  static void Math()
{
  System.out.println("Math");
}
  static void Math(int x)
{
  System.out.println(x);
}
  static void Math(int x,int y)
{
  System.out.println(x+y);
}
}