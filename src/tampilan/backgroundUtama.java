package tampilan;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class backgroundUtama extends setHalaman{
    JLabel gambar=new JLabel();
    public backgroundUtama(){
        setHalaman setHalaman = new setHalaman();
        window.add(gambar);
        gambar.setBackground(new java.awt.Color(153, 153, 255));
        gambar.setIcon(new ImageIcon(getClass().getResource("gambar/background-login.png")));
        window.setVisible(true);
        window.setFont(new java.awt.Font("Segoe UI semilight", 0, 12));
        gambar.setBounds(0, 0, 1366, 768);
    }
}
