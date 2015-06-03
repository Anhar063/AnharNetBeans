import java.io.*;

import javax.swing.JOptionPane;


public class ReadWrite {



public void simpanKondisi(JumlahKondisidanPosisiSarana dat){
try {
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datakondisi.dat"));
oos.writeObject(dat);
oos.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex);
}

}

public JumlahKondisidanPosisiSarana bacaKondisi(){
JumlahKondisidanPosisiSarana dat=null;

try {
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datakondisi.dat"));
dat = (JumlahKondisidanPosisiSarana)ois.readObject();
ois.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex);
}

return dat;
} 

public void simpanBersih(KebersihanRuangKelas dat){
try {
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("databersih.dat"));
oos.writeObject(dat);
oos.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex);
}

}

public KebersihanRuangKelas bacaBersih(){
KebersihanRuangKelas dat=null;

try {
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("databersih.dat"));
dat = (KebersihanRuangKelas)ois.readObject();
ois.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex);
}

return dat;
} 

public void simpanKeamanan(KeamananRuangKelas dat){
try {
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datakeamanan.dat"));
oos.writeObject(dat);
oos.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex);
}

}

public KeamananRuangKelas bacaKeamanan(){
KeamananRuangKelas dat=null;

try {
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datakeamanan.dat"));
dat = (KeamananRuangKelas)ois.readObject();
ois.close();
} catch (Exception ex) {
JOptionPane.showMessageDialog(null, ex);
}

return dat;
} 
}
