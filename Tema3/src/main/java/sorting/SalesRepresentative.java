package sorting;

public class SalesRepresentative {
    String name;
    int salesNumber;
    int saleQuota;

    /**
     * This constructor creates the sales representatives objects.
     * @param name the name of the sales representative
     * @param salesNumber the number of sales that will determine the revenue made by the sales representative
     * @param saleQuota the sale quota that will determine the revenue made by the sales representative
     */
    public SalesRepresentative (String name, int salesNumber, int saleQuota){
        this.name = name;
        this.salesNumber = salesNumber;
        this.saleQuota = saleQuota;
    }
}
