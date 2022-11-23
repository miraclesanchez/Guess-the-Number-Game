import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class NumGuess{
	private final static Random rd=new Random();
	static JFrame frame;
	static JLabel instruction;
	static JLabel answer;
	static JLabel winStreak;
	static JLabel highScore;
	static JLabel guessCount;
	static JLabel highestGuess;
	static JLabel lowestGuess;
	static JTextField text;
	static JButton next;
	static JButton enter;
	static JButton reset;
	static int random;
	static int guess = 0;
	static int guess_count=5;
	static int win_streak=0;
	static int highest_guess=0;
	static int lowest_guess=0;
	static int high_score=0;
	
	public static void main(String[] args) {
			random=rd.nextInt(100);
			System.out.println(random);
			
			frame = new JFrame(" ? Number Game ?");
			//JPanel panel=new JPanel();
			frame.getContentPane().setLayout(null);
			frame.setBounds(0,0,350,300);
			frame.getContentPane().setBackground(Color.cyan);
			frame.setLocation(600,350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			instruction=new JLabel("Enter a number from 1 to 100");
			instruction.setBounds(70, 70, 200, 67);
			frame.add(instruction);
			instruction.setBackground(Color.black );
					
			text = new JTextField();
			frame.getContentPane().add(text);
			text.setBounds(10, 120, 150, 25);
			
			answer=new JLabel("Good Luck!");
			answer.setBounds(120,160,150,25);
			frame.add(answer);
			answer.setBackground(Color.black);
			
			winStreak=new JLabel("Win Streak: "+win_streak);
			winStreak.setBounds(10,30,250,67);
			frame.add(winStreak);
			winStreak.setBackground(Color.black);
			
			highScore=new JLabel("High Score: "+high_score);
			highScore.setBounds(10,-10,250,67);
			frame.add(highScore);
			highScore.setBackground(Color.black);
			
			guessCount=new JLabel("Guesses Left: "+guess_count);
			guessCount.setBounds(230, 30, 200, 67);
			frame.add(guessCount);
			guessCount.setBackground(Color.black );
			
			highestGuess=new JLabel("Highest Guess: "+highest_guess);
			highestGuess.setBounds(230, -25, 250, 67);
			frame.add(highestGuess);
			highestGuess.setBackground(Color.black );
			
			lowestGuess=new JLabel("Lowest Guess: "+lowest_guess);
			lowestGuess.setBounds(230, -10, 250, 67);
			frame.add(lowestGuess);
			lowestGuess.setBackground(Color.black );
			
			enter = new JButton("Enter");
			frame.getContentPane().add(enter);
			enter.setBounds(160, 120, 150, 25);
			enter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					guess = Integer.parseInt(text.getText());
					if(guess_count>0) {
						if(guess<random)
							{
							guess_count--;
							guessCount.setText("Guesses Left: "+guess_count);
							answer.setText("higher!!");
							lowest_guess=guess;
							lowestGuess.setText("Lowest Guess: "+lowest_guess);
							next.setEnabled(false);
							}
						else if(guess>random)
							{
							guess_count--;
							guessCount.setText("Guesses Left: "+guess_count);
							answer.setText("lower!!");
							highest_guess=guess;
							highestGuess.setText("Highest Guess: "+highest_guess);
							next.setEnabled(false);
							}
						else if(guess==random)
							{
							win_streak++;
							answer.setText("you win!!");
							winStreak.setText("Win Streak: "+win_streak);
							if(win_streak>high_score) {
							high_score=win_streak;
							}
							enter.setEnabled(false);
							next.setEnabled(true);
							}
					}
					else if(guess_count==0) {
							enter.setEnabled(false);
							answer.setBounds(30,160,350,25);
							answer.setText("Out of Guesses! Press reset to try again!");
							next.setEnabled(false);
							reset.setEnabled(true);
						}
				}
					
				});
			next=new JButton("Next");
			frame.getContentPane().add(next);
			next.setBounds(10,200,150,25);
			next.setEnabled(false);
			next.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					random=rd.nextInt(100);
					System.out.println(random);
					text.setText("");
					answer.setText("Good Luck!");
					enter.setEnabled(true);
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
					random=rd.nextInt(100);
					System.out.println(random);
					
					answer.setBounds(120,160,150,25);
				
					winStreak.setText("Win Streak: "+win_streak);
					guessCount.setText("Guesses Left: "+guess_count);
					highScore.setText("High Score: "+high_score);
					answer.setText("Good Luck!");
					lowestGuess.setText("Lowest Guess: "+lowest_guess);
					highestGuess.setText("Highest Guess: "+highest_guess);
					text.setText("");
					
					System.out.println(random);
					
					
					next.setEnabled(false);
					enter.setEnabled(true);
				}
			});
			frame.setVisible(true);
	}

}
//create separate class for the game frame and one for the code
//add an area to let user know what their highest and lowest guess is -- DONE
//reset button--DONE
//win streak -- DONE
//guess count--DONE
//ask for language preference
//add levels; think about this more