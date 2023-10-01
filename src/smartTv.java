import java.util.Scanner;

public class smartTv {
    Integer tvChannel = 5;
    Integer tvVolume = 25;
    Boolean tvPower = true;

    public void turnOn() {
        tvPower = true;
        System.out.println("TV Power: " + tvPower);
    }

    public void turnOff() {
        tvPower = false;
        System.out.println("TV Power: " + tvPower);
    }

    public void increaseChannel() {
        tvChannel++;
        System.out.println("TV Channel: " + tvChannel);
    }

    public void decreaseChannel() {
        tvChannel--;
        System.out.println("TV Channel: " + tvChannel);
    }

    public void increaseVolume() {
        tvVolume++;
        System.out.println("TV Volume: " + tvVolume);
    }

    public void decreaseVolume() {
        tvVolume--;
        System.out.println("TV Volume: " + tvVolume);
    }

    public String setChannel(Integer channel) {
        try (Scanner tvChannel = new Scanner(System.in)) {
            System.out.println("Enter channel: ");
            channel = tvChannel.nextInt();
        }
        System.out.println("The new channel is: " + channel);
        return null;
    }

}