import java.io.ObjectInputFilter.Status;

class Chef{
    public void cookFood(String dish){
        System.out.println(dish + " are being prepared");
    }
}

class RoomCleaner{
    public void cleanRoom(int roomId){
        System.out.println(roomId +" room is cleaned");
    }
}

class Luggage{
    public void carryLuggage(int roomId){
         System.out.println(roomId+" no is luggage");
    }
}

class HotelKeeper{
    public static void roomService(String dishes){
        Chef chef = new Chef();
        chef.cookFood(dishes);
    }

    public static void cleanService(int roomId){
        RoomCleaner roomCleaner = new RoomCleaner();
        roomCleaner.cleanRoom(roomId);
    }
    public static void roomLuggage(int roomId){
        Luggage luggage = new Luggage();
        luggage.carryLuggage(roomId);
    }
}
public class Facade {
    public static void main(String[] args) {
        HotelKeeper  hotelKeeper = new HotelKeeper();
        hotelKeeper.roomLuggage(10);
        hotelKeeper.cleanService(10);
        hotelKeeper.roomLuggage(10);
    }
}
