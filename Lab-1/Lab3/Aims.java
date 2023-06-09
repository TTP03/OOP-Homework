public class Aims {

    public static void main(String[] args){
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvd1.setCost(19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        dvd2.setCost(24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        dvd3.setCost(18.99f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        System.out.print(" Total cost is: ");
        System.out.println(anOrder.totalCost());
    }
}