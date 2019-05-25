package tampilan;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import javax.swing.*;

public class atribut extends setHalaman{
    JLabel gambar=new JLabel();
    JLabel gambar2=new JLabel();
    
    //Atribut Menu Utama
    JButton btnPendaftaran=new JButton("Pendaftaran");
    JButton btnPengecekan=new JButton("Pengecekan");
    JButton btnPengaduan=new JButton("Pengaduan");
    JButton btnInformasi=new JButton("Informasi");
    JButton mata=new JButton("");
    
    JPanel panelLogin=new JPanel();
    JLabel LblUser=new JLabel("Username");
    JLabel LblPass=new JLabel("Password");
    
    JTextField TxtUser=new JTextField(null);
    JPasswordField TxtPass=new JPasswordField();
    String[] isiAkun={"-pilih login-","Admin","Masyarakat"};
    JComboBox akun=new JComboBox(isiAkun);
    
    //Atribut Biodata
    JLabel lblNama=new JLabel("*Nama");
    JLabel lblNIK=new JLabel("*NIK");
    JLabel lblAlamat=new JLabel("*Alamat");
    JLabel lblTmpLahir=new JLabel("*Tempat Lahir");
    JLabel lblTglLahir=new JLabel("*Tanggal Lahir");
    JLabel lblPekerjaan=new JLabel("*Pekerjaan");
    JLabel lblStatus=new JLabel("*Status");
    JLabel lblAyah=new JLabel("*Nama Ayah");
    JLabel lblIbu=new JLabel("*Nama Ibu");
    JLabel lbljk=new JLabel("*Jenis Kelamin");

    JTextField txtNama=new JTextField();
    JTextField txtNIK=new JTextField();
    JTextArea txtAlamat=new JTextArea();
    JTextField txtTmpLahir=new JTextField();
    
    JDateChooser tglTglLahir=new JDateChooser();
    String[] isiJk={
        "-Jenis Kelamin-", "Laki-laki", "Perempuan"
    };
    JComboBox cbjk=new JComboBox(isiJk);
    
    String[] isiPekerjaan={
        "-pekerjaan-","PNS","TNI","POLRI","Swasta","Mahasiswa"
    };
    JComboBox cbPekerjaan=new JComboBox(isiPekerjaan);
    
    String[] isiStatus={
        "-Status-","Menikah","Belum Menikah"
    };
    JComboBox cbStatus=new JComboBox(isiStatus);
    JTextField txtAyah=new JTextField();
    JTextField txtIbu=new JTextField();
    
    //atribut tombol
    JButton btnEnter=new JButton("Enter");
    JButton btnLogin=new JButton("Login");
    
    public atribut(){
        tombolExit();
    }
    
    public void tombolExit(){
        btnExit.setBounds(1316, 20, 30, 30);
        btnExit.setBorder(null);
        btnExit.setBackground(new java.awt.Color(32,151,206));
        btnExit.setIcon(new ImageIcon(getClass().getResource("gambar/freeExit.png")));
    }
}