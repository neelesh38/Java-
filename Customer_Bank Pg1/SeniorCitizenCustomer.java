class SeniorCitizenCustomer extends Customer
{
    double generateBillAmount(double amount)
    {
        return amount-((amount*12)/100);
    }
}