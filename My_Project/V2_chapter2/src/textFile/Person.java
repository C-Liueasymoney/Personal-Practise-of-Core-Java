package textFile;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/3/23 5:31 下午
 */
public abstract class Person {
    public abstract String getDescription();
    protected String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
