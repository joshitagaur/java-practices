class Interface_Demo_1
{
	public static void main(String args[])
	{
		Staff s = new Staff();
		s.setName("ABC");
		s.setBasicPay(10000);
		
		Labour l = new Labour();
		l.setName("XYZ");
		l.setHoursWorked(300);
		
		s.show();
		l.show();
		
		
		Employee e;
		e = s;
		e.show();
		
		e = l;
		e.show();
		
		Salary sal;
		sal = s;
		System.out.println(sal.getSalary());
		
		sal = l;
		System.out.println(sal.getSalary());
	}
}