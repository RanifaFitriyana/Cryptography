package enkripsiapp;

import javax.swing.SwingUtilities;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // Jalankan GUI di thread event dispatch
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
