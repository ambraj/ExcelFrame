import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class MainFrame extends Frame
{
	final int MAXBTN = 2;
	TextField arrTxt;
	Button [] objBtn = new Button[MAXBTN];
	public MainFrame()
	{
		setBounds(0, 0, 700, 514);
		setTitle("Excel Sheet");
		setLayout(null);
		setVisible(true);
		
		/*String [] btnStr = {"Pie Chart", "Bar Graph"};
		Button [] btnA
		
		btnArr[iTmp] = new Button()*/
		
		arrTxt = new TextField();
		arrTxt.setBounds(0, 30, 60, 30);
		add(arrTxt);
		arrTxt.setBackground(Color.lightGray);
		
		/*String [] objStr = {"BarChart" , "PieChart"};
		for(int iTmp = 0 ; iTmp < MAXBTN ; iTmp++)
		{
			objBtn[iTmp] = new Button(objStr[iTmp]);
			objStr[iTmp].
		}*/
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		
		
		addMouseListener(new MouseHandler());
	}
	
	@Override
	public void paint(Graphics grp)
	{		
		for(int iTmp = 0, xStart = 0, yStart = 60, xEnd = 600, yEnd = 60; iTmp < 16; iTmp++, yStart += 30,yEnd +=30)
		{
			grp.drawLine(xStart, yStart, xEnd, yEnd);
		}

		for(int iTmp = 0, xStart = 60, yStart = 0, xEnd = 60, yEnd = 510; iTmp < 10; iTmp++, xStart += 60,xEnd += 60)
		{
			grp.drawLine(xStart, yStart, xEnd, yEnd);
		}
	}
	
}






































