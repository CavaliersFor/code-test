package com.test;

import com.test.car.SmartCar;
import com.test.command.ClockwiseCommand;
import com.test.command.GoHeadCommand;
import com.test.direction.Direction;
import com.test.parking.ParkingLot;

/**
 * 车的性能测试类
 * @author Benson
 * @date 2019-04-26
 */
public class TestCar {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(4,4);
        String directionName = Direction.NORTH.getDirectionName();
        int x =1;
        int y = 1;
        SmartCar smartCar = new SmartCar(x, y, parkingLot, directionName);
        smartCar.move(new ClockwiseCommand());
        smartCar.move(new GoHeadCommand());
        smartCar.move(new GoHeadCommand());
        smartCar.move(new GoHeadCommand());
        smartCar.move(new ClockwiseCommand());
        smartCar.move(new ClockwiseCommand());
        smartCar.move(new GoHeadCommand());
        smartCar.move(new ClockwiseCommand());
        smartCar.move(new GoHeadCommand());
        String orientation = smartCar.getOrientation();
        System.out.println(directionName+"顺时针转向后的方位:"+orientation);
        System.out.printf("移动后的位置x:%s,y:%s",smartCar.getPositionX(),smartCar.getPositionY());


    }
}
