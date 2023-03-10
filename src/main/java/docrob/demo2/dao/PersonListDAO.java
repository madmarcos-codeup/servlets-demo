package docrob.demo2.dao;

import docrob.demo2.models.Person;

import java.util.ArrayList;
import java.util.List;

/*
this dao works with Person objects
in memory in an arraylist
 */
public class PersonListDAO {
    private final ArrayList<Person> people;

    public PersonListDAO() {
        people = new ArrayList<>();

        // plug some starter people into the db
        initData();
    }

    public List<Person> all() {
        return people;
    }

    /*
    insert the given person into the arraylist (in-memory db)
     */
    public void insert(Person person) {
        people.add(person);
    }

    private void initData() {
        Person person = new Person();
        person.setName("bob");
        person.setAge(20);
        people.add(person);

        person = new Person();
        person.setName("sue");
        person.setAge(35);
        people.add(person);

        person = new Person();
        person.setName("tom");
        person.setAge(75);
        people.add(person);
    }
}
