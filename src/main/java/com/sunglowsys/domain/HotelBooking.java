package com.sunglowsys.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "Hotel_booking_1")
public class HotelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String checkInDate;
    @NotNull
    private String checkOutDate;
    private Integer totalGuest;
    private Integer noOfNight;

    @NotNull
    private Integer noOfRooms;
    private float bookingAmount;
    private Long hotelId;
    private Long customerId;
    private Long roomTypeId;
    private Long ratePlanId;

    public HotelBooking() {}

    public HotelBooking(String checkInDate, String checkOutDate, Integer totalGuest, Integer noOfNight, Integer noOfRooms, float bookingAmount, Long hotelId, Long customerId, Long roomTypeId, Long ratePlanId) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalGuest = totalGuest;
        this.noOfNight = noOfNight;
        this.noOfRooms = noOfRooms;
        this.bookingAmount = bookingAmount;
        this.hotelId = hotelId;
        this.customerId = customerId;
        this.roomTypeId = roomTypeId;
        this.ratePlanId = ratePlanId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getTotalGuest() {
        return totalGuest;
    }

    public void setTotalGuest(Integer totalGuest) {
        this.totalGuest = totalGuest;
    }

    public Integer getNoOfNight() {
        return noOfNight;
    }

    public void setNoOfNight(Integer noOfNight) {
        this.noOfNight = noOfNight;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public float getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(float bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Long getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelBooking that = (HotelBooking) o;
        return Float.compare(that.bookingAmount, bookingAmount) == 0 && Objects.equals(id, that.id) && Objects.equals(checkInDate, that.checkInDate) && Objects.equals(checkOutDate, that.checkOutDate) && Objects.equals(totalGuest, that.totalGuest) && Objects.equals(noOfNight, that.noOfNight) && Objects.equals(noOfRooms, that.noOfRooms) && Objects.equals(hotelId, that.hotelId) && Objects.equals(customerId, that.customerId) && Objects.equals(roomTypeId, that.roomTypeId) && Objects.equals(ratePlanId, that.ratePlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkInDate, checkOutDate, totalGuest, noOfNight, noOfRooms, bookingAmount, hotelId, customerId, roomTypeId, ratePlanId);
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "id=" + id +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                ", totalGuest=" + totalGuest +
                ", noOfNight=" + noOfNight +
                ", noOfRooms=" + noOfRooms +
                ", bookingAmount=" + bookingAmount +
                ", hotelId=" + hotelId +
                ", customerId=" + customerId +
                ", roomTypeId=" + roomTypeId +
                ", ratePlanId=" + ratePlanId +
                '}';
    }
}