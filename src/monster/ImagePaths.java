/**
 * 
 */
package monster;

/**
 * @author jonas
 *
 */
public class ImagePaths {
	
	
	String mainImageFront;
	String mainImageBack;
	
	public ImagePaths(String mainImageFront, String mainImageBack) {
		
		this.mainImageFront = mainImageFront;
		this.mainImageBack = mainImageBack;
		
	}

	/**
	 * @return the mainImageFront
	 */
	public String getMainImageFront() {
		return mainImageFront;
	}

	/**
	 * @param mainImageFront the mainImageFront to set
	 */
	public void setMainImageFront(String mainImageFront) {
		this.mainImageFront = mainImageFront;
	}

	/**
	 * @return the mainImageBack
	 */
	public String getMainImageBack() {
		return mainImageBack;
	}

	/**
	 * @param mainImageBack the mainImageBack to set
	 */
	public void setMainImageBack(String mainImageBack) {
		this.mainImageBack = mainImageBack;
	}

}
