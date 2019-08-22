package practice06;

public class Teacher extends Person{
	private int klass;
	/**
	 * @param name
	 * @param age
	 */
	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param age
	 */
	public Teacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the klass
	 */
	public int getKlass() {
		return klass;
	}
	/**
	 * @param klass the klass to set
	 */
	public void setKlass(int klass) {
		this.klass = klass;
	}
	
	/* (non-Javadoc)
	 * @see practice06.Person#introduce()
	 */
	@Override
	public String introduce() {
		// TODO Auto-generated method stub
		System.out.println(this.klass);
		return this.klass == 0?"My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.":"My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.";
	}
	
}

