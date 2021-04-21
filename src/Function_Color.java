import java.awt.*;

public class Function_Color {
    NoteGui gui;

    public Function_Color(NoteGui gui){

        this.gui = gui;

    }

    public void changeColor(String color){
        switch(color){
            case"White":
                gui.window.getContentPane().setBackground(Color.white);
                gui.textArea.setBackground(Color.white);
                gui.textArea.setForeground(Color.BLACK);
                break;

            case"Black":
                gui.window.getContentPane().setBackground(Color.black);
                gui.textArea.setBackground(Color.black);
                gui.textArea.setForeground(Color.white);
                break;

            case"Blue":
                gui.window.getContentPane().setBackground(Color.BLUE);
                gui.textArea.setBackground(Color.BLUE);
                gui.textArea.setForeground(Color.BLACK);
                break;


        }

    }
}
