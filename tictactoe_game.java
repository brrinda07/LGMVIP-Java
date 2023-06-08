import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tictactoe_game extends JFrame implements ActionListener{
    JButton[][] buttons;
    boolean pX;

    tictactoe_game(){
        setTitle("TIC TAC TOE GAME");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
        setFont(new Font("Times New Roman",Font.PLAIN,60));

        buttons=new JButton[3][3];
        pX=true;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                buttons[i][j]=new JButton();
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

    }
    
    public void actionPerformed(ActionEvent e){
        JButton button=(JButton) e.getSource();
        if (button.getText().equals("")){
            if(pX){
                button.setText("X");
            }
            else{
                button.setText("O");
            }
        }
        if(checkwin()){
            String player=pX ? "X":"O";
            JOptionPane.showMessageDialog(this,"Player "+player+" wins!");
            resetGame();
        }
        else if(checkDraw()){
            JOptionPane.showMessageDialog(this, "It's a Draw!");
            resetGame();
        }
        else{
            pX=!pX;
        }
    }

    boolean checkwin(){
        String board[][]=new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=buttons[i][j].getText();
            }
        }
        for(int i=0;i<3;i++){
            if(!board[i][0].equals("") && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]))
                return true;
        }
        for(int j=0;j<3;j++){
            if(!board[0][j].equals("") && board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j]))
                return true;
        }
        if (!board[0][0].equals("") && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return true;
        }
        if (!board[0][2].equals("") && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
            return true;
        }
        return false;
    }
    boolean checkDraw() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }
    void resetGame() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                buttons[i][j].setText("");
            }
        }
        pX=true;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new tictactoe_game().setVisible(true);
            }
        });
    }
}
