package Tugas;

import javax.swing.*;
import java.awt.event.*;

public class BiodataMahasiswa extends JFrame
{
    
JLabel lblnpm=new JLabel("NPM ");
JTextField txnpm=new JTextField(20);
JLabel lblnama=new JLabel("Nama ");
JTextField txnama=new JTextField(20);
JLabel lbltanggallahir=new JLabel("Tanggal Lahir ");
JTextField txtanggallahir=new JTextField(20);
JLabel lbljeniskelamin=new JLabel("Jenis kelamin");
JRadioButton lakilaki=new JRadioButton("Laki-laki");
JRadioButton perempuan=new JRadioButton("Perempuan");
ButtonGroup grupjeniskelamin=new ButtonGroup(); 
JLabel lblhobi=new JLabel("Hobi ");
JTextField txhobi=new JTextField(20);
JLabel lblalamat=new JLabel("Alamat ");
JTextField txalamat=new JTextField(20);
JLabel lblprodi=new JLabel("Prodi");
String[] jenisprodi={"FTI","FEKON","FKM","FISIP","FATEK"};
JComboBox cbprodi=new JComboBox(jenisprodi);
JLabel lblstatus=new JLabel("Status, Isi data tidak boleh ada yang kosong");


JLabel hobi=new JLabel("Hobi");
JCheckBox baca=new JCheckBox("Membaca");
JCheckBox mancing=new JCheckBox("Memancing");
JCheckBox jalan=new JCheckBox("Jalan-Jalan"); 
JButton tblcari=new JButton ("Cari");
JButton tbltambah=new JButton ("Tambah");
JButton tblhapus=new JButton ("Hapus");
JButton tblexit=new JButton ("Exit");
JButton tblcetak=new JButton ("Cetak");
JTextArea hasil=new JTextArea();


BiodataMahasiswa()

 {
 setTitle("BIODATA MAHASISWA UNISKA");
 setLocation(520,100);
 setSize(340,580);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 void komponenVisual()
 {
 getContentPane().setLayout(null);
 getContentPane().add(lblnpm);
 lblnpm.setBounds(10,10,70,20);
 getContentPane().add(txnpm);
 txnpm.setBounds(120,10,115,20);
 getContentPane().add(lblnama);
 lblnama.setBounds(10,40,70,20);
 getContentPane().add(txnama);
 txnama.setBounds(120,40,180,20);
 getContentPane().add(lbltanggallahir);
 lbltanggallahir.setBounds(10,70,90,20);
 getContentPane().add(txtanggallahir);
 txtanggallahir.setBounds(120,70,180,20);
 getContentPane().add(lbljeniskelamin);
 lbljeniskelamin.setBounds(10,100,90,20);
 getContentPane().add(lakilaki);
 lakilaki.setBounds(115,100,150,20);
 getContentPane().add(perempuan);
 perempuan.setBounds(115,120,150,20);
 grupjeniskelamin.add(lakilaki);
 grupjeniskelamin.add(perempuan);
 getContentPane().add(lblhobi);
 lblhobi.setBounds(10,60,100,20);
 getContentPane().add(txhobi);   
 lblhobi.setBounds(10,60,70,210);
 getContentPane().add(lblalamat);
 lblalamat.setBounds(10,230,110,20);
 getContentPane().add(txalamat);
 txalamat.setBounds(120,230,180,40);
 getContentPane().add(lblprodi);
 lblprodi.setBounds(10,280,90,20);
 getContentPane().add(cbprodi);
 cbprodi.setBounds(120,280,110,20);
 getContentPane().add(lblstatus);
 lblstatus.setBounds(10,540,300,20);
  
 
    getContentPane().add(baca);
    baca.setBounds(118,150,100,20);
    getContentPane().add(mancing);
    mancing.setBounds(118,170,100,20);
    getContentPane().add(jalan);
    jalan.setBounds(118,190,100,20); 
    
    getContentPane().add(tblcari);
    tblcari.setBounds(240,10,60,20);
    getContentPane().add(tbltambah);
    tbltambah.setBounds(10,330,90,20);
    getContentPane().add(tblhapus);
    tblhapus.setBounds(110,330,90,20);
    getContentPane().add(tblexit);
    tblexit.setBounds(210,330,90,20);
    getContentPane().add(tblcetak);
    tblcetak.setBounds(10,360,290,20);
    getContentPane().add(hasil);
    hasil.setBounds(10,390,290,120);
    
 setVisible(true);
 }
 void AksiReaksi()
 {
 tblcetak.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent e)
 {
 hasil.append(txnpm.getText()+"\n");
 hasil.append(txnama.getText()+"\n");
 hasil.append(txtanggallahir.getText()+"\n");
 if(lakilaki.isSelected()==true)
 {
 hasil.append(lakilaki.getText()+"\n");
 }
 else
 {
 hasil.append(perempuan.getText()+"\n");
 }
 if(baca.isSelected()==true)
 
     hasil.append(baca.getText()+"\n");
 {
  if(mancing.isSelected()==true)
      
    hasil.append(mancing.getText()+"\n");
    { 
   if(jalan.isSelected()==true)
       
    hasil.append(jalan.getText()+"\n");
    }
 hasil.append(txalamat.getText()+"\n");
 hasil.append(cbprodi.getSelectedItem()+"\n");
    }
    } 
 });
 }
 public static void main(String args[]){
  BiodataMahasiswa bm=new BiodataMahasiswa();
  bm.komponenVisual();
  bm.AksiReaksi();
    }
}