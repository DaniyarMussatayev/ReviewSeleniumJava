package com.review.class04;

import com.utils.CommonMethods;

public class AdvancedXpathRecap extends CommonMethods {
	/* We may be able to locate page objects with any of locators including xpath
	 * What will be our solution? --> Advanced xpath 
	 *  What is idea of using advanced xpath?
	 *  1. Use parent/child or sibling relations between the tags
	 *  2. Find a unique locator for parent/child or sibling tags
	 *  3. Access requested object by using relationship
	 */
	
	/* if parent tag has unique indetification
	 * parentXpath/childTag
	 * 
	 */
	
	public static void main(String[] args) {
		
		setUp("chrome", SyntaxPrctice_URL);
		
		/* if parent tag has unique indetification
		 * parentXpath/childTag
		 */
		String xpath="//div[@id='navbar-brand-centered']/ul[1]/li[1]/a";
		
		/* If immediate child has unique indetification
		 * childXpath/..
		 */
		String xpath1="//span[text()='Toggle navigation']/../..";
		
		/* if next element has unique identification
		 * nextElementXpath/preceding-sibling::tagName
		 */
		
		String xpath2 = "//div[@id='content']/preceding-sibling::div[1]";
		
		/* if previous element has unique identification 
		 * previousElementXpath/following-sibling::tagName
		 */
		String xpath3 = "//div[@id='mainMenu']/following-sibling::div";

	}

}
