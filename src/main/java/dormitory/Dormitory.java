package dormitory;

import dormitory.room.Room;
import dormitory.room.factory.RoomFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dormitory {
    private List<Room> rooms;


    public Dormitory(Map<String, RoomFactory> roomTypes) {
        rooms = new ArrayList<>();

        roomTypes.forEach((roomNumber, roomFactory) -> rooms.add(roomFactory.create(roomNumber)));
    }

    //some methods here...
}
