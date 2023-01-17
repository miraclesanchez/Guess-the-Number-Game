import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SpanishNumGuess{
	private final static Random rd=new Random();
	JFrame frame;
	JLabel instruction, answer, hints, winStreak, highScore, guessCount, highestGuess, lowestGuess, language;
	JTextField text;
	JButton next, enter, reset, back;
	JPanel reminders;
	int random;
	int guess, win_streak, highest_guess, lowest_guess, high_score=0;
	int guess_count=5;

	public SpanishNumGuess() {
			random=rd.nextInt(20);
			System.out.println(random);
			
			frame = new JFrame(" ? Number Game ?");
			frame.getContentPane().setLayout(null);
			frame.setBounds(0,0,350,300);
			frame.getContentPane().setBackground(new Color(245,245,220));
			frame.setLocation(600,350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getRootPane().setDefaultButton(enter);
			frame.setResizable(false);
			
			reminders=new JPanel();
			frame.add(reminders);
			reminders.setBounds(205,5,120,50);
			reminders.setBackground(Color.red);
			
			instruction=new JLabel("Introduce un número del 0 al 20");
			instruction.setBounds(70, 70, 260, 67);
			frame.add(instruction);
			instruction.setBackground(Color.black );
					
			text = new JTextField();
			frame.getContentPane().add(text);
			text.setBounds(10, 120, 150, 25);
			
			hints=new JLabel("Buena Suerte!");
			hints.setBounds(120,160,150,25);
			frame.add(hints);
			hints.setBackground(Color.black);
			
			winStreak=new JLabel("Buena Racha: "+win_streak);
			winStreak.setBounds(10,15,250,67);
			frame.add(winStreak);
			winStreak.setBackground(Color.black);
			
			highScore=new JLabel("Puntuación más alta: "+high_score);
			highScore.setBounds(10,-10,250,67);
			frame.add(highScore);
			highScore.setBackground(Color.black);
			
			guessCount=new JLabel("Conjeturas que quedan: "+guess_count);
			guessCount.setBounds(205, 30, 200, 67);
			frame.add(guessCount);
			guessCount.setBackground(Color.black );
			
			highestGuess=new JLabel("Suposición más alta: "+highest_guess);
			highestGuess.setBounds(230, -25, 250, 67);
			highestGuess.setForeground(Color.white);
			reminders.add(highestGuess);
			
			lowestGuess=new JLabel("Suposición más baja: "+lowest_guess);
			lowestGuess.setBounds(230, -10, 250, 67);
			reminders.add(lowestGuess);
			lowestGuess.setForeground(Color.white);
			
			answer=new JLabel();
			answer.setBounds(50,150,350, 70);
			answer.setBackground(Color.black);
			
			enter = new JButton("Ingresar");
			frame.getContentPane().add(enter);
			enter.setBounds(160, 120, 150, 25);
			enter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					next.setEnabled(false);
					guess = Integer.parseInt(text.getText());
					if(guess_count>0) {
						if(guess<random)
							{
							guess_count--;
							guessCount.setText("Conjeturas que quedan: "+guess_count);
							hints.setText("mas alto!!");
							lowest_guess=guess;
							lowestGuess.setText("Suposición más baja: "+lowest_guess);
							next.setEnabled(false);
							}
						else if(guess>random)
							{
							guess_count--;
							guessCount.setText("Conjeturas que quedan: "+guess_count);
							hints.setText("mas bajito!!");
							highest_guess=guess;
							highestGuess.setText("Suposición más alta: "+highest_guess);
							next.setEnabled(false);
							}
						else if(guess==random)
							{
							win_streak++;							
							hints.setText("ganaste!!");
							winStreak.setText("Racha: "+win_streak);
							if(win_streak>high_score) {
							high_score=win_streak;
							}
							enter.setEnabled(false);
							next.setEnabled(true);
							guess_count++;
							guessCount.setText("Conjeturas que quedan: "+guess_count);
							}
					}
					else if((guess_count==0)&&(guess!=random)) {
							enter.setEnabled(false);
							hints.setBounds(30,150,350,25);
							hints.setText("Fuera de conjeturas! ¡Presiona reset para intentarlo de nuevo!");
							frame.getContentPane().add(answer);
							answer.setText("La respuesta correcta fue: "+random);
							next.setEnabled(false);
							reset.setEnabled(true);
						}
					else if((guess_count==0)&&(guess==random)){
							win_streak++;							
							hints.setText("ganaste!!");
							winStreak.setText("Racha: "+win_streak);
							if(win_streak>high_score) {
							high_score=win_streak;
						}
							enter.setEnabled(false);
							next.setEnabled(true);
							guess_count++;
							guessCount.setText("Conjeturas que quedan: "+guess_count);
							}
				}
		
				});
				
			next=new JButton("Siguiente");
			frame.getContentPane().add(next);
			next.setBounds(10,200,150,25);
			next.setEnabled(false);
			next.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					random=rd.nextInt(20);
					System.out.println(random);
					text.setText("");
					hints.setText("Bunea Suerte!");
					enter.setEnabled(true);
					next.setEnabled(false);
					highest_guess=0;
					lowest_guess=0;
					highestGuess.setText("Suposición más alta: : "+highest_guess);
					lowestGuess.setText("Suposición más baja: "+lowest_guess);
				}
			});
			reset=new JButton("Reiniciar");
			frame.getContentPane().add(reset);
			reset.setBounds(160,200,150,25);
			reset.setEnabled(false);
			reset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					guess_count=5;
					win_streak=0;
					highest_guess=0;
					lowest_guess=0;
					random=rd.nextInt(20);
					System.out.println(random);
					
					frame.remove(answer);
					
					hints.setBounds(120,160,150,25);
				
					winStreak.setText("Racha: "+win_streak);
					guessCount.setText("Adivinanzas Restantes: "+guess_count);
					highScore.setText("Puntuación más alta: "+high_score);
					hints.setText("Buena Suerte!");
					lowestGuess.setText("Suposición más baja:  "+lowest_guess);
					highestGuess.setText("Suposición más alta: "+highest_guess);
					text.setText("");
					
					System.out.println(random);
					
					
					next.setEnabled(false);
					enter.setEnabled(true);
					reset.setEnabled(false);
				}
			});
			
			back=new JButton("Atrás");
			frame.getContentPane().add(back);
			back.setBounds(10,240,150,25);
			back.setEnabled(true);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					new spanishRulesPage();
					
				}
			});
			frame.setVisible(true);

}
}