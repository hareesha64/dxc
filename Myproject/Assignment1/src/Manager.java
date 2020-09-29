public class Manager extends Employee
{
	int eid;
	String ename;
	double esal;
	double allo;
	Manager()
	{
	}
	Manager(int eid,String ename,double esal,double allo)
	
	{
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
	this.allo=allo;
	}
	public void showTotalSal()
	{
	System.out.println(esal+allo);
		
	}
//System.out.println("hi";)
}
