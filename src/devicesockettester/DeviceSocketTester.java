/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicesockettester;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ceyha
 */
public class DeviceSocketTester {
    private static InetAddress deviceIP;
    private static int devicePort;
    private static int serverPort;
    
    void packetTester(byte[] sendPacket, byte[] receivePacket){
        
    }
    
    public static boolean takeDevice(){
        String userInputStr;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Cihaz IP:");
        userInputStr = userInput.nextLine();
        try{
            deviceIP = InetAddress.getByName(userInputStr);
        }
        catch(UnknownHostException ex){
            System.out.println("Gecersiz IP adresi");
            return false;
        }
        
        System.out.print("Cihaz Port:");
        userInputStr = userInput.nextLine();
        try{
            devicePort = Integer.parseInt(userInputStr);
        }
        catch(NumberFormatException ex){
            System.out.println("Gecersiz cihaz port");
            return false;
        }
        
        System.out.print("Server Port:");
        userInputStr = userInput.nextLine();
        try{
            serverPort = Integer.parseInt(userInputStr);
        }
        catch(NumberFormatException ex){
            System.out.println("Gecersiz server port");
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(takeDevice() == false){
            
        }
    }
    
}
