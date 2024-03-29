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
		ruleList.setText("La computadora generará un número del 0 al 20 y tendrás 6 oportunidades de acertar.\n"
				+"\n"
				+ "- Si aciertas, se te indicará que presiones siguiente y continúes jugando hasta que te quedes sin conjeturas.\n"
				+ "- Si te quedas sin conjeturas, habrá un desafío que puedes completar para obtener más conjeturas. O puedes optar por reiniciar y empezar de nuevo.\n"
				+ "-También habrá un botón de desafío en el que puedes intentar adivinar más, incluso si no te has quedado sin.\n"
				+ "-A medida que avanza, el rango de números se hará más grande y los desafíos más difíciles, pero no obtendrá más conjeturas.\n"
				+"\t\t\t\t\t ¡¡BUENA SUERTE!!"
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
		back=new JButton("Atrás");
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
