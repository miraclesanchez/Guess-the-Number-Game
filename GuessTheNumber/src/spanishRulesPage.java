import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class spanishRulesPage{

	JFrame rulesFrame;
	JButton begin, back;
	JTextArea rules;
	JScrollPane scrPane;
	TitledBorder border;
	JPanel rulePanel;
	final JTextArea ruleList;
	
	public spanishRulesPage() {
		
		
		rulesFrame=new JFrame(" ? Number Game ?");
		rulesFrame.getContentPane().setLayout(null);
		rulesFrame.setBounds(0,0,350,300);
		rulesFrame.setLocation(600,350);
		rulesFrame.getContentPane().setBackground(new Color(245,245,220));
		rulesFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		rulesFrame.setResizable(false);
		
		rulePanel=new JPanel();
		rulePanel.setBorder(border);
		rulePanel.setBounds(50,10,250,160);
		rulePanel.setLayout(new BorderLayout());
		
		ruleList=new JTextArea(250,160);
		ruleList.setLocation(50, 10);
		ruleList.setLineWrap(true);
		ruleList.setWrapStyleWord(true);
		ruleList.setEditable(false);
		ruleList.setText("The computer will generate a number from 0 to 20 and you will have 6 chances to guess right.\n"
				+ "- If you guess right, you will be pormted to hit next and continue playing until you run out of guesses"
				+ "- If you run out of guesses, there will be a challenge you can complete for more guesses. Or you can choose to reset and start over.\n"
				+ "-There will also be a challenge button where you can try for more guesses even if you haven't run out."
				+ "As you go on, the number range will get larger and the challenges will get harder, but you will not get more guesses.\n"
				+ "");
		
		scrPane= new JScrollPane(ruleList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        rulePanel.add(scrPane);
		
		begin= new JButton("Comenzar");
		begin.setBounds(210,180,90,40);
		rulesFrame.add(begin);
		begin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
					rulesFrame.setVisible(false);
					new NumGuess();
				}});
		back=new JButton("Back");
		rulesFrame.getContentPane().add(back);
		back.setBounds(10,240,150,25);
		back.setEnabled(true);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rulesFrame.setVisible(false);
				new languageFrame();
				
			}
		});
		rulesFrame.getContentPane().add(begin);
		rulesFrame.getContentPane().add(rulePanel);
		rulesFrame.setVisible(true);
		rulesFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}
	

	}
