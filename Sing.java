package suman.assignment.singleton;

public class Sing {
	public String s;
	public static Sing reObj(String s1) {
		Sing si = new Sing();
		si.s = s1;
		return si;
	}
	public void printStri() {
		System.out.println("String is :" + s);
	}
}
