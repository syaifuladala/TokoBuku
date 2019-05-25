package tampilan;
import javax.swing.JFrame;
import javax.swing.*;

public class setHalaman extends JFrame{
    JFrame window=new JFrame();
    JPanel panel=new JPanel();
    JButton btnExit=new JButton();
    public setHalaman(){
        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Program Administrasi Masyarakat");
        window.setUndecorated(true);
        window.setLayout(null);
        window.setSize(1366, 768);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}