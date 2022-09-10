import java.lang.*;
class Rectangle
{
int length,width;
void getdata(int x,int y)
{
length=x;
width=y;
}
int rectarea()
{
return(length*width);
}
}
//class Rectangle close
//data binding or encapsulation
class Rectarea
{
public static void main(String args[])
{

Rectangle S=new Rectangle();
S.getdata(20,3);
System.out.println("Area = "+S.rectarea());
}
}