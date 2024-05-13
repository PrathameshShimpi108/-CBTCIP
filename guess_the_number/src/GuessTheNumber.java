import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumber extends JFrame {
    private JLabel rangeLabel, guessLabel;
    private JTextField minField, maxField, guessField;
    private JButton startButton, guessButton, resetButton;
    private JTextArea outputArea;
    private Random random;
    private int randomNumber;
    private int attempts;

    public GuessTheNumber() {
        setTitle("Guess the Number Game");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        rangeLabel = new JLabel("Enter the range (min-max):");
        minField = new JTextField(5);
        maxField = new JTextField(5);
        startButton = new JButton("Start Game");
        guessLabel = new JLabel("Enter your guess:");
        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resetButton = new JButton("Reset");
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        add(rangeLabel);
        add(minField);
        add(new JLabel("-"));
        add(maxField);
        add(startButton);
        add(guessLabel);
        add(guessField);
        add(guessButton);
        add(resetButton);
        add(new JScrollPane(outputArea));

        random = new Random();

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int min = Integer.parseInt(minField.getText());
                int max = Integer.parseInt(maxField.getText());
                randomNumber = random.nextInt(max - min + 1) + min;
                attempts = 0;
                startGame();
            }
        });

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(guessField.getText());
                checkGuess(guess);
                guessField.setText(""); // Clear guess field after each guess
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minField.setText("");
                maxField.setText("");
                guessField.setText("");
                outputArea.setText("");
            }
        });
    }

    private void startGame() {
        outputArea.setText("Guess the number between " + minField.getText() + " and " + maxField.getText() + ":\n");
    }

    private void checkGuess(int guess) {
        attempts++;
        if (guess == randomNumber) {
            outputArea.append("Congratulations! You guessed the number in " + attempts + " attempts.\n");
        } else if (guess < randomNumber) {
            outputArea.append("The number is higher. Try again.\n");
        } else {
            outputArea.append("The number is lower. Try again.\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GuessTheNumber().setVisible(true);
            }
        });
    }
}
