package java8_guide_for_beginners_shildt.io;

public class WriteByte {
    public static void main(String[] args) {
        int by = '1';//create int
        int be = 'F';

        System.out.print("be : ");
        System.out.println(be);
        System.out.write('\n');

        System.out.print("by : ");
        System.out.println(by);
        System.out.print("by : ");
        System.out.println((char) by);
        System.out.print("by output via write() : ");
        System.out.write(by);//output char

        System.out.write('\n');
    }
}
