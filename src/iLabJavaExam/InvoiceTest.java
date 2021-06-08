package iLabJavaExam;

public class InvoiceTest {
    public static void main(String []args){
        Invoice invoice = new Invoice("Hummer", "Slash hummer 24 pounds", 2, 2.50); // create an invoice

        invoice.setQuantity(-10); // setting the quantity to negative, it should remain unchanged
        System.out.println("Amount of your invoice is " + invoice.getInvoiceAmount());

        invoice.setPricePerItem(55.00); // setting the pricePerItem to negative, it should remain unchanged
        System.out.println("Amount of your invoice is " + invoice.getInvoiceAmount());
    }
}
