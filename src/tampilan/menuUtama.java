package tampilan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.*;

public class menuUtama extends atribut implements ActionListener{
    atribut atribut=new atribut();
    public menuUtama() {
        komponen();
        login();
        backLogin();
        latar();
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
    
    private void backLogin(){
        window.add(gambar2);
        gambar2.setVisible(true);
        gambar2.setIcon(new ImageIcon(getClass().getResource("gambar/formLogin.png")));
        gambar2.setBounds(340, 400, 600, 292);
    }
    
    private void komponen(){
        window.add(btnPendaftaran);
        window.add(btnPengecekan);
        window.add(btnPengaduan);
        window.add(btnInformasi);
        window.add(btnExit);
        btnExit.addActionListener(this);
        
        btnPendaftaran.setBounds(141, 158, 250, 200);
        btnPendaftaran.setBorder(null);
        btnPendaftaran.setIcon(new ImageIcon(getClass().getResource("gambar/pendaftaran.png")));
        btnPendaftaran.setBackground(new java.awt.Color(253, 55, 90));
        btnPendaftaran.addActionListener(this);
        
        btnPengecekan.setBounds(411, 158, 250, 200);
        btnPengecekan.setBorder(null);
        btnPengecekan.setIcon(new ImageIcon(getClass().getResource("gambar/pengecekan.png")));
        btnPengecekan.setBackground(new java.awt.Color(9, 216, 102));
        btnPengecekan.addActionListener(this);
        
        btnPengaduan.setBounds(681, 158, 250, 200);
        btnPengaduan.setBorder(null);
        btnPengaduan.setIcon(new ImageIcon(getClass().getResource("gambar/pengaduan.png")));
        btnPengaduan.setBackground(new java.awt.Color(214, 19, 235));
        btnPengaduan.addActionListener(this);
        
        btnInformasi.setBounds(951, 158, 250, 200);
        btnInformasi.setBorder(null);
        btnInformasi.setIcon(new ImageIcon(getClass().getResource("gambar/informasi.png")));
        btnInformasi.setBackground(new java.awt.Color(255, 204, 0));
        btnInformasi.addActionListener(this);
        
        atribut atribut=new atribut();
    }
    private void login(){
        window.add(LblUser);
        window.add(LblPass);
        window.add(TxtUser);
        window.add(TxtPass);
        window.add(akun);
        window.add(mata);
        window.add(btnLogin);
        //tambah komponen login
        LblUser.setBounds(501, 500, 75, 30);
        LblPass.setBounds(501, 545, 75, 30);
        TxtUser.setBounds(576, 500, 180, 30);
        TxtUser.setBorder(null);
        TxtPass.setBounds(576, 545, 180, 30);
        TxtPass.setBorder(null);
        
        LblUser.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        LblPass.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        TxtUser.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        TxtPass.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        //pilih akun
        akun.setBounds(766, 500, 90, 30);
        akun.setEditable(false);
        akun.setFont(new java.awt.Font("Segoe UI semilight", 0, 12));
        akun.setBackground(new java.awt.Color(183,222,239));
        akun.setBorder(null);
        //look password
        mata.setBounds(766, 545, 30, 30);
        mata.setBorder(null);
        mata.setIcon(new ImageIcon(getClass().getResource("gambar/mata30x30.png")));
        //setRolloverIcon(new sama)
        mata.setBackground(new java.awt.Color(183,222,239));
        mata.addActionListener(this);
        
        btnLogin.setBounds(706, 590, 90, 30);
        btnLogin.addActionListener(this);
    }
    
    //main program
    public static void main(String[] args) {
        menuUtama menuUtama = new menuUtama();
    }
    
    @Override
    public void actionPerformed(ActionEvent ex) {
        Object selectCb=akun.getSelectedIndex();
        if(ex.getSource()==selectCb){
            if(akun.getSelectedItem().toString().equalsIgnoreCase("Admin")){
                this.LblUser.setText("Nama");
                this.LblPass.setText("NIK");
            }
            if(akun.getSelectedItem().toString().equalsIgnoreCase("Masyarakat")){
                this.LblUser.setText("Username");
                this.LblPass.setText("Password");
            }
        }
        //perintah tombol
        if(ex.getSource()==btnPendaftaran){
            isiForm daftar=new isiForm();
            daftar.window.setVisible(true);
            window.setVisible(false);
        }else if(ex.getSource()==btnPengecekan){
//            pengecekan cek=new Pengecekan();
//            cek.window.setVisible(true);
        }else if(ex.getSource()==btnPengaduan){
//            pengaduan adu=new pengaduan();
//            adu.window.setVisible(true);
        }else if(ex.getSource()==btnInformasi){
//            informasi info=new informasi();
//            info.window.setVisible(true);
        }else if(ex.getSource()==btnExit){
            System.exit(1);
        }else if(ex.getSource()==btnLogin){
            String user="admin";
            String pass="admin";
            if(user.equalsIgnoreCase(TxtUser.getText()) && pass.equalsIgnoreCase(TxtPass.getText())){
                menuAdmin admin=new menuAdmin();
                admin.window.setVisible(true);
                window.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Kombinasi username danpassword salah");
            }
        }
    }
}