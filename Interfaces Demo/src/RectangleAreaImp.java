import java.util.*;

class RectangleAreaImp {
	public static void main(String[] args ) {
		
		RectangleArea a = new Rect();
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int b = sc.nextInt();
		
	
		a.area(l, b);

	}

}

class Rect implements RectangleArea
{
	@Override
	
	public void area (int l, int b) {
		System.out.println(l*b);
	}
	
}