package practice01;

public class Person {
	private String name;
	private int age;
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * <p>Title: introduce</p >
	 * <p>Description: TODO</p >
	 * @return
	 * @author syf  2019年8月22日 下午7:24:14
	 */
	public String introduce() {
		// TODO Auto-generated method stub
		return "My name is Tom. I am 21 years old.";
	}
	
}
