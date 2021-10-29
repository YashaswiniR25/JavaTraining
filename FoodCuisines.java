package com.Hierarchial;

 class FoodCuisines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Chinese r = new Chinese();
			r.useIngredients();
			r.useVegetables();
			r.serverNoodles();
			
			System.out.println("----------------");
			
			Mexican m=new Mexican();
			m.useIngredients();
			m.useVegetables();
			m.severNachosandPasta();
		
			System.out.println("----------------");
			
			Italian i=new Italian();
			i.useIngredients();
			i.useVegetables();
			i.servesPasta();
	}

}
