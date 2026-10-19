class Invoice{
    private double amount;
    private double tax=0.18;
    Invoice(double amount){
        this.amount=amount;
        this.tax=tax;
    }
    double calculate(){
        return amount+amount*tax;
    }
}

class InvoiceRepository{
    public static void saveInvoice(double amount){
        System.out.println(amount+ "saved into database");
        //other logics
    }
}

class InvoicePrinter{
    public static void PrintInvoice(double amount){
        System.out.println("Here's your invoice of rupees= "+ amount);
    }
}