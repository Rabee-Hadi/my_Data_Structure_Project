import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 * Created by hp on 21/12/2020.
 */
public class myframe {
    Booking_management b=new Booking_management();
    public static void main(String[] args) {
        JFrame frame = new JFrame("myframe");
        frame.setContentPane(new myframe().p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(440,440);
        frame.setVisible(true);
    }

    private JPanel p1;
    private JButton addButton;
    private JButton veiwButton;
    private JPanel mainpanel;
    private JPanel frist;
    private JPanel scand;
    private JTextField tfrname;
    private JTextField tnumber;
    private JTextArea textArea1;
    private JButton deleteButton;
    private JLabel loname;
    private JLabel lonumber;
    private JLabel locust;

    public myframe() {
        addButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                mainpanel.removeAll();
                mainpanel.add(frist);
                mainpanel.repaint();
                mainpanel.revalidate();
            }
        });
        veiwButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                mainpanel.removeAll();
                mainpanel.add(scand);
                mainpanel.repaint();
                customer c=new customer("rabee",772661837,"Arhab","male","yiu",89,2034,2023);
                Services s=new Services("88","net","local",777);
                Rooms r=new Rooms("dining",77,"singel","four");
Reception d=new Reception("uii",c,99989,s,r);
                int number=Integer.parseInt(tnumber.getText());
                b.addRecep(tfrname.getText(),c,number,s,r);
                loname.setText(tfrname.getText());
                lonumber.setText(tnumber.getText());
                b.veiw();
               // b.deletenumRecep(788);

                locust.setText(c.toString());


            }
        });
        deleteButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                b.deletenumRecep(999);
            }
        });
    }
}
