// RemoteControl Abstraction
interface RemoteControl {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void volumeUp();
    void volumeDown(); // fixed typo: voumeDown -> volumeDown
}

// Device Implementation
interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void volumeUp();
    void volumeDown(); // fixed typo
}

// Bridge: Abstract RemoteControl Implementation
abstract class AbstractRemoteControl implements RemoteControl {
    protected Device device;

    public AbstractRemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.powerOn();
    }

    public void powerOff() {
        device.powerOff();
    }

    public void setChannel(int channel) {
        device.setChannel(channel);
    }

    public void volumeUp() {
        device.volumeUp();
    }

    public void volumeDown() {
        device.volumeDown();
    }
}

// Concrete RemoteControl (can add more features)
class ConcreteRemoteControl extends AbstractRemoteControl {
    public ConcreteRemoteControl(Device device) {
        super(device);
    }

    // You can add extra methods like mute(), nextChannel(), etc.
}

// Concrete Device: SonyTV
class SonyTV implements Device {
    public void powerOn() {
        System.out.println("Sony TV powered ON");
    }

    public void powerOff() {
        System.out.println("Sony TV powered OFF");
    }

    public void setChannel(int channel) {
        System.out.println("Sony TV channel set to " + channel);
    }

    public void volumeUp() {
        System.out.println("Sony TV volume increased");
    }

    public void volumeDown() {
        System.out.println("Sony TV volume decreased");
    }
}

// Concrete Device: PhilipsDVDPlayer
class PhilipsDVDPlayer implements Device {
    public void powerOn() {
        System.out.println("Philips DVD Player powered ON");
    }

    public void powerOff() {
        System.out.println("Philips DVD Player powered OFF");
    }

    public void setChannel(int channel) {
        System.out.println("Philips DVD channel set to track " + channel);
    }

    public void volumeUp() {
        System.out.println("Philips DVD volume increased");
    }

    public void volumeDown() {
        System.out.println("Philips DVD volume decreased");
    }
}

// Main
public class bridge {
    public static void main(String[] args) {
        Device sonyTV = new SonyTV();
        RemoteControl remoteControl1 = new ConcreteRemoteControl(sonyTV);
        remoteControl1.powerOn();
        remoteControl1.setChannel(5);
        remoteControl1.volumeUp();

        System.out.println();

        Device philipsDVDPlayer = new PhilipsDVDPlayer();
        RemoteControl remoteControl2 = new ConcreteRemoteControl(philipsDVDPlayer);
        remoteControl2.powerOn();
        remoteControl2.setChannel(3);
        remoteControl2.volumeUp();
    }
}
