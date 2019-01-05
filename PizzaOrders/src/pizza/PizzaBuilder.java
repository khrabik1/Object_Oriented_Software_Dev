package pizza;


import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements IPizzaBuilder {
	List<String> theseToppings = new ArrayList<String>();
	String thisSize;
	
	
    @Override
    public void addTopping(String topping) {
    	
    	theseToppings.add(topping);
    }

    @Override
    public void setSize(String size) {
        thisSize = size;
    }

    @Override
    public Pizza getPizza() {
    	
    	Pizza thisPizza = new Pizza(thisSize, theseToppings);
    	return thisPizza;
       
    }
}

