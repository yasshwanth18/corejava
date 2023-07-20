 class cake{
	static void tasty(String name,String type,String bakeryName,float price,int noOfPieces,String Ocassion)
	{
		System.out.println("Involking tasty from cake");
		System.out.println("\n");
		
		System.out.println("cake name"+name);
		System.out.println("cake type"+type);
		System.out.println("bakeryName"+bakeryName);
		System.out.println("cake price"+price);
		System.out.println("noOfPiece"+noOfPieces);
		System.out.println("Ocassion"+Ocassion);
		
		
		if(name!=null)
		{
			System.out.println("cake name is Valid");
			
		}
		else
		{
			System.err.println("cake name is invalid");
			return;
		}
		if(type!=null)
		{
			System.out.println("type name is valid");
			
		}
		else
		{
			System.err.println("type name is invalid");
			return;
		}
		if(bakeryName!=null)
		{
			System.out.println("bakeryName name is valid");
			
		}
		else
		{
			System.err.println("bakeryName name is invalid");
			return;	
		}
		if(price>0 && price<60)
		{
			System.out.println("price name is valid");
			
		}
		else
		{
			System.err.println("price name is invalid");
			return;
		}
		if(noOfPieces>0 && noOfPieces<=20)
		{
			System.out.println("noOfPieces name is valid");
			
		}
		else
		{
			System.err.println("noOfPieces name is invalid");
			return;
		}
		if(Ocassion!=null)
		{
			System.out.println("ocassion name is valid");
			
		}
		else
		{
			System.err.println("ocassion name is invalid");
			return;
		}
	}


	public static void main(String[] args){
		
		cake.tasty("chocolate cake","Egg cake", "aishwarya Bakery", 25, 6, "party");
	}