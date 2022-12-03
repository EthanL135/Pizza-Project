public class TotalCost {
    public float total;
    public float subtotal;
    public float tax;

    public void orderTotal(){
        //adds size price to subtotal
        if(Order.pizzaSize != null){
            switch (Order.pizzaSize){
                case "Personal":
                    subtotal += 7.99;
                    break;
                case "Small":
                    subtotal += 10.99;
                    break;
                case "Medium":
                    subtotal += 14.99;
                    break;
                case "Large":
                    subtotal += 19.99;
                    break;
            }
        }

        //adds crust type to subtotal
        if(Order.crustType != null){
            switch (Order.crustType){
                case "regular":
                case "thin":
                    subtotal += 0.25;
                    break;
                case "thick":
                    subtotal += 0.50;
                    break;
                case "cheese":
                    subtotal += 1.00;
                    break;
            }
        }

        //adds toppings price to subtotal
        addToppingPrice(Order.pizzaTopping1);
        addToppingPrice(Order.pizzaTopping2);
        addToppingPrice(Order.pizzaTopping3);
        addToppingPrice(Order.pizzaTopping4);

        //adds beverage price to subtotal
        if(Order.beverage1 != null){
            subtotal += 3.00;
        }
        if(Order.beverage2 != null){
            subtotal += 3.00;
        }
        if(Order.beverage3 != null){
            subtotal += 3.00;
        }

        //adds beverage size price to subtotal
        addBeverageSizePrice(Order.beverageSize1);
        addBeverageSizePrice(Order.beverageSize2);
        addBeverageSizePrice(Order.beverageSize3);

        //calculates tax then sets total to tax + subtotal
        tax = subtotal * 0.10f;
        total = subtotal + tax;
    }

    //calculates topping price
    public void addToppingPrice(String s){
        if(s != null){
            switch(s){
                case "pepperoni":
                case "mushrooms":
                case "olives":
                case "onions":
                case "peppers":
                case "spinach":
                    subtotal += 0.50;
                    break;
                case "sausage":
                case "ham":
                case "chicken":
                case "bacon":
                    subtotal += 1.00;
                    break;
            }
        }
    }

    //adds beverage size price to subtotal
    public void addBeverageSizePrice(String s){
        if(s != null){
            switch (s){
                case "8 oz.":
                    subtotal += 1.00;
                    break;
                case "12 oz.":
                    subtotal += 2.00;
                    break;
                case "16 oz.":
                    subtotal += 3.00;
                    break;
            }
        }
    }
}
