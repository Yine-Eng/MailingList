/**
   The Person class stores data about a person for the
   Person and Customer Classes programming challenge.
*/
public class Person
{
      private String name;
      private String address;
      private String telephone;


public Person(String name, String address, String telephone)
  {
  this.name = name;
  this.address = address;
  this.telephone = telephone;
  }

public String getName()
  {
      return name;
  }

public String getAddress()
  {
      return address;
  }

public String getTelephone()
  {
      return telephone;
  }

public void setName(String name)
  {
      this.name = name;
  }

public void setAddress(String address)
  {
      this.address = address;
  }

public void setTelephone(String telephone)
  {
      this.telephone = telephone;
  }
}
  

