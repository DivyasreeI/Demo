public class Sample
{


public void add(int a, int b)
{
  System.out.println(a+b);
}

public void sub(int a, int b)
{
   System.out.println(a-b);
}

public void mul(int a, int b)
{
    System.out.println(a*b);
}

public void div(int a, int b)
{
   System.out.println(a/b);
}

public static void main(String[] args)
{
 
 
 Sample s = new Sample();

s.add(10,20);

s.sub(40,25);

s.mul(10,15);

s.div(100,25);

 

}



}
