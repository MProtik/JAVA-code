import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] board;
    private Player playerX;
    private Player playerO;
    private boolean gameOver;

    public TicTacToe() {
        // Set up the JFrame
        super("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        // Initialize the board
        initializeBoard();

        // Create the players
        playerX = new Player("Player X", 'X');
        playerO = new Player("Player O", 'O');

        // Start the game with X
        gameOver = false;
        JOptionPane.showMessageDialog(this, "Player X goes first.");
    }

    private void initializeBoard() {
        // Create the board as a 2D array of buttons
        board = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new JButton();
                board[i][j].addActionListener(this);
                add(board[i][j]);
            }
        }

        // Set up the JFrame
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Check if the game is over
        if (gameOver) {
            return;
        }

        // Get the button that was clicked
        JButton button = (JButton) e.getSource();
        int row = -1, col = -1;

        // Find the row and column of the button in the board array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == button) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }

        // Update the board with the player's symbol
        if (button.getText().equals("")) {
            if (playerX.getTurn()) {
                button.setText("X");
                playerX.set
            }
        }
    }
    public class Player {
        private String name;
        private char symbol;
        private boolean turn;

        public Player(String name, char symbol) {
            this.name = name;
            this.symbol = symbol;
            this.turn = false;
        }

        public void setTurn(boolean turn) {
            this.turn = turn;
        }

        public boolean getTurn() {
            return turn;
        }

        // Other methods for the Player class...
    }
}