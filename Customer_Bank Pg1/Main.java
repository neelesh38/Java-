import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1)Privilege Customer"+"\n"+"2)SeniorCitizen Customer"+"\n"+"Enter the Customer Type");
        int a=sc.nextInt();
        if(a==1)
            {
                PrivilegeCustomer pc=new PrivilegeCustomer();
                System.out.println("Enter the Name");
                String name=sc.next();
                pc.setName(name);
                System.out.println("Enter the Age");
                int age=sc.nextInt();
                pc.setAge(age);
                System.out.println("Enter the Address");
                String add=sc.next();
                pc.setAddress(add);
                System.out.println("Enter the Mobile Number");
                String mno=sc.next();
                pc.setMno(mno);
                System.out.println("Enter the Purchased Amount");
                double am=0.0;
                am=sc.nextDouble();
                pc.displayCustomer();
                System.out.println("Yout bill amount is Rs "+am+".Your bill amount is discount under privilege customer");
                Double d=pc.generateBillAmount(am);
                System.out.printf("You have to pay Rs %.2f",d);
            }
        else if(a==2)
            {
                
                SeniorCitizenCustomer pc=new SeniorCitizenCustomer();
                System.out.println("Enter the Name");
                String name=sc.next();
                pc.setName(name);
                System.out.println("Enter the Age");
                int age=sc.nextInt();
                pc.setAge(age);
                System.out.println("Enter the Address");
                String add=sc.next();
                pc.setAddress(add);
                System.out.println("Enter the Mobile Number");
                String mno=sc.next();
                pc.setMno(mno);
                System.out.println("Enter the Purchased Amount");
                double am=0.00;
                am=sc.nextDouble();
                pc.displayCustomer();
                System.out.println("Yout bill amount is Rs "+am+".Your bill amount is discount under senior citizen customer");
                Double d=pc.generateBillAmount(am);
                System.out.printf("You have to pay Rs %.2f",d);
            }
         else
            {
                System.out.println("Invalid Customer Type");
            }       


    }
}