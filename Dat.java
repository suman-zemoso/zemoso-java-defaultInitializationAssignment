package suman.assignment.data;

public class Dat {
	public int i;
	public char c;
	public void printMem() {
		System.out.println("uninitialized class members, int i = " + i + " , char c = " + c);
	}
	public void printLoc() {
		int i1;
		char c1;
		/*java doesn't initialize local variables of a method as it does for class members.  
		System.out.println("uninitialized local members, int i1 = " + i1 + " , char c1 = " + c1); */
	}
}
