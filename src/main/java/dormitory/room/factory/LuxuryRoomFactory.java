package dormitory.room.factory;

import dormitory.overhaul.LuxuryOverhaul;
import dormitory.room.Room;

public final class LuxuryRoomFactory implements RoomFactory {
    @Override
    public Room create(String roomNumber) {
        return new Room(roomNumber, new LuxuryOverhaul());
    }
}
