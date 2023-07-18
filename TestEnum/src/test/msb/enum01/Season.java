package test.msb.enum01;

/**
 * @author: Adam
 * @date: 2023/7/6 - 16:28
 * @description: test.msb.enum01
 * @version: 1.0
 */
public class Season {
    //定义属性
    private final String seasonName;//季节名字
    private final String SeasonDesc;//季节描述

    //利用构造器对属性进行赋值操作
    //构造器私有化，外界不能调用这个构造器，只能season内部自己调用
    private Season(String seasonName,String SeasonDesc){
        this.seasonName = seasonName;
        this.SeasonDesc = SeasonDesc;
    }
    //提供枚举类的有限的对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","烈日炎炎");
    public static final Season AUTUMN = new Season("秋天","硕果累累");
    public static final Season WINTER = new Season("冬天","冰天雪地");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    //toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
