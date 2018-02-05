import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class HandlerPanel {
    private final ButtonGroup radioGroup;
    private JPanel MainPanel;
    private JPanel northPanel;
    private JTextField outputTextField;
    private JPanel CompPanel;
    private JRadioButton ARadioButton;
    private JRadioButton BRadioButton;
    private JRadioButton CRadioButton;
    private JLabel imageLable;
    private JLabel CLabel;
    private JLabel BLabel;
    private JLabel ALabel;
    private JPanel cenerPanel;


    public HandlerPanel(){
        radioGroup = new ButtonGroup();
        radioGroup.add(ARadioButton);
        radioGroup.add(BRadioButton);
        radioGroup.add(CRadioButton);

        ARadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("A is Selected");
                outputTextField.setFont( new Font("HarvestItal Regular", Font.PLAIN, 20));

            }
        });
        BRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("B is Selected");
                outputTextField.setFont( new Font("HarvestItal Regular", Font.PLAIN, 20));
            }
        });
        CRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("C is Selected");
                outputTextField.setFont( new Font("HarvestItal Regular", Font.PLAIN, 20));
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("ThinkTank");
        frame.setContentPane(new HandlerPanel().MainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        imageLable = new JLabel(new ImageIcon("images\\ImagePage1.jpg"));
        ALabel= new JLabel(new ImageIcon("images\\AImage.jpg"));
        BLabel= new JLabel(new ImageIcon("images\\BImage.jpg"));
        CLabel= new JLabel(new ImageIcon("images\\CImage.jpg"));







}
}