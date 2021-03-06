import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	
	Scanner scan = new Scanner(System.in);
	
	private double first_side;
	private double second_side;
	private double third_side;
	
	public Triangle() {
		this.first_side = 0;
		this.second_side = 0;
		this.third_side = 0;
	}
	
	public Triangle(int first, int second, int third) {
		this.first_side = first;
		this.second_side = second;
		this.third_side = third;
	}
	
//	// Setters
//	public void set_first_side(int side) {
//		this.first_side = side;
//	}
//	public void set_second_side(int side) {
//		this.second_side = side;
//	}
//	public void set_third_side(int side) {
//		this.third_side = side;
//	}
//
//	// Getters
//	public double get_first_side() {
//		return this.first_side;
//	}
//	public double get_second_side() {
//		return this.second_side;
//	}
//	public double get_third_side() {
//		return this.third_side;
//	}
	
	public void side_arrange() {
		
		double myArr[] = {this.first_side, this.second_side, this.third_side};
		Arrays.parallelSort(myArr);
		for(double i : myArr) {
			System.out.println(i);
		}
	}
	
	// Check if possible to create triangle with given parameters
	public boolean if_triangle() {
		if((this.first_side < (this.third_side + this.second_side)) && 
				(this.second_side < (this.first_side + this.third_side)) &&
				(this.third_side < (this.first_side + this.second_side))) {
			return true;
		} else {
			System.out.println("Can't make triangle with prompted parameters");
			return false;
		}
	}
	
	// Perimeter
	public double perimeter(boolean bool) {
		return (double) (this.first_side + this.second_side + this.third_side)/2;
	}
	
	// Area
	public double area(boolean bool) {
		return Math.sqrt(this.perimeter(this.if_triangle()) * 
				(this.perimeter(this.if_triangle()) - this.first_side) * 
				(this.perimeter(this.if_triangle()) - this.second_side) *
				(this.perimeter(this.if_triangle()) - this.third_side)
				);
	}
	
	// Right Triangle
	public void rightTriangle() {
		if((Math.pow(this.first_side, 2)) == (Math.pow(this.second_side, 2) + Math.pow(this.third_side, 2)) ||
				(Math.pow(this.second_side, 2)) == (Math.pow(this.first_side, 2) + Math.pow(this.third_side, 2)) ||
				(Math.pow(this.third_side, 2)) == (Math.pow(this.first_side, 2) + Math.pow(this.second_side, 2))){
					System.out.println("The triangle is the Right Triangle");
				}
	}
	
	// Obtuse
	public void obtuse() {
		int myPow = 2;
		if(Math.pow(this.first_side, myPow) + Math.pow(this.second_side, myPow) < Math.pow(this.third_side, myPow) ||
				Math.pow(this.second_side, myPow) + Math.pow(this.third_side, myPow) < Math.pow(this.first_side, myPow) ||
				Math.pow(this.first_side, myPow) + Math.pow(this.third_side, myPow) < Math.pow(this.second_side, myPow)){
			System.out.println("Yes it is obtuse!");
		} else{
			System.out.println("Nope, it isn't!");
		}
	}
	
	public static void main(String[] args) {
		Triangle first_triangle = new Triangle(7, 7, 4);
		Triangle second_triangle = new Triangle(2, 3, 4);

		System.out.println("The first triangle:");
		first_triangle.side_arrange();
		first_triangle.rightTriangle();

		if(first_triangle.if_triangle()) {
			System.out.println("Perimeter: "+first_triangle.perimeter(first_triangle.if_triangle()));
			System.out.println("Area: "+first_triangle.area(first_triangle.if_triangle()));
			System.out.println("Is the triangle obtuse?");
			first_triangle.obtuse();
		}

		System.out.println("\nThe second triangle:");
		second_triangle.side_arrange();
		second_triangle.rightTriangle();

		if(second_triangle.if_triangle()) {
			System.out.println("Perimeter: "+second_triangle.perimeter(second_triangle.if_triangle()));
			System.out.println("Area: "+second_triangle.area(second_triangle.if_triangle()));
			System.out.println("Is the triangle obtuse?");
			second_triangle.obtuse();
		}
	}
}
