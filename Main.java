import java .util.*;
public class Main{
   public static void main(String[] args) {

    System.out.println("---------------------------------WELCOME TO BANK MANAGEMENT SYATEM----------------------------");
    Scanner sc=new Scanner(System.in);
    //Input part for the Employee
    int size1=sc.nextInt();
    Employee emp[]=new Employee[size1];
    for(int i=0;i<size1;i++){
        int a=sc.nextInt();
        sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        String d=sc.nextLine();
        String e=sc.nextLine();
        emp[i]=new Employee(a,b,c,d,e);
    }
    
    //Input Part for Customer
    int size2=sc.nextInt();
    Customer cust[]=new Customer[size2];
    for(int i=0;i<size2;i++){
       int a=sc.nextInt();
       sc.nextLine();
       String b=sc.nextLine();
       String c=sc.nextLine();
       String d=sc.nextLine();
       String e=sc.nextLine();
       String f=sc.nextLine();
       String g=sc.nextLine();
       String h=sc.nextLine();
       cust[i]=new Customer(a,b,c,d,e,f,g,h);
    }

    //Taking ssn input
    int ssn=sc.nextInt();
    Customer newcust=getCustomerBySsnId(cust, ssn);
    if(newcust!=null){
        System.out.println("The customer Details : ");
        System.out.println("Customer SSN : "+newcust.getSSN());
        System.out.println("Customer Name : "+newcust.getCustomerName());
        System.out.println("Customer Email : "+newcust.getEmail());
        System.out.println("Customer Address : "+newcust.getAddress());
        System.out.println("Customer Contact : "+newcust.getContact());
        System.out.println("Customer Addhar : "+newcust.getAddhar());
        System.out.println("Customer Pan : "+newcust.getPan());
        System.out.println("Customer Account No : "+newcust.getAccountNo());
    }else{
        System.out.println("No Customer Found with the entered ssn");
    }
    //Update Customer
   
    // int updatessn=sc.nextInt();
    // updateCustomerBySsnId(cust, updatessn);
    
    //Delete Customer
    // int deletessn=sc.nextInt();
    // deleteCustomerBySsnId(cust, deletessn);

    sc.close();
   }

   public static Customer getCustomerBySsnId(Customer cust[],int ssn){
          for(int i=0;i<cust.length;i++){
            if(cust[i].getSSN()==ssn){
                return cust[i];
            }
          }
          return null;
   }
   //Finding customer with the matched ssn
   public static void updateCustomerBySsnId(Customer cust[],int ssn){
    Scanner sc=new Scanner(System.in);
    int ind=0;
    //Printing Customer Details as per the input:
    for(int i=0;i<cust.length;i++){
      if(cust[i].getSSN()==ssn && cust[i]!=null){
        System.out.println("The customer Details : ");
        System.out.println("Customer SSN : "+cust[i].getSSN());
        System.out.println("Customer Name : "+cust[i].getCustomerName());
        System.out.println("Customer Email : "+cust[i].getEmail());
        System.out.println("Customer Address : "+cust[i].getAddress());
        System.out.println("Customer Contact : "+cust[i].getContact());
        System.out.println("Customer Addhar : "+cust[i].getAddhar());
        System.out.println("Customer Pan : "+cust[i].getPan());
        System.out.println("Customer Account No : "+cust[i].getAccountNo());
        ind=i;
      }else{
        System.out.println("No customer found with this SSN");
      }
    }
    System.out.println("Lets update : ");
    System.out.println("Press 1 to update Name \n Press 2 to update Email \n Press 3 to update address \n Press 4 to update contact No.\nPress 5 to update Addhar\nPress 6 to update Pan");
    int op=sc.nextInt();
    switch(op){
        case 1:
        System.out.println("Enter the new name : ");
        String a=sc.nextLine();
        cust[ind].setCustomerName(a);
        break;
        case 2:
        System.out.println("Enter the new email : ");
        String b=sc.nextLine();
        cust[ind].setEmail(b);
        break;
        case 3:
        System.out.println("Enter the new address : ");
        String c=sc.nextLine();
        cust[ind].setEmail(c);
        break;
        case 4:
        System.out.println("Enter the new contact : ");
        String d=sc.nextLine();
        cust[ind].setContact(d);
        break;
        case 5:
        System.out.println("Enter the new addhar : ");
        String e=sc.nextLine();
        cust[ind].setAddhar(e);
        break;
        case 6:
        System.out.println("Enter the new pan : ");
        String f=sc.nextLine();
        cust[ind].setPan(f);
        break;
        default:System.out.println("Invaild input.");
    }
    sc.close();
}

