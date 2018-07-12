/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import javax.swing.JFrame;

/**
 *
 * @author Hamza Rehan
 */
public class Notepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       NotepadGui obj=new NotepadGui();
      obj.setBounds(0,0,700,700);
      obj.setTitle("MyNotepad");
      obj.setResizable(false);
      obj.setVisible(true);
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
