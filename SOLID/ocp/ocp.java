interface InvoiceCalculator{
    double CalculateInvoiceAmount(double amount);
}

class IndianInvoiceCalculator implements InvoiceCalculator{
    private final double tax=0.18;
    @Override
    public double CalculateInvoiceAmount(double amount){
        return amount + amount * tax;
    }
}

class USInvoiceCalculator implements InvoiceCalculator{
    private final double tax=0.08;
    @Override
    public double CalculateInvoiceAmount(double amount){
        return amount + amount * tax;
    }
}

class UKInvoiceCalculator implements InvoiceCalculator{
    private final double tax=0.10;
    @Override
    public double CalculateInvoiceAmount(double amount){
        return amount + amount * tax;
    }
}

class Invoice{
    private double amount;
    private InvoiceCalculator invoicecalculator;

    Invoice(double amount, InvoiceCalculator invoicecalculator){
        this.amount=amount;
        this.invoicecalculator=invoicecalculator;
    }

    public double getAmount(){
        return invoicecalculator.CalculateInvoiceAmount(amount);
    }
}