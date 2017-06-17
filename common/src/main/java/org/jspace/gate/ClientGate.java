/**
 * 
 * jSpace: a Java Framework for Programming Concurrent and Distributed Applications with Spaces
 * 
 * http://pspace.github.io/jSpace/	
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * 
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Alberto Lluch Lafuente
 *      Michele Loreti
 *      Francesco Terrosi
 */
package org.jspace.gate;

import java.io.IOException;
import java.net.UnknownHostException;

import org.jspace.protocol.ClientMessage;
import org.jspace.protocol.ServerMessage;

/**
 * This interface 
 */
public interface ClientGate {
	
	public void open() throws UnknownHostException, IOException;
	
	public ServerMessage send( ClientMessage m ) throws UnknownHostException, IOException;
	
	public void close() throws IOException;

}
