package HackerEarth;

public class ComplexNumberAddition {

	int real;
	int image;
	
	public ComplexNumberAddition(int r, int i) {
		this.real = r;
		this.image = i;
	}
	public void show() {
		System.out.println(this.real+" +i"+this.image);
	}
	public static ComplexNumberAddition add(ComplexNumberAddition n1,ComplexNumberAddition n2) {
		
		ComplexNumberAddition res = new ComplexNumberAddition(0,0);
		res.real=n1.real+n2.real;
		res.image=n1.image+n2.image;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ComplexNumberAddition c1= new ComplexNumberAddition(4,5);
		ComplexNumberAddition c2 = new ComplexNumberAddition(8,10);
		System.out.print("first Complex number: ");
        c1.show();
         
        System.out.print("\nSecond Complex number: ");
        c2.show();
 
        // calling add() to perform addition
        ComplexNumberAddition res = add(c1, c2);
 
        // displaying addition
        System.out.println("\nAddition is :");
        res.show();
	}

}
