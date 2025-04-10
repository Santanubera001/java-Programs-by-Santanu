/*3. Employee Salary Hike Calculator
Create an Employee class with fields: empId, name, salary.
	•	Provide proper encapsulation using private fields and public getters/setters.
	•	Add a method applyHike(double percentage) that increases the salary based on the percentage passed.
 */


 class Employee
 {
     private int empId;
     private  String name;
     private double salary;

    public  int getEmpId()
    {
        return  empId;
    }
    public  String getName()
    {
        return  name;
    }
    public  double  getSalary()
    {
        return  salary;
    }
    
    public void setEmpId(int empId)
    {
        this.empId=empId;
    } 
    public void setName(String name)
    {
        this.name=name;
    } 
    public void setSalary(double  salary)
    {
        this.salary=salary;
    } 
    public void applyHike(double percentage)
    {
        if (percentage > 0)
         {
            double hikeAmount = salary * (percentage / 100);
            salary += hikeAmount;
            System.out.println("Hike applied: " + percentage + "%");
            System.out.println("New Salary: " + salary);
        } 
        else 
            {
                System.out.println("Invalid hike percentage.");
            }
    }
 }
public class SalaryHikeCalculator
 {
      public static void main(String[] args) 
      {
         Employee emp=new Employee();
         emp.setEmpId(001);
         emp.setName("Santanu");
         emp.setSalary(20000);

         System.out.println("Name of the employee :"+emp.getName());
         System.out.println("Salary of the employee :"+emp.getSalary());
         emp.applyHike(10);

      }
}
