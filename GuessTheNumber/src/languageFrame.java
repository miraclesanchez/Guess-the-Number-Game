import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class languageFrame {
	
	static JRadioButton english, spanish;
	static ButtonGroup bg;
	static JPanel reminders, languages;
	static JFrame languageFrame;
	static JLabel language;
	static JButton cOntinue;
	
	public languageFrame() {
	
	languageFrame=new JFrame(" ? Number Game ?");
	languageFrame.getContentPane().setLayout(null);
	languageFrame.setBounds(0,0,350,300);
	languageFrame.setLocation(600,350);
	languageFrame.getContentPane().setBackground(new Color(245,245,220));
	languageFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	languageFrame.setResizable(false);
	languageFrame.setVisible(true);

	language= new JLabel("Choose Your Language Preference: ");
	language.setBackground(Color.black);
	language.setBounds(50,10,300,150);
	languageFrame.add(language);
	
	english= new JRadioButton("English");
	english.setBounds(60,90,120,50);
	languageFrame.add(english);
	
	spanish= new JRadioButton("Español");
	spanish.setBounds(60,120,120,50);
	languageFrame.add(spanish);
	
	bg=new ButtonGroup();
	bg.add(english);
	bg.add(spanish);
	
	cOntinue= new JButton("Continue");
	cOntinue.setBounds(210,180,90,40);
	languageFrame.add(cOntinue);
	cOntinue.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			if(english.isSelected()) {
				languageFrame.setVisible(false);
				new englishRulesPage();
			}
			else if(spanish.isSelected()) {
				languageFrame.setVisible(false);
				new spanishRulesPage(); 
			}
				}});
	}
	
	public static void main (String[]args) {
		new languageFrame();
	}
}

	


