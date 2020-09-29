public class user {
	public static void main(String args[])
	{
		int c=0;
		Employee e[]=new Employee[3];
		e[0]=new Employee(1,"hareesha",1000);
		e[1]=new Manager(2,"hari",2000,200);
		e[2]=new Smanager(3,"hare",3000,300,30);
		for (Employee e1:e)
		{
			c=c+1;
			e1.showTotalSal();
		}
		System.out.println(c);
	}

}
