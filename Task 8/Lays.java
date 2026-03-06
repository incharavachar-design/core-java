class Lays
{

static String ingredients[]={
"Potatoes","Vegetable Oil","Sunflower Oil","Salt","Sugar",
"Spices and Seasoning","Onion Powder","Garlic Powder","Milk Solids","Flavour"
};

public static void main(String args[])
{
getIngredients();
}

static void getIngredients()
{
System.out.println("List of Lays ingredients are:");
for(String ingredient : ingredients)
{
System.out.println(ingredient);
}
}

}