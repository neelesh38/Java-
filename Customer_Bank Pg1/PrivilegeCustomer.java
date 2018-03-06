class PrivilegeCustomer extends Customer
{
    double generateBillAmount(double amount)
    {
        return amount-((amount*30)/100);
    }
}