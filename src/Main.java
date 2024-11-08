import java.util.TreeSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<Person> newSet = new TreeSet<>();
        newSet.add(new Person("Anne", 20));
        newSet.add(new Person("Bob", 30));
        newSet.add(new Person("John", 40));
        newSet.add(new Person("Cathy", 65));
        newSet.add(new Person("Dan", 61));
        for (Person person : newSet) {
            if(person.getAge()>60)
                System.out.println(person);
        }
    }
}