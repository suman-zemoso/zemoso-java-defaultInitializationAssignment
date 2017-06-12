package suman.assignment.main;
import suman.assignment.singleton.Sing;
import suman.assignment.data.Dat;


public class Mai {
	public static void main(String[] args) {
		Dat ob1 = new Dat();
		ob1.printMem();
		ob1.printLoc();
		Sing ob2 = Sing.reObj("yo");
		ob2.printStri();
	}
}
