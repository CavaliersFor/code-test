package com.test.car;

import com.test.parking.ParkingLot;
import com.test.command.CarCommand;

/**
 * 智能车
 * @author Benson
 * @date 2019-4-26
 */
public class SmartCar implements Car {

    private ParkingLot parkingLot;

    private String orientation;
    private int x;
    private int y;


    public SmartCar(int x, int y, ParkingLot parkingLot, String orientation) {
        this.x = x;
        this.y = y;
        this.parkingLot = parkingLot;
        this.orientation = orientation;
    }

    @Override
    public void move(CarCommand carCommand) {
        carCommand.command(this);
    }

    @Override
    public int getPositionX() {
        return x;
    }

    @Override
    public int getPositionY() {
        return y;
    }

    @Override
    public String getOrientation() {
        return orientation;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    @Override
    public ParkingLot getParkingLot() {
        return parkingLot;
    }


}
