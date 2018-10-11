public class Main {
    public static void main(String[] args) {

        Clock bigBlackClock = new Clock();

        for(int i = 0; i < 100000; i++){
            bigBlackClock.timeTick();
            System.out.println(bigBlackClock.getTime());

        }

    }
}
