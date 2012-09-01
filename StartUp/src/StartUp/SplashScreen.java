package StartUp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.Border;

public class SplashScreen extends JWindow{
	
	JPanel panel,centerPanel,westPanel,eastPanel,southPanel,northPanel;
	static SplashWindowProgressBar swpb;
	
	public SplashScreen(){
		
		this.setSize(400, 250);
		this.getContentPane().add(panel = new JPanel());
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.pink.darker());
		Border brdr = BorderFactory.createLineBorder(Color.gray);
		panel.setBorder(brdr);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dm = tk.getScreenSize();
		this.setLocation((int)(dm.getWidth()/2 - this.getWidth()/2), (int)(dm.getHeight()/2 - this.getHeight()/2));
	
		panel.add(centerPanel = new JPanel(), BorderLayout.CENTER);
		panel.add(northPanel = new JPanel(), BorderLayout.NORTH);
		panel.add(southPanel = new JPanel(), BorderLayout.SOUTH);
		panel.add(westPanel = new JPanel(), BorderLayout.WEST);
		
		centerPanel.setBackground(Color.pink.darker());
		southPanel.setSize(this.getWidth(), 150);
		//southPanel.setLayout(new BorderLayout());
		southPanel.add(swpb = new SplashWindowProgressBar());
		
		
	
	}
}
