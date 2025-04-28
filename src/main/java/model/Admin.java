package model;

public class Admin {
   public String adminID ;
   public String name;
   public String contact;
   public String email;
   public Employee employee;

   public Admin(Employee employee,String adminID,String name,String contact,String email)
   {
     this.adminID =adminID;
     this.employee=employee;
     this.contact=contact;
     this.name=name;
     this.email=email;
   }
  public String getAdminDetails() {
    return "Admin: " + name + ", ID: " + adminID + ", Contact: " + contact;
  }
}
