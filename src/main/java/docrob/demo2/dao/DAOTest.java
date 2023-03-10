package docrob.demo2.dao;

import docrob.demo2.models.Person;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        PersonListDAO personDao = PersonDAOFactory.getPersonDAO();
        List<Person> people = personDao.all();
        System.out.println(people);

        personDao.insert(new Person("sally", 40));
        System.out.println(personDao.all());
    }
}
