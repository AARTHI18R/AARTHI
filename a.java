import java.io.*;
import java.util.*;
class a
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>0)
    System.out.println("positive");
    else if(a==0)
    System.out.println("zero");
    else
    System.out.println("negative");
  }
}
