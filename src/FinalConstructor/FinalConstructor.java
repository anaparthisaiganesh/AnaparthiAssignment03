package FinalConstructor;

public class FinalConstructor
{
    final FinalConstructor(){
        System.out.println("Final Constructor");
    }
	public static final void main(String[] args) {
		FinalConstructor obj1 = new FinalConstructor();
	}
}