package English;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        super("Окно с кнопкой");
        setBounds(250,250,300,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lbl = new JLabel("Щелчок на кнопке приводит к закрытию окна");
        lbl.setBounds(10,30,280,50);
        add(lbl);
        JButton btn = new JButton("Закрыть окно");
        btn.setBounds(50,120,200,30);

       
        add(btn);
        setVisible(true);

    }

}
