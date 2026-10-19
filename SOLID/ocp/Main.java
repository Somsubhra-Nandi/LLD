class Main{
    public static void main(String[] args){
        double amount=1000;

        Invoice invoice1 = new Invoice(amount,new IndianInvoiceCalculator());
        System.out.println(invoice1.getAmount());

        Invoice invoice2 = new Invoice(amount,new USInvoiceCalculator());
        System.out.println(invoice2.getAmount());

        Invoice invoice3 = new Invoice(amount,new UKInvoiceCalculator());
        System.out.println(invoice3.getAmount());
    }
}