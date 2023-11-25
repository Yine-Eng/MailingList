/**
   The Customer class stores data about a person 
   who is a customer for the Person and Customer 
   Classes programming challenge.
*/

public class Customer extends Person
{
    private String customerNumber;
    private boolean onMailingList;


public Customer(String name, String address, String telephone, String customerNumber, boolean onMailingList)
  {
      super(name, address, telephone);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
  }

public String getPhone()
  {
        return getTelephone();
  }

public boolean getMailingList()
  {
        return isOnMailingList();
  }

public void setPhone(String phone)
  {
        setTelephone(phone);
  }

public void setMailingList(boolean mailingList)
{
        setOnMailingList(mailingList);
}

  public String getCustomerNumber()
  {
    return customerNumber;
  }

  public boolean isOnMailingList()
  {
    return onMailingList;
  }

  public void setCustomerNumber(String customerNumber)
  {
    this.customerNumber = customerNumber;
  }

  public void setOnMailingList(boolean onMailingList)
  {
    this.onMailingList = onMailingList;
  }
}
