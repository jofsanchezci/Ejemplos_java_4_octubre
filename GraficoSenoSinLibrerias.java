import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraficoSenoSinLibrerias {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Gráfico del Seno");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new SenoPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

class SenoPanel extends JPanel {
    private ArrayList<Point> points;

    public SenoPanel() {
        points = new ArrayList<>();
        int width = 800;
        int height = 400;

        for (int x = 0; x < width; x++) {
            double angle = (x / (double) width) * 4 * Math.PI;
            int y = (int) (Math.sin(angle) * (height / 2) + (height / 2));
            points.add(new Point(x, y));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLUE);
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}
