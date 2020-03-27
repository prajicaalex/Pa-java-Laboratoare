/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author calan
 */
public class InvalidPath extends  Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPath(String path)
	{
		super("Calea "+path+" nu exista");		
	}

}
