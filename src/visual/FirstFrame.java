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
		FirstFrame f = new FirstFrame("��һ��Frame");
		Panel p = new Panel();
		f.setSize(800,460);
		f.setBackground(Color.ORANGE);
		f.setVisible(true);
		f.setLayout(null);
		p.setSize(300, 460);
		p.setBackground(Color.GRAY);
		
		//f.setLayout(new BorderLayout());
		f.setLayout(new GridLayout());
		Button b1 = new Button("����");
		Button b2 = new Button("ȷ��");
		Button b3 = new Button("�˳�");
		f.add(BorderLayout.NORTH,b1);
		//f.add(BorderLayout.SOUTH,b2);
		//f.add(BorderLayout.WEST,b3);
		//f.add(BorderLayout.CENTER,p);
		
		//f.setLayout(new FlowLayout(FlowLayout.CENTER));
		//f.setLayout(null);
		
		//�˵�-----------------------
		MenuBar mb =new MenuBar();
		f.setMenuBar(mb);
		Menu m1 = new Menu("File");
		Menu m2 =new Menu("Edit");
		Menu m3 = new Menu("help");
		mb.add(m1);
		mb.add(m2);
		mb.setHelpMenu(m3);
		//-----------------------------
		
		f.addWindowListener(f. new Mywindowadapter());
		//f.pack();  //��������
	}
	class Mywindowadapter extends WindowAdapter {
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	}
}

  

