package dormitory.room.factory;

import dormitory.room.Room;

public interface RoomFactory {
    Room create(String roomNumber);
}
