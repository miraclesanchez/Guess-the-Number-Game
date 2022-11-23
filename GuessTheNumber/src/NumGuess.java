import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class NumGuess{
	
	static int guess = 0;
	static int guess_count=5;

	public static void main(String[] args) {
			int random=(int) (Math.random()*100)+1;
			System.out.println(random);
			
			JFrame frame = new JFrame("Number Game");
			//JPanel panel=new JPanel();
			frame.getContentPane().setLayout(null);
			frame.setBounds(0,0,350,300);
			frame.getContentPane().setBackground(Color.cyan);
			frame.setLocation(600,350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel instruction=new JLabel("Enter a number from 1 to 100");
			instruction.setBounds(70, 20, 200, 67);
			frame.add(instruction);
			instruction.setBackground(Color.black );
					
			JTextField text = new JTextField();
			frame.getContentPane().add(text);
			text.setBounds(10, 70, 150, 25);
			
			JLabel answer=new JLabel("Good Luck!");
			answer.setBounds(120,100,150,25);
			frame.add(answer);
			answer.setBackground(Color.black);
			
			JLabel guessCount=new JLabel("Guesses Left: "+guess_count);
			guessCount.setBounds(230, -10, 200, 67);
			frame.add(guessCount);
			guessCount.setBackground(Color.black );
			
			JButton enter = new JButton("Enter");
			frame.getContentPane().add(enter);
			enter.setBounds(160, 70, 150, 25);
			enter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					guess = Integer.parseInt(text.getText());
						if(guess<random)
						{
							guess_count--;
							guessCount.setText("Guesses Left: "+guess_count);
							answer.setText("higher!!");
						}
						
						else if(guess>random)
						{
							guess_count--;
							guessCount.setText("Guesses Left: "+guess_count);
							answer.setText("lower!!");
						}
						else if(guess==random)
						{
							answer.setText("you win!!");
						}
				}
					
			});
			
			JButton reset=new JButton("Reset");
			frame.getContentPane().add(reset);
			reset.setBounds(160,140,150,25);
			reset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					guess_count=5;
					guessCount.setText("Guesses Left: "+guess_count);
					int random=(int) (Math.random()*100)+1;
					System.out.println(random);
				}
			});
			frame.setVisible(true);
	}

		
}
//create separate class for the game frame and one for the code
//add an area to let user know what their highest and lowest guess is
//reset button
//at the end of game let them know how many guesses it took
//win streak
//lowest guess count
//guess count--DONE
//ask for language preference
//