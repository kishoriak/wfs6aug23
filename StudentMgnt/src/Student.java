
public class Student { //Object
  private int sid;
  private String fname;
  private String lname;
  private float m1,m2,m3;
  
  //default constructor
  public Student() {
	  sid=0;
	  fname=null;
	  lname=null;
	  m1=0.0f;
	  m2=0.0f;
	  m3=0.0f;
  }
//parametrised constructor
  public Student(int id) {
	  sid=id;
	  fname=null;
	  lname=null;
	  m1=0.0f;
	  m2=0.0f;
	  m3=0.0f;
  }
  //parametrised constructor
  public Student(int sid,String nm,String lname,float m1,float m2,float m3) {
	  this.sid=sid;
	  this.fname=nm;
	  this.lname=lname;
	  this.m1=m1;
	  this.m2=m2;
	  this.m3=m3;
  }
  
  //setter and getter methods
  public void setSid(int id) {
	  sid=id;
  }
  public int getSid() {
	  return sid;
  }
  public void setFname(String fname) {
	  this.fname=fname;
  }
  public String  getFname() {
	  return fname;
  }
  public void setLname(String lname) {
	  this.lname=lname;
  }
  public String  getlname() {
	  return lname;
  }
  public void setM1(float m1) {
	 this.m1=m1;
  }
  public float getM1() {
	  return m1;
  }
  public void setM2(float m2) {
		 this.m2=m2;
  }
  public float getM2() {
		  return m2;
  }
  public void setM3(float m3) {
		 this.m3=m3;
  }
  public float getM3() {
		  return m3;
  }
  public String toString() {
	  //return sid+","+fname+" "+lname+","+m1+","+m2+","+m3;
	  return "Id : "+sid+"name: "+fname+"  "+lname+"M1: "+m1+"M2: "+m2+"M3 : "+m3;
  }
  
  
}
