package com.test.direction;

/**
 * 方位类
 *
 * @author Benson
 * @date 2019-04-26 21:36
 */
public class Direction {

    private static final String DIRECTION_NORTH = "北";
    private static final String DIRECTION_EAST = "东";
    private static final String DIRECTION_SOUTH = "南";
    private static final String DIRECTION_WEST = "西";

    public static Direction NORTH = new Direction("北", "东");
    public static Direction EAST = new Direction("东", "南");
    public static Direction SOUTH = new Direction("南", "西");
    public static Direction WEST = new Direction("西", "北");

    /**
     * 当前方位
     */
    private String directionName;
    /**
     * 顺时针下一个方位
     */
    private String nextDirectionName;

    public Direction(String directionName, String nextDirectionName) {
        this.directionName = directionName;
        this.nextDirectionName = nextDirectionName;
    }

    public String getDirectionName() {
        return directionName;
    }

    public static Direction nextDirection(String directionName) {
        switch (directionName) {
            case DIRECTION_NORTH:
                return EAST;
            case DIRECTION_EAST:
                return SOUTH;
            case DIRECTION_SOUTH:
                return WEST;
            case DIRECTION_WEST:
                return NORTH;
            default:
                return null;
        }
    }


}
