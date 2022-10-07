public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinOps bins = new BinOps();
        System.out.println(bins.sum("11", "100")); //3+4=7, в двоичной 11+100=111
        System.out.println(bins.mult("11", "100")); //3*4=12, в двоичной 11*100=1100

    }
}