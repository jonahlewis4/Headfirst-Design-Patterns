public class DB {
    static void initializeDatabase() {
        //do nothing
    }
    static PersonBean getPersonFromDatabase(String name) {
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setGender("man");

        return person;
    }
}
