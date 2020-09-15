package edu.neu.csye6200;
import java.util.List;
import java.util.ArrayList;

import java.util.Comparator;
// class Library derived from AbstractStoreAPI.
public class Library extends AbstractStoreAPI{
	
	List<AbstractLibraryMaterialAPI> items = new ArrayList<>();
	
	@Override
	public void add(AbstractLibraryMaterialAPI e) {
		this.items.add(e);		
	}

	@Override
	public void sortInventory() {
		items.sort(null);
	}

	@Override
	public void sortInventory(Comparator<AbstractLibraryMaterialAPI> c) {
		this.items.sort(c);
	}

	@Override
	public void showInventory() {
		for(AbstractLibraryMaterialAPI yow: items) {
			System.out.println(yow); 	// call toString()
		}				
	}
	

	
	public static void demo() {
		 System.out.println("\n\t" + Library.class.getName() + ".demo()...");
		
		Library obj = new Library();
	   // Add items to library *        
		obj.add(new LibraryItem("3,DVD,Java Easy,Adam Peterson,Science,212-217237711-7,7.49"));
		obj.add(new LibraryItem("1,BOOK,My Chosen Career,Daniel Peters,Non-Fiction,212-217237718-7,2.49")); 
		obj.add(new LibraryItem("2,CD,Born Free,Sam Jones,Non-Fiction,212-217237713-7,11.49"));
		//*Display items in Library with no sorting.
		System.out.println("\n\tWithout sorting\n");
		obj.showInventory();
		
		//Display items in Library with sorting by TITLE--> Default sorting, by Comparable Interface
		System.out.println("\n\tSort inventory by item TITLE\n"); 
		obj.sortInventory();
		obj.showInventory();
		
		//Display items in Library with sorting by ID
		System.out.println("\n\tSort inventory by item ID\n");
		obj.sortInventory(new LibraryItem());
		obj.showInventory();
		
		//Display items in Library with sorting by CATEGORY
		System.out.println("\n\tSort inventory by item CATEGORY\n");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getId));
		obj.showInventory();
		
		//Display items in Library with sorting by AUTHOR
		System.out.println("\n\tSort inventory by item AUTHOR\n");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getAuthor));
		obj.showInventory();
		
		//Display items in Library with sorting by SUBJECT
		System.out.println("\n\tSort inventory by item SUBJECT\n");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getSubject));
		obj.showInventory();
		
		//Display items in Library with sorting by ISBN
		System.out.println("\n\tSort inventory by item ISBN\n");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getIsbn));
		obj.showInventory();
		
		//Display items in Library with sorting by PRICE
		System.out.println("\n\tSort inventory by item PRICE\n");
		obj.sortInventory(Comparator.comparing(AbstractLibraryMaterialAPI::getPrice));
		obj.showInventory();
		
		
	}

}
