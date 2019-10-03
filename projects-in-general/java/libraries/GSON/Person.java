
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Person 
{
    private String name;
    private int age;
    private List<String> cars;

    public Person()
    {

    }

    public Person(String name, int age, List<String> cars)
    {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public List<String> getCars()
    {
        return this.cars;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setCars(List<String> cars)
    {
        this.cars = cars;
    }

    private String getCarsString()
    {
        String str = this.cars.size() > 0 ? "" : "nothing the nothing";
        for(String st: this.cars)
            str = String.format("%s %s", str, st);
        return str;
    }

    @Override
    public String toString()
    {
        return String.format("Name: %s, Age: %d, Cars: %s", this.name, this.age, this.getCarsString());
    }

    public static void printAllPerson(List<Person> l)
    {
        for(Person p: l)
            System.out.println(p.toString());
    }

    public static void readFromStringANdToStringAnObject()
    {
        String info = "{'name': 'John', 'age': 30, 'cars': ['Ford', 'BMW', 'Fiat']}";
        Gson gson = new Gson();
        Person p = new Person("Borego", 34, Arrays.asList("Ford", "Fiat"));
        String json = gson.toJson(p);
        System.out.println(json);
        p = gson.fromJson(info, Person.class);
        System.out.println(p.toString());
    }

    public static void readFromStringAList()
    {
        String info = "[{'name': 'Borego', 'age': 34, 'cars': ['Ford', 'Fiat']}, {'name': 'Ivan', 'age': 21, 'cars': ['Ford', 'Fiat']}]";
        Gson gson = new Gson();
        Type l = new TypeToken<List<Person>>() {}.getType();
        printAllPerson(gson.fromJson(info, l));
    }

    public static void main(String[] args)
    {
        readFromStringAList();
    }

}
