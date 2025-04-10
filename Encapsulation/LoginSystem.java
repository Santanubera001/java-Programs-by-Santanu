class Sceure
{
    private String userName;
    private String  password;

    public Sceure(String userName, String password)
     {
        this.userName = userName;
        this.password = password;
    }

    
    
    public String getUserName()
    {
    return userName;
    }
    public String getPassword()
    {
    return password;
    }
     
  public  void setUserName(String userName)
  {
     this.userName=userName;
  }
  public  void setPassword(String password)
  {
    if(password.length()>=6)
       this.password=password;
       else
          System.out.println("Invalid Password");
  }
 
   public  void login(String username,String password)
   {
       if(this.userName.equals(username) && this.password.equals(password))
         System.out.println("Succesful Logged in");
         else  
            System.out.println("Login Feild");
   }

}







public class LoginSystem
 {
    public static void main(String[] args)
     {
        Sceure  s=new  Sceure("Santanu003","Santanu12345");
         s.login("Santanu003","Santanu12345");

    }
}
