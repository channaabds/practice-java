public class Machine {
    public void go(){
        System.out.println("I must be going!");
    }

    public void go(int x) {
        System.out.println("Hi there! - your number is " + x);
        go();
    }
}

