package inheritance;

 public class Bumi extends Planet, Satelit{
 double diameter = 12756;
 double keliling = 40070.017;

 public void rotasi(String arah){
 System.out.println("Rotasi Bumi :" + arah);
 }

 public double getKeliling() {
 return "Kelilingnya adalah : " + keliling;
 }

 @Override
 public boolean atmosfer() {
 return false;
 }

 public static void main(String[] args) {

 Bumi earth = new Bumi();
 Bumi bumi = new Bumi("Tempat Tinggal");

 earth.rotasi();
 System.out.println("Keliling = " + earth.keliling);
 System.out.println("Apakah memiliki atmosfer : " +
 earth.atmosfer());
 earth.rotasi("Searah Jarum Jam");

 }

 }
