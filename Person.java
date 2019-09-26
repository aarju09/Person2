class Person
{  String name;
	String phone;
	Person(String name,String phone)
	{
		System.out.println("Name is: "+name);
		System.out.println("phone number is :"+phone);
	}
 static class Address
{   
		
		String address_line;
		String city;
		double pin_code;
		String state;
		
	Address(String address_line,String city,double pin_code,String state)
	{
      System.out.println("Home Address is :"+address_line +city  +pin_code  +state);
	  //System.out.println("Office Address is :"+address_line +city +pin_code +state);
	}

}
		public static void main(String[] args)
		{
			Person b = new Person("Aarju","123456789");
			Address a = new Address("Siddhivianya Carona","Pune",411014,"Maharashtra");
			Address c = new Address("MESCOE","Pune",4111012,"Maharashtra");
}
}
