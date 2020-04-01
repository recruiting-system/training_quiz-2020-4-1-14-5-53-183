package entity;

public class Ticket {
  private String parkingLotId;
  private int parkingSpaceId;

  public Ticket(String parkingLotId, int parkingSpaceId) {
    this.parkingLotId = parkingLotId;
    this.parkingSpaceId = parkingSpaceId;
  }

  public String getParkingLotId() {
    return this.parkingLotId;
  }

  public int getParkingSpaceId() {
    return parkingSpaceId;
  }
}
