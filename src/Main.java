import javax.swing.*; //GUI package     

public class Main {
    public static void Grid() { //creates the GUI and grid
        JFrame f=new JFrame("Battleships"); //create JFrame
        JButton[][] DGrid = new JButton[10][10]; //DGrid is the defense grid, there will be 2 grids for the player
        for (int y=0, yPos=-60, xPos=0; y<10; y++) {
            for (int x=0; x<10; x++, xPos +=60)   {
                DGrid[x][y]=new JButton(String.valueOf(x)); //each tile in a row is given text 1-9
                DGrid[x][y].setBounds(xPos,yPos,60,60);
                f.add(DGrid[x][y]);  
            }
            yPos+= 60; 
            xPos=0;
        }
        //size and layout of the GUI
        f.setSize(600, 600);  
        f.setLayout(null);  
        f.setVisible(true);
    }

    public static void main(String[] args) {  
        //runs when program is run
        Grid();
    }  
}  