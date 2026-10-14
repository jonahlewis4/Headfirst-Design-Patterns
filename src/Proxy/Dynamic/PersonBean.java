import java.lang.reflect.Proxy;

public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getElo();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setElo(int elo);

    static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
}
