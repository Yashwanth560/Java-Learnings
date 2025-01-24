class Room {
    int roomNumber;
    String roomType;
    boolean isAvailable;
    double pricePerNight;

    public Room(int roomNumber, String roomType, boolean isAvailable, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.pricePerNight = pricePerNight;
    }

    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " booked successfully!");
        } else {
            System.out.println("Room " + roomNumber + " is already booked.");
        }
    }

    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber + ", Type: " + roomType + ", Price: $" + pricePerNight +
                ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

class Hotel {
    List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable) {
                room.displayRoomDetails();
            }
        }
    }

    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.roomNumber == roomNumber) {
                room.bookRoom();
                return;
            }
        }
        System.out.println("Room not found.");
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.addRoom(new Room(101, "Single", true, 100));
        hotel.addRoom(new Room(102, "Double", true, 150));
        hotel.addRoom(new Room(103, "Suite", true, 300));

        hotel.displayAvailableRooms();
        hotel.bookRoom(102);
        hotel.displayAvailableRooms();
    }
}
