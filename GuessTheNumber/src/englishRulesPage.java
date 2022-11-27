import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;

public class englishRulesPage{

	JFrame rulesFrame;
	JButton begin,back;
	JTextArea rules;
	JScrollPane scrPane;
	TitledBorder border;
	JPanel rulePanel;
	final JTextArea ruleList;
	
	public englishRulesPage() {
		
		border = new TitledBorder("Rules:");		 
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitlePosition(TitledBorder.TOP);
		
		rulePanel=new JPanel();
		rulePanel.setBorder(border);
		rulePanel.setBounds(50,10,250,160);
		rulePanel.setLayout(new BorderLayout());
		
		rulesFrame=new JFrame(" ? Number Game ?");
		rulesFrame.getContentPane().setLayout(null);
		rulesFrame.setSize(350,300);
		rulesFrame.setLocation(600,350);
		rulesFrame.getContentPane().setBackground(new Color(245,245,220));
		rulesFrame.setResizable(false);
		
		ruleList=new JTextArea(250,160);
		ruleList.setLocation(50, 10);
		ruleList.setLineWrap(true);
		ruleList.setWrapStyleWord(true);
		ruleList.setEditable(false);
		//ruleList.setBounds(50,10,220,150);
		ruleList.setText("Hello! These are the rules for the game sdlfkm onm odjmnf owdm om wopdcm  dokmcasdo sdkfjnvedfjk  dfjs ndjfn d sdfj sdkfdlfkm onm odjmnf owdm om wopdcm  dokmcasdo sdkfjnvedfjk  dfjs ndjfn d sdfj sdkfdlfkm on\n"
				+ "m odjmnf owdm om wopdcm  dokmcasdo sdkfjnvedfjk  dfjs\n"
				+ "cvbvbsdbvvbsbsbsdb\n"
				+ "dfbsvsdb\n"
				+ "sdbfsbsdbsd\n"
				+ "bfsdbsd\n"
				+ "sdfbsdbsdbsd\n"
				+ "bsfdbsdb\n"
				+ "");
		
		scrPane= new JScrollPane(ruleList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        rulePanel.add(scrPane);
		
		begin=new JButton();
		begin= new JButton("Begin");
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
		rulesFrame.setResizable(false);
		rulesFrame.setVisible(true);
		rulesFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}
	

	}


