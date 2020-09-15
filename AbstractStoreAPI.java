package edu.neu.csye6200;

import java.util.Comparator;

public abstract class AbstractStoreAPI {
	/** * Add one AbstractLibraryMaterial object to the library * 
	 *  * @param e      
	 *   AbstractLibraryMaterial object */
	public abstract void add(AbstractLibraryMaterialAPI e);
	
	/** * Sort all items in the library by default Natural Order */
	public abstract void sortInventory();
	
	/** * Sort all items in the library by specific Order specified by the supplied Comparator */
	public abstract void sortInventory(Comparator<AbstractLibraryMaterialAPI> c);
	
	/** * Show all items in library */
	public abstract void showInventory();
	
}
