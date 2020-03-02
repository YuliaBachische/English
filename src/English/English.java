package English;
import javax.swing.*;
import java.lang.String;
import java.util.Scanner;

class English {
    public static String Subject;
    public static String Verb;
    public static String Article;
    public static String Adjective;
    public static String Noun;
    private static int count = 0;
    public String English(String s, String v, String a,String ad, String n){
         Subject = s;
         Verb = v;
         Article = a;
         Adjective = ad;
         Noun = n;
         String text = "Объект:" + " " + s + "\n" + "Глагол:" + " " + v + "\n" +  "Артикль:" + " " + a  + "\n" + "Прилагательное:"  + " " +  ad+ "\n" + "Существительное:" + " " + n;
         return text;
    }
    English(){
        count++;
        System.out.println("Создано предложение №" + count);
    }

    static String show(){
        String text = "Количество предложений: " + " " + count;
        return text;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        English sentence1 = new English();
        English sentence2 = new English();
        English sentence3 = new English();
        JOptionPane.showMessageDialog(null,sentence1.English("I", "want", "a", "new","sweater"),
                "First sentence", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,sentence2.English("She", "wants", "a", "new ", "sweater"),
                "Second sentence", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,sentence3.English("They", "want", "a", "new", "sweater"),
                "Third sentence", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,sentence3.show(), "Quantity", JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:/Users/Asus/Pictures/Saved Pictures/apple.png"));
        int num = sc.nextInt();
        String lox = "Лошара!";
        String right = "Very well!";
        switch (num){
            case 1:
                JOptionPane.showMessageDialog(null, right,"Good job", JOptionPane.PLAIN_MESSAGE);
            case 2:
                JOptionPane.showMessageDialog(null, lox,"Error", JOptionPane.PLAIN_MESSAGE, new ImageIcon("C:/Users/Asus/Pictures/87157.png"));
        }
    }
}
