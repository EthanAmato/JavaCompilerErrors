
public class CompilerErrors {

	static int returnNumber() { //This method must return a result of type int
		int myFavoriteNumber = 10;
		String author = "Mark Twain";
		//return author; //Type mismatch: cannot convert from String to int
		return myFavoriteNumber;
	}
	
	public static void main(String[] args) {
		System.out.print(fakeVariable); //fakeVariable cannot be resolved to a variable
		
		String favoriteNumber = 4; //Type mismatch: cannot convert from int to String
		
		let javascriptInitiation = 10; //let cannot be resolved to a type
		int javascriptInitiation = 10; /*Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
											Syntax error, insert ";" to complete BlockStatements
											let cannot be resolved*/
		
		favoriteFakeVar; //favoriteFakeVar cannot be resolved
		let favoriteFakeVar; //let cannot be resolved to a type
		
		fakeFunction(); //The method fakeFunction() is undefined for the type CompilerErrors
		
		System.out.print(Integer.parseInt(returnNumber()+"Test")); //Exception in thread "main" java.lang.NumberFormatException: For input string: "10Test"
		Date myDate = new Date(); //Date cannot be resolved to a type
		
		Int x = 10; //Int cannot be resolved to a type
		int x = 10;
		system.out.print(x); 		//system cannot be resolved
		System.out.print(x; 		//Syntax error, insert ")" to complete Expression
		
		if (x==10) {
			System.out.print("it's 10"); //Syntax error, insert "}" to complete ClassBody
			
		int noSemi = 10 //Syntax error, insert ";" to complete LocalVariableDeclarationStatement
		
		int x = 20; //Duplicate local variable x
		
		byte ruleBreaking = 500; //Type mismatch: cannot convert from int to byte
		
		
		final int inchesInFoot = 12; //The final local variable inchesInFoot cannot be assigned. It must be blank and not using a compound assignment
		inchesInFoot = 13;
	}

}
