
public class ChildClass extends ParentClass{
	
	public void add() {
		System.out.println("adding number of child class");
	}
	
	public void subtract() {
		System.out.println("Subtracting number of child class");
	}
	
	public void Multiply() {
		System.out.println("multiply number of child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p = new ChildClass();
		ChildClass c = (ChildClass) p;
		p.add();
		p.divide();
		c.Multiply();

	}

}
