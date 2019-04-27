package com.test.command;

import com.test.car.Car;
import com.test.direction.Direction;

import java.util.Optional;

/**
 * 汽车顺时针转动功能
 *
 * @author Benson
 * @date 2019-04-26
 */
public class ClockwiseCommand implements CarCommand {
    @Override
    public Car command(Car car) {
        String orientation = car.getOrientation();
        Direction direction = Direction.nextDirection(orientation);
        Optional.ofNullable(direction).ifPresent(direction1 -> car.setOrientation(direction.getDirectionName()));
        return car;
    }
}
