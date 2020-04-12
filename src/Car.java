public class Car {
    String name;
    int modelNumber;
    public Car(String name, int modelNumber){
        this.name=name;
        this.modelNumber=modelNumber;
    }
    @Override
    public boolean equals(Object o){
        if (this==o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        Car car =(Car) o;
        return name==car.name;
    }
}
