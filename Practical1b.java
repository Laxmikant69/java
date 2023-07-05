class Practical1b
{
public static void main(String args[])
{
float l,b;
l=Float.parseFloat(args[0]);
b=Float.parseFloat(args[1]);
float area=l*b;
float perimeter=2*(l+b);
System.out.println("Area of rectangle= "+area);
System.out.println("Perimeter of rectangle= "+perimeter);
}
}