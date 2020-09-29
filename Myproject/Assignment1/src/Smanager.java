public class Smanager extends Manager {
	int eid;
	String ename;
	double esal;
	double allo;
	double com;
	public Smanager()
	{
	
	}
	public Smanager(int eid,String ename,double esal,double allo,double com)
	{
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
	this.allo=allo;
	this.com=com;
	}
	public void showTotalSal()
	{
	System.out.println(esal+allo+com);
		
	}
	

}
