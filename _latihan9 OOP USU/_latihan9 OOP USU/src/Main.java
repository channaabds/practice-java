public class Main {

    public static void main(String[] args) {

        class MyExeption extends Exception {
            private static int accno[] = {1001,1002,1003,1004};

            private static String name[] = {"Nish","Shuhh","Sush","Abhi","Akash"};

            private static double bal[] = {10000.00,12000.00,5600.00,999.00,1100.55};

            MyExeption(){} 
            
            // parametrized condtructer
            MyExeption(String str){super(str);}

            public static void main(String[] args) {
                try {
                    // display the heading for the table
                    System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "Ballance");
                    
                    // display the avtual account information
                    for (int i = 0; i < 5; i++){
                        System.out.println(accno[i] + "\t" + name[i] + "\t" +bal[i]);
                        
                        if (bal[i] < 100){
                            if (bal[i] < 1000){
                                MyExeption me = new MyExeption("Ballance is less than 1009") throw me;
                            }
                        }
                    } catch Object MyExeptio;
                    (MyExeptio e);
                    e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
