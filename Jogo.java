import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Jogo extends JPanel implements Runnable, KeyListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int FPS = 60;
    
    // 1. inicializar os valores aleatoriamente dentro do médoto Jogo
    // 2. desenhar algo que represente os inimigos  (paintComponent usando o g)
    // 3. ANIMAR OS INIMIGOS
    // 4. VERIFICAR COLISAO COM O JOGADOR
    int [] inimigoX  = new int[10];
    int [] inimigoY  = new int[10];
    int [] inimigoVelX = new int[10];
    int [] inimigoVelY = new int[10];

    private int x = 100;  // posição inicial x do retângulo
    private int y = 100;  // posição inicial y do retângulo
    private int velocidadeX = 10;  // velocidade de movimento no eixo x
    private int velocidadeY = 2;  // velocidade de movimento no eixo y
    
    int px = 380;
    int py = 280;
    int ptam = 40;

    boolean cima = false;
    boolean baixo = false;
    boolean esquerda = false;
    boolean direita = false;

    private Thread gameThread;
    private boolean running = false;
    
    Color minhaCor = new Color(255, 00, 255);
    Random aleatorio = new Random();


    // INICIALIZACAO
    public Jogo() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);

        // adiciona os eventos do keylistener ao jogo
        this.addKeyListener(this);

        // inicializa as posicoes x e y dos inimigos e as velocidades;
        for (int i = 0; i < inimigoX.length; i++) {
            inimigoX[i] = aleatorio.nextInt(800);
            inimigoY[i] = aleatorio.nextInt(600);
            inimigoVelX[i] = aleatorio.nextInt(3) + 3;
            inimigoVelY[i] = aleatorio.nextInt(3) + 3;
        }
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
    
    // ATUALIZAR A LOGICA DO JOGO
    private void update() {
        // Atualiza a posição do retângulo
        x += velocidadeX;
        y += velocidadeY;
        
        // Verifica colisão com as bordas
        if (x <= 0 || x >= WIDTH - 50) {
            velocidadeX *= -1;
            minhaCor = new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
        }
        if (y <= 0 || y >= HEIGHT - 50) {
            velocidadeY *= -1;
        }

        for (int i = 0; i < inimigoX.length; i++) {
            // atualiza a posicao de cada um dos inimigos baseado na sua velocidade
        }

        if (cima) py = py - 5;
        if (baixo) py = py + 5;
        if (esquerda) px = px - 5;
        if (direita) px = px + 5;
    }
    

    // DESENHA NA TELA O ESTADO DO JOGO
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Desenha o retângulo
        g.setColor(minhaCor);
        g.fillRect(x, y, 50, 50);
        
        g.setColor(Color.WHITE);
        g.fillOval(px, py, ptam, ptam);

        g.setColor(Color.RED);
        for (int i = 0; i < inimigoX.length; i++) {
            g.fillRect(inimigoX[i], inimigoY[i], 20, 20);
        }

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
                // atualizacao da parte logica
                update();

                // desenho na tela
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
        frame.pack();   // serve para dimensionar corretamente a janela baseado no seu conteudo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        frame.addKeyListener(jogo);

        jogo.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar() + " foi pressionado");
        char letra = e.getKeyChar();
        switch (letra) {
            case 'w':
                cima = true;
                break;

            case 's':
                baixo = true;
                break;
        
            case 'a':
                esquerda = true;
                break;
            
            case 'd':
                direita = true;
                break;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char letra = e.getKeyChar();

        switch (letra) {
            case 'w':
                cima = false;
                break;

            case 's':
                baixo = false;
                break;
        
            case 'a':
                esquerda = false;
                break;
            
            case 'd':
                direita = false;
                break;
        }
    }
}
