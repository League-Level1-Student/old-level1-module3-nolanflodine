import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;
	String A1="";
	String A2="";
	String A3="";
	String A4="";
	String A5="";

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 quizPanel=new JPanel();
		 
		f.setLayout(new BorderLayout());

		
		// 1. Make the frame show up
f.setVisible(true);
		// 2. Give your frame a title
f.setTitle("Brotato Chip");
		// 3. Create a JPanel variable to hold the header using the createHeader method
JPanel panel= createHeader("Header");


		// 4. Add the header component to the quizPanel
quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
f.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
firstButton=createButton("$200");
		// 7. Add the firstButton to the quizPanel
quizPanel.add(firstButton);
		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
secondButton=createButton("$400");
		// 10. Add the secondButton to the quizPanel
quizPanel.add(secondButton);
		// 11. Add action listeners to the buttons (2 lines of code)
firstButton.addActionListener(this);
secondButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below
thirdButton=createButton("$600");
		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
fourthButton=createButton("$800");
fifthButton=createButton("$1000");
quizPanel.add(thirdButton);
quizPanel.add(fourthButton);
quizPanel.add(fifthButton);

		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		
		f.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		f.add(makeScorePanel(), BorderLayout.NORTH);
		f.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
JButton button = new JButton();
		// Set the text of the button to the dollarAmount
button.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
buttonCount++;
		// Return your new button instead of the temporary button
//hold on
		return button;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		//JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
if (buttonPressed==firstButton) {
	askQuestion(200);
}
if (buttonPressed==secondButton) {
	askQuestion(400);
}
if (buttonPressed==thirdButton) {
	askQuestion(600);
}
if (buttonPressed==fourthButton) {
	askQuestion(800);
}
if (buttonPressed==fifthButton) {
	askQuestion(1000);
}
			// Call the askQuestion() method
 
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

		// If the buttonPressed was the secondButton

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)

	}

	private void askQuestion(int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
		playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		A1=JOptionPane.showInputDialog(null, "Is this the Krusty Crab?");
		A2=JOptionPane.showInputDialog("This is a trick question");
		A3=JOptionPane.showInputDialog("2+2 is");
		A4=JOptionPane.showInputDialog("I got the");
		A5=JOptionPane.showInputDialog("Its an avacodo!");
		// Stop the theme music when they have entered their response. Hint: use the sound variable 
if (A1.equals("No this is patrick")) {
	score=score+prizeMoney;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	score=score-prizeMoney;
	JOptionPane.showMessageDialog(null, "Incorrect, you shouldv'e said \"no this is patrick\"");
	
	
}
updateScore();
if (A2.equals("I know you are but what am I")) {
	score=score+prizeMoney;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	score=score-prizeMoney;
	JOptionPane.showMessageDialog(null, "Incorrect, you shouldv'e said \"I know you are but what am I\"");
	
	
}
updateScore();

if (A3.equals("4-1 that's 3")) {
	score=score+prizeMoney;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	score=score-prizeMoney;
	JOptionPane.showMessageDialog(null, "Incorrect, you shouldv'e said \"4-1 that's 3\"");
	
	
}
updateScore();
if (A4.equals("Horses in the back")) {
	score=score+prizeMoney;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	score=score-prizeMoney;
	JOptionPane.showMessageDialog(null, "Incorrect, you shouldv'e said \"Horses in the back\"");
	
	
}
updateScore();
if (A5.equals("Thaannkkss")) {
	score=score+prizeMoney;
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	score=score-prizeMoney;
	JOptionPane.showMessageDialog(null, "Incorrect, you shouldv'e said \"Thaannkkss\"");
	
	
}
updateScore();

		// If the answer is correct

			// Increase the score by the prizeMoney

			// Pop up a message to tell the user they were correct

		// Otherwise

			// Decrement the score by the prizeMoney

			// Pop up a message to tell the user they were wrong and give them the correct answer

		// Call the updateScore() method

	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
