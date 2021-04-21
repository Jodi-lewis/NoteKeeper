import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoteGui implements ActionListener{

    JFrame window;
    //Text Area
    JTextArea textArea;
    JScrollPane scrollPane;
    //Top Menu Bar
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuColor;
    //File Menu
    JMenuItem iNew, iOpen, iSave, iSaveAS, iExit;
    //Colour Menu
    JMenuItem iColor1, iColor2, iColor3;

    Functions file = new Functions(this);
    Function_Color color = new Function_Color(this);

    public static void main(String[] args){

        new NoteGui();
    }
    public NoteGui() {

        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
        createColorMenu();

        color.changeColor("white");

    }
    public void createWindow(){

        window = new JFrame("Notepad");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createTextArea(){

        textArea = new JTextArea();

        scrollPane= new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
    }
    public void createMenuBar(){

        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile= new JMenu("File");
        menuBar.add(menuFile);

        menuEdit= new JMenu("Edit");
        menuBar.add(menuEdit);


        menuColor= new JMenu("Color");
        menuBar.add(menuColor);
    }
     public void createFileMenu(){

        iNew = new JMenuItem("New");
        iNew.addActionListener(this);
        iNew.setActionCommand("New");
        menuFile.add(iNew);

         iOpen = new JMenuItem("Open");
         iOpen.addActionListener(this);
         iOpen.setActionCommand("Open");
         menuFile.add(iOpen);

         iSave = new JMenuItem("Save");
         iSave.addActionListener(this);
         iSave.setActionCommand("Save");
         menuFile.add(iSave);

         iSaveAS = new JMenuItem("SaveAs");
         iSaveAS.addActionListener(this);
         iSaveAS.setActionCommand("SaveAs");
         menuFile.add(iSaveAS);

         iExit = new JMenuItem("Exit");
         iExit.addActionListener(this);
         iExit.setActionCommand("Exit");
         menuFile.add(iExit);
     }
        public void createColorMenu(){


            iColor1=new JMenuItem("White");
            iColor1.addActionListener(this);
            iColor1.setActionCommand("White");
            menuColor.add(iColor1);

            iColor2=new JMenuItem("Black");
            iColor2.addActionListener(this);
            iColor2.setActionCommand("Black");
            menuColor.add(iColor2);

            iColor3=new JMenuItem("Blue");
            iColor3.addActionListener(this);
            iColor3.setActionCommand("Blue");
            menuColor.add(iColor3);
        }

    @Override
    public void actionPerformed(ActionEvent e) {

        String command = e.getActionCommand();

        switch (command){
            case "New": file.newFile(); break;
            case "Open": file.open(); break;
            case "Save": file.save(); break;
            case "SaveAs": file.saveAs(); break;
            case "Exit": file.exit(); break;

            case "White": color.changeColor(command);
            case "Black": color.changeColor(command);
            case "Blue": color.changeColor(command);
        }

    }

}
