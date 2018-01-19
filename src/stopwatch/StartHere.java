package stopwatch;

import javax.swing.JOptionPane;

public class StartHere {

	public static void main(String[] args) {
		
		int createOption = 1; // 0 = yes, 1 = no from showConfirmDialog
		String watchName;
		do {
			createOption = JOptionPane.showConfirmDialog(null,
					"Would you like to create a stopwatch?",
					"Stopwatch Creation",
					JOptionPane.YES_NO_OPTION);
			
			//System.out.println("JOP returned: " + createOption);
			
			if (createOption == 0) {
				
				watchName = JOptionPane.showInputDialog(null,
						"Enter a name for your stopwatch");
				Stopwatch watch = new Stopwatch(watchName);
				watch.setLocationByPlatform(true);
				watch.setVisible(true);
			}
		} while (createOption == 0);
		

	}

}
