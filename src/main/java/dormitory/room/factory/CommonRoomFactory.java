package dormitory.room.factory;

import dormitory.overhaul.CommonOverhaul;
import dormitory.room.Room;

public final class CommonRoomFactory implements RoomFactory {
    @Override
    public Room create(String roomNumber) {
        return new Room(roomNumber, new CommonOverhaul());
    }
}
