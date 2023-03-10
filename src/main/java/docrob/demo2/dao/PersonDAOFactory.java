package docrob.demo2.dao;

public class PersonDAOFactory {
    private static PersonListDAO personDAO = null;

    public static PersonListDAO getPersonDAO() {
        if(personDAO == null) {
            personDAO = new PersonListDAO();
        }
        return personDAO;
    }
}
