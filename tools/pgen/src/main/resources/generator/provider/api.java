/*
 * Distribution Statement
 * 
 * This computer software has been developed under sponsorship of the United States Air Force Research Lab. Any further
 * distribution or use by anyone or any data contained therein, unless otherwise specifically provided for,
 * is prohibited without the written approval of AFRL/RQVC-MSTC, 2210 8th Street Bldg 146, Room 218, WPAFB, OH  45433
 * 
 * Disclaimer
 * 
 * This material was prepared as an account of work sponsored by an agency of the United States Government. Neither
 * the United States Government nor the United States Air Force, nor any of their employees, makes any warranty,
 * express or implied, or assumes any legal liability or responsibility for the accuracy, completeness, or usefulness
 * of any information, apparatus, product, or process disclosed, or represents that its use would not infringe privately
 * owned rights.
 */
package $packageName;

import java.rmi.Remote;
import java.rmi.RemoteException;

import sorcer.service.Context;

/**
 * Provides context on how to invoke the $name provider
 *
 * @author Generated by SORCER Project Generator
 */
public interface $interfaceName extends Remote {

    /**
     * Generic execute method for the {@code $name} provider
     *
     * @param context The context to pass, must not be {@code null}.
     * @return The processed {@code Context}.
     * @throws RemoteException if there are communication issues or network failures.
     */
    Context execute(Context context) throws RemoteException;
}