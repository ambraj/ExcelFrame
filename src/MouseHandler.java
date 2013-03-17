import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseHandler extends MouseAdapter 
{
	Point start;
	int xPos, yPos;
	
	@Override
	public void mousePressed(MouseEvent me)
	{
		MainFrame frm = (MainFrame)me.getSource();
		Graphics grp = frm.getGraphics();
		start =  me.getPoint();
		
		xPos = (start.x / 60) * 60;
		yPos = (start.y / 30) * 30;
					
		System.out.print(start.x);
		System.out.print(start.y);
		
		frm.arrTxt.setBounds(xPos, yPos, 60 , 30);
	}

}
