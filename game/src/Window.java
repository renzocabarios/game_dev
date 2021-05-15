

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

    private static final long serialVersionUID = 7502451895808168199L;

    public Window(int width, int height, String title, Game game) {


        JFrame frame  = new JFrame(title);//sets the window
        Dimension dim = new Dimension(width, height);


        //setting the size of the window
        frame.setPreferredSize(dim);
        frame.setMaximumSize(dim);
        frame.setMinimumSize(dim);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);// can't resize the window
        frame.setLocationRelativeTo(null);//starts the window at the middle of the screen
        frame.add(game);
        frame.setVisible(true);//makes the app visible
        game.start();
    }

}
