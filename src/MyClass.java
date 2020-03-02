import javax.swing.*;

public class MyClass {
   int number;
    char symbol;

    void set(int n, char s){
        number = n;
        symbol = s;
    }
    String getInfo(){
        String text ="Число: " + number + "\n";
        text+="Символ: "+ symbol;
        return text;
    }
}
class UsingObjectDemo{
    public static void main(String[]args){
        MyClass objA = new MyClass();
        MyClass objB = new MyClass();
        objA.set(100, 'A');
        objB.set(200, 'B');
        JOptionPane.showMessageDialog(null,objA.getInfo(), "First object", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,objB.getInfo(), "Second object", JOptionPane.INFORMATION_MESSAGE);

    }
}
