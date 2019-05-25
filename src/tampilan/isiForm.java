package tampilan;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class isiForm extends atribut implements ActionListener{
    atribut atribut=new atribut();
    public isiForm(){
        komponen();
        inputData();
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
    
    private void komponen(){
        atribut.tombolExit();
        btnExit.addActionListener(this);
    }
    
    private void inputData(){
        window.add(lblNama);
        window.add(lblNIK);
        window.add(lblAlamat);
        window.add(lblTmpLahir);
        window.add(lblTglLahir);
        window.add(lblPekerjaan);
        window.add(lblStatus);
        window.add(lblAyah);
        window.add(lblIbu);
        window.add(lbljk);
        
        window.add(txtNama);
        window.add(txtNIK);
        window.add(txtAlamat);
        window.add(txtTmpLahir);
        window.add(tglTglLahir);
        window.add(cbjk);
        window.add(cbPekerjaan);
        window.add(cbStatus);
        window.add(txtAyah);
        window.add(txtIbu);
        window.add(btnExit);
        window.add(btnEnter);
        
        lblNama.setBounds(145, 150, 100, 30);
        lblNIK.setBounds(145, 185, 100, 30);
        lblAlamat.setBounds(145, 220, 100, 90);
        lblTmpLahir.setBounds(145, 315, 100, 30);
        lblTglLahir.setBounds(145, 350, 100, 30);
        lbljk.setBounds(145, 385, 100, 30);
        lblPekerjaan.setBounds(145, 420, 100, 30);
        lblStatus.setBounds(145, 455, 100, 30);
        
        txtNama.setBounds(275, 150, 300, 30);
        txtNIK.setBounds(275, 185, 300, 30);
        txtAlamat.setBounds(275, 220, 300, 90);
        txtAlamat.setBackground(new java.awt.Color(182, 225, 225));
        txtTmpLahir.setBounds(275, 315, 300, 30);
        tglTglLahir.setBounds(275, 350, 300, 30);
        cbjk.setBounds(275, 385, 300, 30);
        cbPekerjaan.setBounds(275, 420, 300, 30);
        cbStatus.setBounds(275, 455, 300, 30);
        btnEnter.setBounds(455, 490, 120, 30);
        
        txtNama.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        txtNIK.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        txtAlamat.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        txtTmpLahir.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        tglTglLahir.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        cbjk.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        cbPekerjaan.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        cbStatus.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        
        lblNama.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lblNIK.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lblAlamat.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lblTmpLahir.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lblTglLahir.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lbljk.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lblPekerjaan.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        lblStatus.setFont(new java.awt.Font("Segoe UI semilight", 0, 16));
        
        //memanggil atribut exit
        atribut atribut=new atribut();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnExit){
            System.exit(1);
        }
    }
}