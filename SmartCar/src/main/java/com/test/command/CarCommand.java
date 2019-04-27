package com.test.command;


import com.test.car.Car;

/**
 * 车的功能接口
 * @author Benson
 * @date 2019-04-26
 */
@FunctionalInterface
public interface CarCommand {

    Car command(Car car);
}
