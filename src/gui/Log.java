/**
 * 
 */
package gui;

import java.io.PrintStream;

import javax.swing.JFrame;

/**
 * @author jonas
 *
 */
public class Log{
	
	
	private PrintStream outPutStream;
    JFrame frame = new JFrame();

	
	public Log() {
        outPutStream = new PrintStream(System.out) {

            @Override
            public void println(String s) {
                frame.setSize(500, 500);
                frame.setTitle(s);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
            
         };
}
	
    
public void setVisible() {
 frame.setVisible(true);

}
}

