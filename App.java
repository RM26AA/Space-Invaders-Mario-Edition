import javax.swing.*;

public class App {
    public static void main(String[] args) {
        //window variables
        int tileSize = 32;
        int rows = 16;
        int columns = 16;
        int boardWidth = tileSize * columns;    //32*16 = 512px
        int boardHeight = tileSize * rows;  //32*16 = 512px

        JFrame frame = new JFrame("Space Invaders: Mario Edition");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);  //open window at centre of screen
        frame.setResizable(false);  //user cant change size of window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //when X button is clicked, program is terminated

        SpaceInvaders spaceInvaders = new SpaceInvaders();
        frame.add(spaceInvaders);
        frame.pack();
        spaceInvaders.requestFocus();
        frame.setVisible(true);
    }
}