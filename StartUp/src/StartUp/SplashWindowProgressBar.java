package StartUp;

import java.awt.Dimension;

import javax.swing.BoundedRangeModel;
import javax.swing.JProgressBar;

public class SplashWindowProgressBar extends JProgressBar {

	public SplashWindowProgressBar() {
	
		this.setIndeterminate(true);
		this.setOpaque(true);
		this.setVisible(true);
		this.setEnabled(true);
		this.setBorderPainted(true);
		this.setSize(500, 300);
		this.setPreferredSize(new Dimension(350,30));
	}

	public SplashWindowProgressBar(int arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SplashWindowProgressBar(BoundedRangeModel arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public SplashWindowProgressBar(int arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public SplashWindowProgressBar(int arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}

}
