
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;

public class NumGuess {
		public static void main(String [] args)
		{
		
			int random=(int) (Math.random()*100)+1;
			System.out.println(random);
			
			JFrame frame = new JFrame("Number Game");
			JPanel panel=new JPanel();
			frame.getContentPane().setLayout(null);
			frame.setBounds(0,0,350,300);
			frame.getContentPane().setBackground(Color.cyan);
			frame.setLocation(600,350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel instruction=new JLabel("Enter a number from 1 to 100");
			instruction.setBounds(70, -5, 200, 67);
			frame.add(instruction);
			instruction.setBackground(Color.black );
			
					
			JTextField text = new JTextField();
			frame.getContentPane().add(text);
			text.setBounds(10, 45, 150, 25);
			
			JLabel answer=new JLabel("Good Luck!");
			answer.setBounds(120,90,150,25);
			frame.add(answer);
			answer.setBackground(Color.black);
			
			JButton button = new JButton("Enter");
			frame.getContentPane().add(button);
			button.setBounds(160, 45, 150, 25);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
						int guess=Integer.parseInt(text.getText());
						
						if(guess<random)
						{
							answer.setText("higher!!");
						}
						
						else if(guess>random)
						{
							answer.setText("lower!!");
						}
						else if(guess==random)
						{
							answer.setText("you win!!");
						}
				}
			});
			
			frame.setVisible(true);
		}

	}

