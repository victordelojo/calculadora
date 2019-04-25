/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bluetooth;

import java.io.IOException;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;

/**
 *
 * @author Martin
 */
public class Bluetooth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LocalDevice device = LocalDevice.getLocalDevice();
        RemoteDevice[] remotedevice = device.getDiscoveryAgent().retrieveDevices(DiscoveryAgent.PREKNOWN);
        for (RemoteDevice i:remotedevice){
            System.out.println("Nombre: "+i.getFriendlyName(false));
            System.out.println("Dirección: "+i.getBluetoothAddress());
        }
    }
    
}
