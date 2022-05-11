package my_java;
/*2.Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.*/

public class Rectangle {

	public static void main(String[] args) {
		class Rect{
		    int length;
		    int breadth;

		    public Rect()
		    {
		        int length = 0;
		        int breadth = 0;

		    }

		    public Rect(int lenght)
		    {//this(5,8);
		        this.length = 4 ;
		         breadth = 5;

		    }
		    public Rect(int length,int breadth)
		    {
		        this.length = 7;
		        this.breadth = 8;
		    }
		    public void  R1()
		    {
		        System.out.println(length*breadth);
		    }
		}
		class Recatangle8 {
		    public static void main(String[] args) {
		        Rect obj = new Rect();
		        obj.R1();
		       Rect obj1= new Rect(10);
		        obj1.R1();
		       Rect obj2 = new Rect(12,2);
		        obj2.R1();


		    }
	}

}
