import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumGuess{
	private final static Random rd=new Random();
	JFrame frame;
	JLabel instruction, answer, hints, winStreak, highScore;
	static JLabel guessCount;
	JLabel highestGuess;
	JLabel lowestGuess;
	JLabel language;
	JTextField text;
	JButton next, enter, reset, back, challenge;
	JPanel reminders;
	int random;
	public static int guess, win_streak, highest_guess, lowest_guess, high_score=0;
	static int guess_count=5;
	
	public NumGuess() {
			random=rd.nextInt(10);
			System.out.println(random);
			
			frame = new JFrame(" ? Number Game ?");
			frame.getContentPane().setLayout(null);
			frame.setBounds(0,0,350,300);
			frame.getContentPane().setBackground(new Color(245,245,220));
			frame.setLocation(600,350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getRootPane().setDefaultButton(enter);
			frame.setResizable(false);
			
//			reminders=new JPanel();
//			frame.add(reminders);
//			reminders.setBounds(205,5,120,50);
//			reminders.setBackground(Color.red);
			
			instruction=new JLabel("Enter a number from 0 to 20");
			instruction.setBounds(70, 70, 200, 67);
			frame.add(instruction);
			instruction.setBackground(Color.black );
					
			text = new JTextField();
			frame.getContentPane().add(text);
			text.setBounds(10, 120, 150, 25);
			
			hints=new JLabel("Good Luck!");
			hints.setBounds(120,160,150,25);
			frame.add(hints);
			hints.setBackground(Color.black);
			
			winStreak=new JLabel("Win Streak: "+win_streak);
			winStreak.setBounds(10,15,250,67);
			frame.add(winStreak);
			winStreak.setBackground(Color.black);
			
			highScore=new JLabel("High Score: "+high_score);
			highScore.setBounds(10,-10,250,67);
			frame.add(highScore);
			highScore.setBackground(Color.black);
			
			guessCount=new JLabel("Guesses Left: "+guess_count);
			guessCount.setBounds(205, 30, 200, 67);
			frame.add(guessCount);
			guessCount.setBackground(Color.black );
		
			
			highestGuess=new JLabel("Highest Guess: "+highest_guess);
			highestGuess.setBounds(230, -25, 250, 67);
			highestGuess.setForeground(Color.black);
//			reminders.add(highestGuess);
			frame.add(highestGuess);
			
			lowestGuess=new JLabel("Lowest Guess: "+lowest_guess);
			lowestGuess.setBounds(230, -10, 250, 67);
//			reminders.add(lowestGuess);
			lowestGuess.setForeground(Color.black);
			frame.add(lowestGuess);
			
			answer=new JLabel();
			answer.setBounds(50,150,350, 70);
			answer.setBackground(Color.black);
			enter = new JButton("Enter");
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
							guessCount.setText("Guesses Left: "+guess_count);
							hints.setText("higher!!");
							lowest_guess=guess;
							lowestGuess.setText("Lowest Guess: "+lowest_guess);
							next.setEnabled(false);
							}
						else if(guess>random)
							{
							guess_count--;
							guessCount.setText("Guesses Left: "+guess_count);
							hints.setText("lower!!");
							highest_guess=guess;
							highestGuess.setText("Highest Guess: "+highest_guess);
							next.setEnabled(false);
							}
						else if(guess==random)
							{
							win_streak++;							
							hints.setText("you win!!");
							winStreak.setText("Win Streak: "+win_streak);
							if(win_streak>high_score) {
							high_score=win_streak;
							}
							enter.setEnabled(false);
							next.setEnabled(true);
							guess_count++;
							guessCount.setText("Guesses Left: "+guess_count);
							}
					}
					else if((guess_count==0)&&(guess!=random)) {
							enter.setEnabled(false);
							hints.setBounds(30,150,350,25);
							hints.setText("Out of Guesses! Press reset to try again!");
							frame.getContentPane().add(answer);
							answer.setText("The correct answer was: "+random);
							next.setEnabled(false);
							reset.setEnabled(true);
						}
					else if((guess_count==0)&&(guess==random)){
							win_streak++;							
							hints.setText("you win!!");
							winStreak.setText("Win Streak: "+win_streak);
							if(win_streak>high_score) {
							high_score=win_streak;
						}
							enter.setEnabled(false);
							next.setEnabled(true);
							guess_count++;
							guessCount.setText("Guesses Left: "+guess_count);
							}
				}
		
				});
				
			next=new JButton("Next");
			frame.getContentPane().add(next);
			next.setBounds(10,200,150,25);
			next.setEnabled(false);
			next.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					random=rd.nextInt(20);
					System.out.println(random);
					text.setText("");
					hints.setText("Good Luck!");
					enter.setEnabled(true);
					next.setEnabled(false);
					highest_guess=0;
					lowest_guess=0;
					highestGuess.setText("Highest Guess: "+highest_guess);
					lowestGuess.setText("Lowest Guess: "+lowest_guess);
				}
			});
			reset=new JButton("Reset");
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
				
					winStreak.setText("Win Streak: "+win_streak);
					guessCount.setText("Guesses Left: "+guess_count);
					highScore.setText("High Score: "+high_score);
					hints.setText("Good Luck!");
					lowestGuess.setText("Lowest Guess: "+lowest_guess);
					highestGuess.setText("Highest Guess: "+highest_guess);
					text.setText("");
					
					System.out.println(random);
					
					
					next.setEnabled(false);
					enter.setEnabled(true);
					reset.setEnabled(false);
				}
			});
			
			challenge= new JButton("Challenge");
			challenge.setBounds(160,240,150,25);
			frame.add(challenge);
			challenge.setVisible(true);
			challenge.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
						new challengeFrame();
					}});
			
			
			back=new JButton("Back");
			frame.getContentPane().add(back);
			back.setBounds(10,240,150,25);
			back.setEnabled(true);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					new englishRulesPage();	
				}
			});
			frame.setVisible(true);
}
	public static void setGuess() {
		guess_count++;
		guessCount.setText("Guesses Left: "+guess_count);
	}
}



//create separate class for the game frame and one for the code 

//add levels; maybe the number range gets larger so instead of up to 100, it becomes 200 but the "lives" don't grow
//maybe every time you win 3 in a row, you get one life added.
//how can i add a image icon to my jframe on mac
//when they lose and run out of lives make a challenge to help them get 3 lives. maybe rock paper scissors or a math problem 

//LOOK UP INHERITANCE VERSUS EXTENDS 

//add an area to let user know what their highest and lowest guess is -- DONE
//reset button--DONE
//win streak -- DONE
//guess count--DONE
//ask for language preference DONE
//add a way to get more "lives" MADE IT SO EVERY TIME THEY WIN THEY GET A LIFE --NEW DONE
//after language preference page, add a page that explains the rules with a begin button that will start the actual game DONE
//add answer once they lose so they know what it was -- NEW DONE
//how can i make this make you think 
//when they lose and run out of lives make a challenge to help them get 3 lives. maybe rock paper scissors or a math problem DONE