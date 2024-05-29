class A {
    public void foo (Object o){
        System.out.println("A");
    }
}

class B {
    public void foo (String o){
        System.out.println("B");
    }
}

class C extends A {
    public void foo (String s) {System.out.println("C");    }
}

class D extends B {
    public void foo (Object o){System.out.println("D");}
}

class Main {
    public static void main(String[] args) {
        A a = new C(); a.foo("Java");
        C c = new C(); c.foo("Java");
        B b = new D(); b.foo("Java");
        D d = new D(); a.foo("Java");
    }
}
