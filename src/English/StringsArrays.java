package English;

import javax.swing.*;

public class StringsArrays {
    public static void main(String[]args){
        int[] size = {3,13,4,4};
        char[][] symbols = new char[size.length][];
        char s = 'A';
        String txt = "";
        for(int i = 0; i <symbols.length; i++){
            symbols[i] = new char [size[i]];
            for(int j = 0; j <symbols[i].length; j++) {
                symbols[i][j] = s;
                s++;
                txt += "|" + symbols[i][j] + " ";
            }
            txt += "|\n";
        }
        JOptionPane.showMessageDialog(null,txt,"Массив со строками разной длины",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:/Users/Asus/Pictures/87157.png"));
    }
}
