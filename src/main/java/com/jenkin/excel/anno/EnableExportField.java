package com.jenkin.excel.anno;


import com.jenkin.excel.enums.ColorEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 设置该字段允许导出
 * 并且可以设置宽度 
 * 以及设置下拉列表字段的key 用来匹配对应的label导出
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableExportField {
     //宽度
     int colWidth() default  100;
     //标题名称
     String colName();
     //设置get方法
     String useGetMethod() default "";
     //设置背景颜色
     ColorEnum cellColor() default ColorEnum.BLUE;
}
