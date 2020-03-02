package English;
import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

public class MyFrameEnglish {
    public String MyFrameEnglish(){
        String txt =  "1.Present Simple;" + "\n" + "2.Past Simple;" + "\n" +  "3.Future Simple;"+ "\n" + "4.Present Perfect;" + "\n" +  "5.Past Perfect;" + "\n" +
                "6.Future Perfect;" + "\n" +  "7.Present Perfect Continuous;" + "\n" +  "8.Past Perfect Continuous;" + "\n" +
                "9.Future Perfect Continuous;" + "\n" + "10.Present Continuous;" + "\n" + "11.Past Continuous;" + "\n" +
                "12.Future Continuous;";
        return txt;
    }
    public String MyFrameEnglish2(){
        String text = "Формула времени: объект + глагол в 1 форме. " + "\n" +
                "Пример: I(объект) want(глагол в 1 форме) a(артикль) new(новый, прилагательное) sweater(свитер)" + "\n" +
                        "I want a new sweater.";
        return text;
    }


    public static void main(String[] args) {
        MyFrameEnglish options = new MyFrameEnglish();
        JOptionPane.showMessageDialog(null, options.MyFrameEnglish(),"Выберите время",
                QUESTION_MESSAGE );
       int number = MyFrameEnglish.getInteger("Введите цифру");
       switch(number){
        case 1:
            JOptionPane.showMessageDialog(null,options.MyFrameEnglish2(), "Present Simple ", JOptionPane.INFORMATION_MESSAGE);

            String two = showInputDialog("Все понятно?" + "\n" + "Выберите: "  + "\n" + "Да;"  + "\n" + "Я не знаю, что значит артикль;"  + "\n" +
                    "Я не понимаю, как строится предложение.");
            switch (two){
                case "Да":
                    String sentence = showInputDialog("Введите свой пример предложения," +"\n" + "состоящий из объекта, глагола, артикля," +"\n"+ "прилагательного и существительного:");


            }

            Scanner sc2 = new Scanner(System.in);
            System.out.println("1. Я не понимаю, как строится это предложение;");
            System.out.println("2. Я не знаю, что значит артикль;");
            System.out.println("3. Мне все понятно.");
            int number2 = sc2.nextInt();
            switch (number2){
                case 1:
                    System.out.println("Oбъект - это любое существительное. В нашем случае I(я). Если у нашего предложения есть основа, т.е.");
                    System.out.println("оно содержит подлежащее и сказуемое, то, как и в русском языке, существительное в утвердительных предложениях идет перед глаголом.");
                    break;
                case 2:
                    System.out.println("Артикль - это так называемая приставкак к любому английскому существительному.");
                    System.out.println("Например, слово human(человек). Если мы хотим построить правильное предложение с этим существительным,");
                    System.out.println("то нам надо использовать артикль.");
                    System.out.println("Предложение: I see a human. ");
                    break;
                case 3:
                    System.out.println("Введите свой пример предложения, состоящий из объекта, глагола, артикля, прилагательного и существительного:");
                    Scanner sc3 = new Scanner (System.in);


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + number2);
            }
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;
        case 6:
            break;
        case 7:
            break;
        case 8:
            break;
        case 9:
            break;
        case 10:
            break;
        case 11:
            break;
        case 12:
            break;

    }
    }
    static int getInteger(String txt){
        String res;
        res = showInputDialog(null,txt,"Начните с 1", QUESTION_MESSAGE);
        if (res==null){
            return 0;
        } else{
            return  Integer.parseInt(res);
        }
    }
}
