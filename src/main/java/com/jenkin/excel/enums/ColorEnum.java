package com.jenkin.excel.enums;

import org.apache.poi.hssf.util.HSSFColor;

public enum ColorEnum {
    RED("红色", HSSFColor.RED.index),
    GREEN("绿色", HSSFColor.GREEN.index),
    BLANK("白色", HSSFColor.WHITE.index),
    YELLOW("黄色", HSSFColor.YELLOW.index),
    BLUE("蓝色", HSSFColor.CORNFLOWER_BLUE.index);
    private String name;
    private short index;
    private ColorEnum( String name, short index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getIndex() {
        return index;
    }

    public void setIndex(short index) {
        this.index = index;
    }

}
