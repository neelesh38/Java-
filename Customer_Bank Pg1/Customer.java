class Customer
{
    private String name;
    private String address;
    private int age;
    private String mno;
    
    void setName(String name)
    {
        this.name=name;
    } 
    void setAddress(String address)
    {
        this.address=address;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    void setMno(String mno)
    {
        this.mno=mno;
    }

    String getName()
    {
        return this.name;
    }
    String getAddress()
    {
        return this.address;
    }
    int getAge()
    {
        return this.age;
    }
    String getmno()
    {
        return this.mno;
    }

    void displayCustomer()
    {
        System.out.println("Bill Details"+"\n"+"Name "+this.name+"\n"+"Mobile "+this.mno+"\n"+"Age "+this.age+"\n"+"Address "+this.address);
    }
}