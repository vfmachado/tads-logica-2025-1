import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exemplo extends JPanel {

    int x = 5;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new java.awt.BasicStroke(5));

        g2.drawLine(0, 0, x, x);
        x++;

        try {
            Thread.sleep(16);
        } catch (Exception e) {}

        repaint();
     }

    public static void main(String[] args) {
        JFrame janela = new JFrame("JANELA");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 420);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setContentPane(new Exemplo());
        janela.setVisible(true);
    }
}