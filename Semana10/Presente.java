import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Presente extends JPanel {

    int T = 20;
    int x = 0;
    int y = 0;
    boolean cresce = true;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        
        int xi = x;
        int yi = y;
        int xf = 400;
        int yf = 400;

        for (int a = 0; a < 20; a++) {
            g.drawLine(xi, yi, xf, yf);
            xi = xi + 20;
            xf = xf - 20;
            yf = yf - 20;
        }
        
        y += cresce ? 1 : -1;
        
        if (y == 400 || y == 0) {
            cresce = !cresce;
        }

        try {
            Thread.sleep(16);
        } catch (Exception e) {}
        repaint();
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("JANELINHA");
        janela.setSize(400, 420);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mata quando fecha
        janela.add(new Presente()); // painel que criamos
        janela.setVisible(true);
    }
}
