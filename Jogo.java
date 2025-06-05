import javax.swing.*;
import java.awt.*;

public class Jogo extends JPanel implements Runnable {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int FPS = 60;
    
    private int x = 100;  // posição inicial x do retângulo
    private int y = 100;  // posição inicial y do retângulo
    private int velocidadeX = 3;  // velocidade de movimento no eixo x
    private int velocidadeY = 2;  // velocidade de movimento no eixo y
    
    private Thread gameThread;
    private boolean running = false;
    
    public Jogo() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
    }
    
    public void start() {
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
    
    public void stop() {
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void update() {
        // Atualiza a posição do retângulo
        x += velocidadeX;
        y += velocidadeY;
        
        // Verifica colisão com as bordas
        if (x <= 0 || x >= WIDTH - 50) {
            velocidadeX *= -1;
        }
        if (y <= 0 || y >= HEIGHT - 50) {
            velocidadeY *= -1;
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Desenha o retângulo
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
        
        // Para suavizar a animação
        Toolkit.getDefaultToolkit().sync();
    }
    
    @Override
    public void run() {
        // Tempo ideal entre frames para 60 FPS
        double drawInterval = 1000000000.0 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        
        while (running) {
            currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;
            
            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo Animado");
        Jogo jogo = new Jogo();
        
        frame.add(jogo);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        jogo.start();
    }
}
