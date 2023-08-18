import java.util.Date;

public class Person {
	private int pid;
	private String name;
	private Date bdate;
	private int age;
	public Person() {
		/*pid=0;
		name=null;
		bdate=null;
		age=0;*/
		this(0,null,null,0);
	}
	public Person(int id,String name,Date bdate,int age) {
		pid=id;
		this.name=name;
		this.bdate=bdate;
		this.age=age;
	}
	public void setPid(int id) {
		pid=id;
	}
	public int getPid() {
		return pid;
	}
	public void setName(String nm) {
		name=nm;
	}
	public String getName() {
		return name;
	}
	public void setBdate(Date dt) {
		bdate=dt;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "Id : "+pid+" Name : "+name+" BDate: "+bdate+" Age: "+age;
	}

}
