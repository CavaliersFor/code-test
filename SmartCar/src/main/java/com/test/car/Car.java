package com.test.car;

import com.test.parking.ParkingLot;
import com.test.command.CarCommand;

/**
 * 车接口
 * @author Benson
 * @date 2019-4-26
 */
public interface Car {

    void move(CarCommand carCommand);

    int getPositionX();

    int getPositionY();

    String getOrientation();

    void setPosition(int x,int y);

    void setOrientation(String orientation);

    ParkingLot getParkingLot();
}
