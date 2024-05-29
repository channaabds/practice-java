package inheritance;

 public class Planet {

 private String bentuk = "Bulat";
 private double keliling = 10000.00;

 protected void rotasi(){
 System.out.println("Rotasi Planet");
 }

 public boolean atmosfer(){
 return true;
 }

 public String getBentuk() {
 return bentuk;
 }

 public double getKeliling() {
 return keliling;
 }

}