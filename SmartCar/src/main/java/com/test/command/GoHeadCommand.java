package com.test.command;

import com.test.car.Car;
import com.test.direction.Direction;
import com.test.parking.ParkingLot;

/**
 * @author: knight
 * @Date: 2019-04-26 21:56
 */
public class GoHeadCommand implements CarCommand {
    @Override
    public Car command(Car car) {

        String orientation = car.getOrientation();
        ParkingLot parkingLot = car.getParkingLot();
        int x = car.getPositionX();
        int y = car.getPositionY();
        // 在停车场边缘表示不能移动
        if (x == 1) {
            if (Direction.WEST.getDirectionName().equals(orientation)) {
                throw new RuntimeException("direction error");
            }
        }
        // 在停车场边缘表示不能移动
        if (x == parkingLot.getX()) {
            if (Direction.EAST.getDirectionName().equals(orientation)) {
                throw new RuntimeException("direction error");
            }
        }
        // 在停车场边缘表示不能移动
        if (y == 1) {
            if (Direction.SOUTH.getDirectionName().equals(orientation)) {
                throw new RuntimeException("direction error");
            }
        }
        // 在停车场边缘表示不能移动
        if (y == parkingLot.getY()) {
            if (Direction.NORTH.getDirectionName().equals(orientation)) {
                throw new RuntimeException("direction error");
            }
        }


        if (Direction.EAST.getDirectionName().equals(orientation)) {
            car.setPosition(car.getPositionX()+1,car.getPositionY());
        }
        if (Direction.WEST.getDirectionName().equals(orientation)) {
            car.setPosition(car.getPositionX()-1,car.getPositionY());
        }

        if (Direction.NORTH.getDirectionName().equals(orientation)) {
            car.setPosition(car.getPositionX(),car.getPositionY()+1);
        }
        if (Direction.SOUTH.getDirectionName().equals(orientation)) {
            car.setPosition(car.getPositionX(),car.getPositionY()-1);
        }
        return car;
    }
}
