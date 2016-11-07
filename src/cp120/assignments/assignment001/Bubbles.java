package cp120.assignments.assignment001;

import edu.uweo.javaintro.tools.Turtle;

public class Bubbles
{
	public static void main(String[] args)
	{
		Turtle  t1 = new Turtle();
		t1.switchTo( Turtle.GREEN );
		t1.move(0, -242); //move to the left edge of the screen minus the radius (760/2 -10 - 128 = 242)
		int r = 128;
		int offset = r + r/2 -1; //move to the right radius times 1.5 minus 1 pixel (overlap by 1 pixel)
		for (int i=0; i<5; i++)
		{
			t1.fillCircle(r);			
			t1.move(0, offset);
			r = r /2;
			offset = r + r/2 -1;
		}
	}
}
