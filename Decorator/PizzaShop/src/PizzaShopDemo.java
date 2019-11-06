import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class PizzaShopDemo extends JFrame implements ActionListener {

    JLabel label;
    JCheckBox spizza, mpizza, lpizza, cheese, sausage, pepperoni,olive;
    JButton btn;

    public PizzaShopDemo(){
        label = new JLabel("Make your own Pizza !");
        label.setBounds(50,50,300,20);
        spizza = new JCheckBox("Small Pizza: $10.99");
        spizza.setBounds(50,100,180,20);
        mpizza = new JCheckBox("Medium Pizza: $19.99");
        mpizza.setBounds(50,150,180,20);
        lpizza = new JCheckBox("Large Pizza: $29.99");
        lpizza.setBounds(50,200,180,20);

        cheese = new JCheckBox("Cheese: $0.20");
        cheese.setBounds(250,100,180,20);
        sausage = new JCheckBox("Sausage: $0.35");
        sausage.setBounds(250,150,180,20);
        pepperoni = new JCheckBox("Pepperoni: $0.15");
        pepperoni.setBounds(250,200,180,20);
        olive = new JCheckBox("Olive: $0.19");
        olive.setBounds(250,250,180,20);

        btn = new JButton("Order");
        btn.setBounds(70,300,80,30);
        btn.addActionListener(this);
        add(label);
        add(spizza);
        add(mpizza);
        add(lpizza);
        add(cheese);
        add(sausage);
        add(pepperoni);
        add(olive);
        add(btn);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PizzaShopDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Pizza pizza = new SmallPizza();
        if(mpizza.isSelected())pizza = new MediumPizza();
        if(lpizza.isSelected())pizza = new LargePizza();
        if(cheese.isSelected())pizza = new CheeseDecorator(pizza);
        if(sausage.isSelected())pizza = new SausageDecorator(pizza);
        if(pepperoni.isSelected())pizza = new PepperoniDecorator(pizza);
        if(olive.isSelected())pizza = new OliveDecorator(pizza);
        DecimalFormat ft = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(this,pizza.getOrder()+"\nTotal: $ "+ft.format(pizza.price()));
    }
}
