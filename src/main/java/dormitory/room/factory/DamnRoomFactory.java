package dormitory.room.factory;

import dormitory.overhaul.DamnOverhaul;
import dormitory.room.Room;

public final class DamnRoomFactory implements RoomFactory {
    @Override
    public Room create(String roomNumber) {
        return new Room(roomNumber, new DamnOverhaul());
    }
}
