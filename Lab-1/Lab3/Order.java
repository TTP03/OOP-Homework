public class Order{

    public static final int MAX_NUMBER_OEDERED = 10;

    private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBER_OEDERED];
    private int qtyOrdered = 0;
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered<=9){
            itemsOrder[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else System.out.println("The order is almost full");
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        boolean check = false;
        for (int i=0; i<=qtyOrdered; i++){
            if (itemsOrder[i] == disc) {
                itemsOrder[i] = null;
                qtyOrdered--;
                check = true;
            }
            if (check) {
                DigitalVideoDisc temp;
                temp = itemsOrder[i];
                itemsOrder[i] = itemsOrder[i+1];
                itemsOrder[i+1] = temp;
            }
        }
    }
    public float totalCost(){
        float total = 0;
        for ( int i=0;i<=qtyOrdered;i++){
            total+=itemsOrder[i].getCost();
        }
        return total;
    }
}