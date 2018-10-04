/*
 * File: FacePamphletServer.java
 * ------------------------------
 * This program runs a server which hosts the data for a 
 * FacePamphlet internet application. The server stores all 
 * of the data and contains the logic for creating, deleting 
 * profiles and getting and setting profile properties. When 
 * the server receives a requests (which often come from the 
 * client), it updates its internal data, and sends back a string. 
 */

import java.util.*;
import acm.program.*;

public class FacePamphletServer extends ConsoleProgram 
					implements SimpleServerListener {
	
	/* The internet port to listen to requests on */
	private static final int PORT = 8000;
	
	/* The server object. All you need to do is start it */
	private SimpleServer server = new SimpleServer(this, PORT);

	/**
	 * Starts the server running so that when a program sends
	 * a request to this computer, the method requestMade is
	 * called.
	 */
	public void run() {
		println("Starting server on port " + PORT);
		server.start();
	}

	/**
	 * When a request is sent to this computer, this method is
	 * called. It must return a String.
	 */
	public String requestMade(Request request) {
		String cmd = request.getCommand();
		println(request.toString());
		
		// your code here. 
		
		return "Error: Unknown command " + cmd + ".";
	}

}
