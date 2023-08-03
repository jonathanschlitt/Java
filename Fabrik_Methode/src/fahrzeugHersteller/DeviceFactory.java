package fahrzeugHersteller;

public interface DeviceFactory {
    public Device createRadio();

    public Device createCD();

    public Device createUSB();
}
