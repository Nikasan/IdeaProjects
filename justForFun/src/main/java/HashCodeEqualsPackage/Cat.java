package HashCodeEqualsPackage;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + this.age;
    }

    @Override
    public boolean equals(Object o){
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }
       Cat o1 = (Cat) o;
        return (this.name.equals(o1.name)) && (this.age == o1.age);

    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31*result+age;
        result=31*result+(name!=null ? name.hashCode() : 0);
        return result;
    }



}