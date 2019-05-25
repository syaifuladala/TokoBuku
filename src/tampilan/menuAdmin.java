package tampilan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class menuAdmin extends atribut implements ActionListener{
    public menuAdmin(){
        komponen();
        latar();
    }
    
    public void komponen(){
        window.add(btnExit);
        btnExit.addActionListener(this);
    }
    
    private void latar(){
        setHalaman setHalaman = new setHalaman();
        window.add(gambar);
        gambar.setBackground(new java.awt.Color(153, 153, 255));
        gambar.setIcon(new ImageIcon(getClass().getResource("gambar/background-login.png")));
        window.setVisible(true);
        window.setFont(new java.awt.Font("Segoe UI semilight", 0, 12));
        gambar.setBounds(0, 0, 1366, 768);
    }
    
    public static void main(String[] args) {
        menuAdmin menuAdmin=new menuAdmin();
    }   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnExit){
            System.exit(1);
        }
    }
}