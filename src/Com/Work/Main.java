package Com.Work;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println("i am ravi kant");
//            Main1 A= new Main2();
//            A.Test();

        Main B = new Main() {
            @Override
            public void Test1 () {
                System.out.println("this is my fiest anonimous class");

            }
        };
        B.Test1();
        MyInter i1=new MyInter() {
            @Override
            public void Test1() {
                System.out.println("hay me ravi");
            }
        };
        i1.Test1();
    }

    public abstract void Test1();
}