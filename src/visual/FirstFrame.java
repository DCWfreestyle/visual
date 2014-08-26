package visual;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstFrame extends Frame {

	public FirstFrame(String string){
		super(string);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstFrame f = new FirstFrame("第一个Frame");
		Panel p = new Panel();
		f.setSize(800,460);
		f.setBackground(Color.ORANGE);
		f.setVisible(true);
		f.setLayout(null);
		p.setSize(300, 460);
		p.setBackground(Color.GRAY);
		
		//f.setLayout(new BorderLayout());
		f.setLayout(new GridLayout());
		Button b1 = new Button("继续");
		Button b2 = new Button("确定");
		Button b3 = new Button("退出");
		f.add(BorderLayout.NORTH,b1);
		f.add(BorderLayout.SOUTH,b2);
		f.add(BorderLayout.WEST,b3);
		f.add(BorderLayout.CENTER,p);
		
		//f.setLayout(new FlowLayout(FlowLayout.CENTER));
		//f.setLayout(null);
		
		f.addWindowListener(f. new Mywindowadapter());
		//f.pack();  //紧凑排列
	}
	class Mywindowadapter extends WindowAdapter {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
}

  

