package fahrzeugHersteller;

import cdZulieferer.CD;
import radioZulieferer.Radio;
import usbZulieferer.UsbPlayer;

public class FactoryForDevices implements DeviceFactory {

  @Override
  public Radio createRadio() {
    return new Radio();
  }

  @Override
  public CD createCD() {
    return new CD();
  }

  @Override
  public UsbPlayer createUSB() {
    return new UsbPlayer();
  }
}
