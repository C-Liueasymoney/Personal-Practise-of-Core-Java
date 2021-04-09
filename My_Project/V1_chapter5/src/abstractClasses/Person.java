package abstractClasses;

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
