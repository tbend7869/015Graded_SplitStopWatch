package stopwatch;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Stopwatch  extends JFrame {
	
	long startTime;
	long stopTime;
	double elapsedTime;
	boolean timeStarted = false;
	String runner1 = "A";
	String runner2 = "B";
	String runner3 = "C";
	String runner4 = "D";
	String runner5 = "E";
	String runner6 = "F";
	String runner7 = "G";

	
	JButton startButton = new JButton();
	JLabel startLabel = new JLabel();
	JTextField startTextField = new JTextField();
	
	JButton stop1Button = new JButton();
	JButton stop2Button = new JButton();
	JButton stop3Button = new JButton();
	JButton stop4Button = new JButton();
	JButton stop5Button = new JButton();
	JButton stop6Button = new JButton();
	JButton stop7Button = new JButton();
	
	JLabel stop1Label = new JLabel();
	JTextField stop1TextField = new JTextField();
	JLabel stop2Label = new JLabel();
	JTextField stop2TextField = new JTextField();
	JLabel stop3Label = new JLabel();
	JTextField stop3TextField = new JTextField();
	JLabel stop4Label = new JLabel();
	JTextField stop4TextField = new JTextField();
	JLabel stop5Label = new JLabel();
	JTextField stop5TextField = new JTextField();
	JLabel stop6Label = new JLabel();
	JTextField stop6TextField = new JTextField();
	JLabel stop7Label = new JLabel();
	JTextField stop7TextField = new JTextField();
	
	JButton exitButton = new JButton();
	
	JLabel elapsed1Label = new JLabel();
	JTextField elapsed1TextField = new JTextField();
	JLabel elapsed2Label = new JLabel();
	JTextField elapsed2TextField = new JTextField();
	JLabel elapsed3Label = new JLabel();
	JTextField elapsed3TextField = new JTextField();
	JLabel elapsed4Label = new JLabel();
	JTextField elapsed4TextField = new JTextField();
	JLabel elapsed5Label = new JLabel();
	JTextField elapsed5TextField = new JTextField();
	JLabel elapsed6Label = new JLabel();
	JTextField elapsed6TextField = new JTextField();
	JLabel elapsed7Label = new JLabel();
	JTextField elapsed7TextField = new JTextField();
	
	public Stopwatch(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i=0; i<7; i++) {
			
			if(i ==0) {
				runner1 = JOptionPane.showInputDialog("Enter runner"  + (i+1) + " name:");
			} else if (i == 1) {
				runner2 = JOptionPane.showInputDialog("Enter runner" + (i+1) + "name:");
			} else if (i == 2) {
				runner3 = JOptionPane.showInputDialog("Enter runner" + (i+1) + "name:");
			} else if (i == 3) {
				runner4 = JOptionPane.showInputDialog("Enter runner" + (i+1) + "name:");
			} else if (i == 4) {
				runner5 = JOptionPane.showInputDialog("Enter runner" + (i+1) + "name:");
			} else if (i == 5) {
				runner6 = JOptionPane.showInputDialog("Enter runner" + (i+1) + "name:");
			} else if (i == 6) {
				runner7 = JOptionPane.showInputDialog("Enter runner" + (i+1) + "name:");
		}
		}
		
		// Create and set up the content pane.
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		// Create and set up the components
		startButton.setText("Start Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		getContentPane().add(startButton, gridConstraints);
		
		// Add an Action Listener to detect and respond to clicks
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startButtonActionPerformed(e);
			}
			
		});
		stop1Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 1;
		getContentPane().add(stop1Button, gridConstraints);
		
		stop1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop1ButtonActionPerformed(e);
			}
		});
		stop2Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 2;
		getContentPane().add(stop2Button, gridConstraints);
			
		stop2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop2ButtonActionPerformed(e);
			}
		});
		
		stop3Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 3;
		getContentPane().add(stop3Button, gridConstraints);
		
		stop3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop3ButtonActionPerformed(e);
			}
		});
		stop4Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 4;
		getContentPane().add(stop4Button, gridConstraints);
			
		stop4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop4ButtonActionPerformed(e);
			}
		});
		
		stop5Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 5;
		getContentPane().add(stop5Button, gridConstraints);
		
		stop5Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop5ButtonActionPerformed(e);
			}
		});
		stop6Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 6;
		getContentPane().add(stop6Button, gridConstraints);
			
		stop6Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop6ButtonActionPerformed(e);
			}
		});
		stop7Button.setText("Stop Timing");
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 7;
		getContentPane().add(stop7Button, gridConstraints);
			
		stop7Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stop7ButtonActionPerformed(e);
			}
		});
		
		
		exitButton.setText("Close ALL Watches");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 8;
		getContentPane().add(exitButton, gridConstraints);
		
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exitButtonActionPerformed(e);
			}
			
		});
		
		
		startLabel.setText("Start System Time");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		getContentPane().add(startLabel, gridConstraints);
		
		startTextField.setText("");
		startTextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		getContentPane().add(startTextField, gridConstraints);
		
		
		stop1Label.setText(runner1);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		getContentPane().add(stop1Label, gridConstraints);
		
		stop1TextField.setText("");
		stop1TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		getContentPane().add(stop1TextField, gridConstraints);
		
		stop2Label.setText(runner2);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		getContentPane().add(stop2Label, gridConstraints);
		
		stop2TextField.setText("");
		stop2TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 2;
		getContentPane().add(stop2TextField, gridConstraints);
		
		stop3Label.setText(runner3);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		getContentPane().add(stop3Label, gridConstraints);
		
		stop3TextField.setText("");
		stop3TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 3;
		getContentPane().add(stop3TextField, gridConstraints);
		
		stop4Label.setText(runner4);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		getContentPane().add(stop4Label, gridConstraints);
		
		stop4TextField.setText("");
		stop4TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 4;
		getContentPane().add(stop4TextField, gridConstraints);
		
		stop5Label.setText(runner5);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		getContentPane().add(stop5Label, gridConstraints);
		
		stop5TextField.setText("");
		stop5TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 5;
		getContentPane().add(stop5TextField, gridConstraints);
		
		stop6Label.setText(runner6);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 6;
		getContentPane().add(stop6Label, gridConstraints);
		
		stop6TextField.setText("");
		stop6TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 6;
		getContentPane().add(stop6TextField, gridConstraints);
		
		stop7Label.setText(runner7);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 7;
		getContentPane().add(stop7Label, gridConstraints);
		
		stop7TextField.setText("");
		stop7TextField.setColumns(20);
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 7;
		getContentPane().add(stop7TextField, gridConstraints);
		
		
		elapsed1Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 1;
		getContentPane().add(elapsed1Label, gridConstraints);
		
		elapsed1TextField.setText("");
		elapsed1TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 1;
		getContentPane().add(elapsed1TextField, gridConstraints);
		
		
		elapsed2Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 2;
		getContentPane().add(elapsed2Label, gridConstraints);
		
		elapsed2TextField.setText("");
		elapsed2TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 2;
		getContentPane().add(elapsed2TextField, gridConstraints);
		
		elapsed3Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 3;
		getContentPane().add(elapsed3Label, gridConstraints);
		
		elapsed3TextField.setText("");
		elapsed3TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 3;
		getContentPane().add(elapsed3TextField, gridConstraints);
		
		
		elapsed4Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 4;
		getContentPane().add(elapsed4Label, gridConstraints);
		
		elapsed4TextField.setText("");
		elapsed4TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 4;
		getContentPane().add(elapsed4TextField, gridConstraints);
		
		elapsed5Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 5;
		getContentPane().add(elapsed5Label, gridConstraints);
		
		elapsed5TextField.setText("");
		elapsed5TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 5;
		getContentPane().add(elapsed5TextField, gridConstraints);
		
		
		elapsed6Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 6;
		getContentPane().add(elapsed6Label, gridConstraints);
		
		elapsed6TextField.setText("");
		elapsed6TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 6;
		getContentPane().add(elapsed6TextField, gridConstraints);
		
		elapsed7Label.setText("Elapsed Time Seconds");
		gridConstraints.gridx = 3;
		gridConstraints.gridy = 7;
		getContentPane().add(elapsed7Label, gridConstraints);
		
		elapsed7TextField.setText("");
		elapsed7TextField.setColumns(20);
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 7;
		getContentPane().add(elapsed7TextField, gridConstraints);
		
		// Make the window visible, and set the size to either a fixed size, or
		// have it packed tight
		setLocationRelativeTo(null);
		// setSize(500, 500);
		pack();
		// setVisible(true);

		
	} // end of constructor


	private void startButtonActionPerformed(ActionEvent e) {
		startTime = System.currentTimeMillis();
		
		Date startDate = new Date();
		startTextField.setText(startDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		stop1TextField.setText("");
		stop2TextField.setText("");
		elapsed1TextField.setText("");
		elapsed2TextField.setText("");
		timeStarted = true;
		
	}

	protected void stop1ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop1TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed1TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	protected void stop2ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop2TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed2TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	protected void stop3ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop3TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed3TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	protected void stop4ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop4TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed4TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	protected void stop5ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop5TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed5TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	protected void stop6ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop6TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed6TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	protected void stop7ButtonActionPerformed(ActionEvent e) {
		if(timeStarted) {
		stopTime = System.currentTimeMillis();
		Date stopDate = new Date();
		stop7TextField.setText(stopDate.toString());
		// startTextField.setText(String.valueOf(startTime));
		elapsedTime = (stopTime - startTime) / 1000.0;
		elapsed7TextField.setText(String.valueOf(elapsedTime));
		} else {
			return;
		}
		
	}
	
	
	
	protected void exitButtonActionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

} // end of class


