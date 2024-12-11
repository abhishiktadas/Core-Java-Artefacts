package test;

class encapsulation
{
	private String emailid="abhishikta.d2@gmail.com";
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	private int age = 18;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class Encapsulation_Java {
	public static void main(String[] args) 
	{
		encapsulation e1 = new encapsulation();
		e1.setEmailid("dasabhi9429@gmail.com");
		System.out.println(e1.getEmailid());
		e1.setAge(27);
		System.out.println(e1.getAge());
	}

}
