
public class Employee {
		int id;
		String name;
		double sal;
		Employee()
		{
			
		}
		Employee(int eid,String ename,double esal)
		{
			this.id=eid;
			this.name=ename;
			this.sal=esal;
		}
		
		public void showTotalSal()
		{
		System.out.println(sal);
			
		}
		
		
	

}
