public class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Person pers){
        return this.name.compareTo(pers.name);
    }
    @Override
    public boolean equals(Object obj){
        if ( !(obj instanceof Person)) return false;
        Person otherPerson = (Person) obj;
        return this.name.equals(otherPerson.name)  && this.age == otherPerson.age;
    }
    @Override
    public int hashCode(){
        return name.hashCode();
    }
    @Override
    public String toString(){
        return "Person: "+name+", age: "+age;
    }
}
