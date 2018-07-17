
public class AbstractTrail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AAA aaa = new AAA();	//*****   ERROR instance  *****
		BBB bbb = new BBB();	//*****   A Right way to use   *****
		CCC ccc = new CCC();
	}
}

abstract class AAA{
	int aaa;
	public abstract void speak();//** ATTENTION! The Special Defination!
	public void aaa(){
		//** Difine somethin'
	}
}

//**	You must extend the abstract class to get a instance 
class BBB extends AAA{
	//**	You must override the abstract method!!!!!
	@Override
	public void speak() {
		// TODO Auto-generated method stubxxxxx
		
	}
	
}

class CCC{
	
}
