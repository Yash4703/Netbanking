import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

/*
<applet code="banking.java" height = 800 width=1000>
</applet> */

public class banking extends Applet implements ActionListener {
    float balance = 100000;
    Button transfer = new Button(" Transfer Funds ");
    Label weight = new Label("ENTER AMOUNT TO TRANSFER  : ");
    Label height = new Label(" ENTER ACCOUNT NO : ");
    Label blnc = new Label("CURRENT BALANCE :  ");
    Label b = new Label(" ");
    TextField amount = new TextField();  //amount = w
    TextField accountNo = new TextField();  //accountNo = b
    TextField result = new TextField();
    Font f = new Font("Times New Roman", Font.BOLD, 15);

    public void init() {
        setLayout(null);
        setFont(f);
        setBackground(Color.gray);
		setForeground(Color.black);

        weight.setLocation(20, 50);
        weight.setSize(300, 40);

        amount.setLocation(350, 50);
        amount.setSize(120, 40);

        height.setLocation(20, 100);
        height.setSize(300, 40);

        accountNo.setLocation(350, 100);
        accountNo.setSize(120, 40);

        transfer.setLocation(50, 200);
        transfer.setSize(120, 60);

        // BMI.setLocation(20, 350);
        // BMI.setSize(120, 40);

        blnc.setLocation(25, 350);
        blnc.setSize(200, 40);

        b.setLocation(250, 350);
        b.setSize(120, 40);
        b.setText(String.valueOf(1000));

        result.setLocation(250,500);
        result.setSize(400, 40);


        add(weight);
        add(height);
        add(blnc);
        add(amount);
        add(accountNo);
        add(b);
        add(transfer);
        add(result);

        transfer.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        float amt = Float.parseFloat(amount.getText());
        float acNO = Float.parseFloat(accountNo.getText());

        if (e.getSource() == transfer) {
            balance = balance-amt;
            b.setText(String.valueOf(balance));
            result.setText(" ₹ " + amt + " Tranfered Sucessfully to Account : " + acNO );
        }
    }
}
