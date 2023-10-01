public class tvUser {
    public static void main(String[] args) {
        smartTv smartTv = new smartTv();

        System.out.println("TV Power: " + smartTv.tvPower);
        System.out.println("TV Channel: " + smartTv.tvChannel);
        System.out.println("TV Volume: " + smartTv.tvVolume);

        smartTv.turnOn();
        smartTv.turnOff();
        smartTv.increaseChannel();
        smartTv.decreaseChannel();
        smartTv.increaseVolume();
        smartTv.decreaseVolume();
        smartTv.setChannel(5);
        smartTv.increaseVolume();
    }
}
