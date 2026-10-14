public class PersonBeanImpl implements PersonBean{
    String name;
    String gender;
    String interests;
    int elo;
    int eloCount = 0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getElo() {
        return eloCount == 0 ? 0 : elo / eloCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setElo(int elo) {
        this.elo += elo;
        eloCount++;
    }
}
