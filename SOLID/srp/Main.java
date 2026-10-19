class Main{
    public static void main(String[] args){
        Invoice invoice = new Invoice(1000);
        double val=invoice.calculate();
        InvoiceRepository.saveInvoice(val);
        InvoicePrinter.PrintInvoice(val);
    }
}