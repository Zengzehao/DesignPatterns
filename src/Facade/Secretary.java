package Facade;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Secretary {
    private Chauffeur chauffeur = new Chauffeur();
    private Restaurant restaurant = new Restaurant();
    private Airport airport = new Airport();
    private Hotel hotel = new Hotel();

    //安排出差
    public void trip(String to,int days){
        airport.bookTicket("青岛",to);
        chauffeur.drive("机场");
        hotel.reserve(days);
    }

    //安排饭局
    public void repast(int num){
        restaurant.reserve(num);
        chauffeur.drive("酒店");
    }
}
