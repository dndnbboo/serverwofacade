/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// 64050075

package serverwofacade;
public class ServerWOFacade {
    public void startServer(){
        ScheduleServer start = new ScheduleServer();
        start.startBooting();
	start.readSystemConfigFile();
	start.init();
	start.initializeContext();
	start.initializeListeners();
	start.createSystemObjects();
        System.out.println("Start working......");
    }
    public void stopServer(){
        ScheduleServer stop = new ScheduleServer();
        System.out.println("After work done.........");
	stop.releaseProcesses();
	stop.destory();
	stop.destroySystemObjects();
	stop.destoryListeners();
	stop.destoryContext();
	stop.shutdown();
    }
}
