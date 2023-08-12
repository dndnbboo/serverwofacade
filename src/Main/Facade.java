/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import serverwofacade.ServerWOFacade;

// 64050075

/**
 *
 * @author User
 */
public class Facade {
    public static void main(String[] args){
        ServerWOFacade server=new ServerWOFacade();
        server.startServer();
        server.stopServer();
    }
}