  public static void deleteCustomerBySsnId(Customer cust[],int ssn){
    for(int i=0;i<cust.length;i++){
        if(cust[i].getSSN()==ssn){
            cust[i]=null;
        }
    }
  }

}
//Employee Class
class Employee{
   int empId;
   String empName;
   String email;
   String password;
   String address;
   public Employee(int empId,String empName,String email,String password,String address){
    this.empId=empId;
    this.empName=empName;
    this.email=email;
    this.password=password;
    this.address=address;
    //Constructor
    System.out.println("Employee registed Successfully.");
    System.out.println("Employee Id : "+this.empId);
    System.out.println("Employee Name : "+this.empName);
    System.out.println("Employee Email : "+this.email);
    System.out.println("Employee Password : "+this.password);
    System.out.println("Employee Address : "+this.address);
   }
   //Getters
   public int getEmpId(){
    return this.empId;
   }
   public String getEmpName(){
    return this.empName;
   }
   public String getEmpEmail(){
    return this.email;
   }
   public String getEmpPassword(){
    return this.password;
   }
   public String getAddress(){
    return this.address;
   }
   //Setters
   public void setEmpId(int empId){
    this.empId=empId;
   }
   public void setEmpName(String empName){
    this.empName=empName;
   }
   public void setEmpEmail(String email){
    this.email=email;
   }
   public void setEmpPassword(String password){
    this.password=password;
   }
   public void setEmpAddress(String address){
    this.address=address;
   }
}
//class customer
class Customer{
    int ssn;
    String custName;
    String email;
    String address;
    String contact;
    String addhar;
    String pan;
    String account_no;
    //Constructor
    public Customer(int ssn,String custName,String email,String address,String contact,String addhar,String pan,String account_no){
        this.ssn=ssn;
        this.custName=custName;
        this.email=email;
        this.address=address;
        this.contact=contact;
        this.addhar=addhar;
        this.pan=pan;
        this.account_no=account_no;
        System.out.println("Customer Registered Successfully.");
        System.out.println("Customer SSN : "+this.ssn);
        System.out.println("Customer Name : "+this.custName);
        System.out.println("Customer Email : "+this.email);
        System.out.println("Customer Address : "+this.address);
        System.out.println("Customer Contact : "+this.contact);
        System.out.println("Customer Addhar : "+this.addhar);
        System.out.println("Customer Pan : "+this.pan);
        System.out.println("Customer Account No : "+this.account_no);
    }
    //Getters
    public int getSSN(){
        return this.ssn;
    }
    public String getCustomerName(){
        return this.custName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getAddress(){
        return this.address;
    }
    public String getContact(){
        return this.contact;
    }
    public String getAddhar(){
        return this.addhar;
    }
    public String getPan(){
        return this.pan;
    }
    public String getAccountNo(){
        return this.account_no;
    }
    //Setters
    public void setSSN(int ssn){
        this.ssn=ssn;
    }
    public void setCustomerName(String custName){
        this.custName=custName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setContact(String contact){
        this.contact=contact;
    }
    public void setAddhar(String addhar){
        this.addhar=addhar;
    }
    public void setPan(String pan){
        this.pan=pan;
    }
    public void setAccountNo(String account_no){
        this.account_no=account_no;
    }
}