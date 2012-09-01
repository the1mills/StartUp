package StartUp;

public class StarUp {
	
	public static SplashScreen ssn = null;

	public static void main (String[] args) throws InterruptedException{
		
		Runnable rn = new Runnable(){
		@Override
		public void run() {
			ssn = new SplashScreen();
			ssn.setVisible(true);
			SplashScreen.swpb.setIndeterminate(true);
		}
		};
		rn.run();
		
		Thread.sleep(5000);
		SplashScreen.swpb.setIndeterminate(false);
		
		for(int i = 0; i <= 100; i++){
			Thread.sleep(500);
			SplashScreen.swpb.setValue(i);
		}
		
		ssn.dispose();
	}
}
