package edu.neu.csye6200;
import java.util.Comparator;

public class LibraryItem extends AbstractLibraryMaterialAPI  implements Comparable<LibraryItem>, Comparator<AbstractLibraryMaterialAPI>{
	public int Id;
	public String Title;
	public String Author;
	public String Category;
	public String Subject;
	public String Isbn;
	public double Price;

	public LibraryItem(String str) {
		String [] tokens = str.split(",");
			Id = Integer.parseInt(tokens[0]);
			Category = tokens[1];
			Title = tokens[2];
			Author = tokens[3];
			Subject= tokens[4];
			Isbn = tokens[5];
			Price = Double.parseDouble(tokens[6]);	
		
	}

	public LibraryItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getId() {
		return Id;
	}

	@Override
	public String getTitle() {
		return Title;
	}

	@Override
	public String getAuthor() {
		return Author;
	}

	@Override
	public String getCategory() {
		return Category;
	}

	@Override
	public String getSubject() {
		return Subject;
	}

	@Override
	public String getIsbn() {
		return Isbn;
	}

	@Override
	public double getPrice() {
		return Price;
	}


	@Override
	public String toString() {
		return "LibraryItem [Id=" + Id + ", Title=" + Title + ", Author=" + Author + ", Category=" + Category
				+ ", Subject=" + Subject + ", Isbn=" + Isbn + ", Price=" + Price + "]";
	}
	
	// Default order by TITLE
	
	@Override
	public int compareTo(LibraryItem o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
	/** Implement Comparator interface to specify a SPECIFIC Sort Order *  
	 *  @param o1      first AbstractLibraryMaterialAPI object to compare 
	 *  @param o2      second AbstractLibraryMaterialAPI object to compare
	 *  @return        integer metric */

	public int compare(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	/** * CompareById implements the Comparator's compare method  
	 * FOR ANOTHER SPECIFIC ORDER for sort (SORT BY CATEGORY) *  
	 * @param o1      first AbstractLibraryMaterialAPI object to compare 
	 * @param o2      second AbstractLibraryMaterialAPI object to compare 
	 * @return        integer metric */

//	public int compareByCategory(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
//		// TODO Auto-generated method stub
//		return o1.getCategory().compareTo(o2.getCategory());
//	}
	
	/** * CompareById implements the Comparator's compare method  
	 * FOR ANOTHER SPECIFIC ORDER for sort (SORT BY AUTHOR) *  
	 * @param o1      first AbstractLibraryMaterialAPI object to compare 
	 * @param o2      second AbstractLibraryMaterialAPI object to compare 
	 * @return        integer metric */
	
//	public int compareByAuthor(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
//		return o1.getAuthor().compareTo(o2.getAuthor());
//	}
	
	/** * CompareById implements the Comparator's compare method  
	 * FOR ANOTHER SPECIFIC ORDER for sort (SORT BY SUBJECT) *  
	 * @param o1      first AbstractLibraryMaterialAPI object to compare 
	 * @param o2      second AbstractLibraryMaterialAPI object to compare 
	 * @return        integer metric */
	
//	public int compareBySubject(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
//		return o1.getSubject().compareTo(o2.getSubject());
//
//	}
	
	/** * CompareById implements the Comparator's compare method  
	 * FOR ANOTHER SPECIFIC ORDER for sort (SORT BY ISBN) *  
	 * @param o1      first AbstractLibraryMaterialAPI object to compare 
	 * @param o2      second AbstractLibraryMaterialAPI object to compare 
	 * @return        integer metric */
//	public int compareByIsbn(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
//		return o1.getIsbn().compareTo(o2.getIsbn());
//	}
	
	/** * CompareById implements the Comparator's compare method  
	 * FOR ANOTHER SPECIFIC ORDER for sort (SORT BY PRICE) *  
	 * @param o1      first AbstractLibraryMaterialAPI object to compare 
	 * @param o2      second AbstractLibraryMaterialAPI object to compare 
	 * @return        integer metric */
//	public int compareByPrice(AbstractLibraryMaterialAPI o1, AbstractLibraryMaterialAPI o2) {
//		return Double.compare(o1.getPrice(), o2.getPrice());
//	}
}