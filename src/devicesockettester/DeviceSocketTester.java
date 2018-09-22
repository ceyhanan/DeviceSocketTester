/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devicesockettester;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ceyha
 */
public class DeviceSocketTester {
    private static InetAddress deviceIP;
    private static int devicePort;
    private static int serverPort;
    private static DatagramSocket serverSocket;
    
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
    
    public static boolean openSocket(){
        try {
            serverSocket = new DatagramSocket(serverPort);
            return true;
        } catch (SocketException ex) {
            System.out.println("Server soket olusturulamadi! -> " + ex);
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(takeDevice() == false){
            
        }
        if(openSocket() == false)
            System.exit(-1);
        
    }
}
