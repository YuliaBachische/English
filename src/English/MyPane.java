package English;

import javax.swing.*;

public class MyPane extends JOptionPane {
    static void showMessage(String txt, String title){
        showMessageDialog(null, txt, title, PLAIN_MESSAGE, new ImageIcon("C:/Users/Asus/Pictures/87157.png"));
    }
    static  int getInteger(String txt){
        String res;
        res = showInputDialog(null,txt,"Число(по умолчанию 10)", QUESTION_MESSAGE);
        if (res==null){
            return 10;
        } else{
            return  Integer.parseInt(res);
        }
    }
    static class ExtendingJOptionPaneDemo{
        public static void main(String[] args) {
            MyPane.showMessage("Hello, bEAch(");
            int number;
            number = MyPane.getInteger("Введите целое число: ");
            String txt = "Числа от 1 до" + " " + number + ":\n";
            for(int i = 1; i <= number; i++){
              txt+= i + " ";
            }
            MyPane.showMessage(txt, "Целые числа");
        }
    }

    static void showMessage(String txt) {
        showMessage(txt, "Сообщение");
    }
}
