package suman.assignment.singleton;

public class Sing {
	public String s;
	/*public Sing() {}
	public Sing(String s2) {s = s2;} */
	public static Sing reObj(String s1) {
		/*here s cannot be initialized as it is non static and this is static context. So s is being initiated through constructor.
		s = s1;  */
		Sing si = new Sing();
		si.s = s1;
		//return new Sing(s1);
		return si;
	}
	public void printStri() {
		System.out.println("String is :" + s);
	}
}
