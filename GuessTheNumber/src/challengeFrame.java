import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class challengeFrame{
	
	JFrame challengeFrame;
	JPanel challengePanel;
	JLabel challengeLabel;
	JTextArea challenge; 
	TitledBorder border;
	JTextField text;
	JButton check;
	int guess1;
	int random1;
	int random2;
	int answer1;
	private final static Random rd=new Random();
	
	public challengeFrame(){
		random1=rd.nextInt(10);
		random2=rd.nextInt(10);
		System.out.println(random1+","+random2);
		answer1=random1*random2;
		
		border = new TitledBorder("Challenge:");		 
		border.setTitleJustification(TitledBorder.CENTER);
		border.setTitlePosition(TitledBorder.TOP);
		
		challengeFrame = new JFrame(" ? Number Game ?");
		challengeFrame.getContentPane().setLayout(null);
		challengeFrame.setBounds(0,0,350,300);
		challengeFrame.getContentPane().setBackground(new Color(245,245,220));
		challengeFrame.setLocation(600,350);
		challengeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		challengeFrame.setResizable(false);
		
		challengePanel=new JPanel();
		challengePanel.setBorder(border);
		challengePanel.setBounds(50,10,250,160);
		
		challengeLabel=new JLabel();
		challengeLabel.setText(random1+"*"+random2);
		challengeLabel.setBounds(0,0,20,20);
		challengePanel.add(challengeLabel);
		
		text = new JTextField(10);
		challengePanel.add(text);
		
		check=new JButton("Check");
		challengePanel.add(check);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				guess1=Integer.parseInt(text.getText());
				if(guess1==answer1) {
					challengeFrame.setVisible(false);
					NumGuess.setGuess();
				}
			}
	});
		challengeFrame.getContentPane().add(challengePanel);
		challengeFrame.setVisible(true);
	}
}

//
//if answer is right then go back to the game and add a guess
//figure out how to go back to the same game being played. keep the win streak and high score (maybe make it a panel instead of it's own frame)
//display a message saying "correct! you've earned an extra guess!" and THEN go back to the game