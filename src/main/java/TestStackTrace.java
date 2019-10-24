public class TestStackTrace {
    TestStackTrace(){
        divideByZero();
    }
    int divideByZero(){
        return 52/0;
    }

//    public static void main(String[] args) {
//        TestStackTrace test = new TestStackTrace();
//    }
}
