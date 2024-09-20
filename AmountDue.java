package runamountdue;

public class AmountDue {

    static double tax = 0.12;
    static double Discount;
    
    public static double computeAmountDue(double price){
        return price + (price * tax);
    }
    public static double computeAmountDue(double price, int quantity){
        double totalquantity = price*quantity;
        return totalquantity + (totalquantity*tax);
    }
    public static double computeAmountDue(double price, int quantity, double Discount) {
        double totalprice = price*quantity;
        double totaldisc = totalprice - Discount;
        double totaltax = totaldisc*tax;
        return totaltax + totaldisc;
    }
}
