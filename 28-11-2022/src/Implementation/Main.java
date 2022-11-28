package Implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackArrayImpl impl = new StackArrayImpl(10);
		impl.pop();
		System.out.println("--------------");
		impl.push(210);
		impl.push(310);
		impl.push(50);
		impl.push(400);
		impl.push(410);
		impl.push(610);
		impl.push(70);
		impl.push(4);
		impl.push(1);
		impl.push(20);
		impl.push(21);
		System.out.println("------------------");
		impl.pop();
		impl.pop();
		impl.pop();
		System.out.println("------------------------");

	}

}
