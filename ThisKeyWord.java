public class ThisKeyWord 
{
    public void  m1()
    {
      System.out.println(this);
    }
    public static void main(String[] args)
     {
        ThisKeyWord tk1=new ThisKeyWord();
        ThisKeyWord tk2=new ThisKeyWord();
        System.out.println(tk1);
       System.out.println(tk2);
       System.out.println("------------");
       tk1.m1();
       tk2.m1();
    }
}
