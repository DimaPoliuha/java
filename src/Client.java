public class Client {

    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private String homePhone;
    private String mobilePhone;
    private String email;
    private String skype;
    private Adress adress;
    private String registrationDate;
    private String dateOfChange;

    public Client(){}

    public Client(String surname, String name, String patronymic, String nickname, String homePhone, String mobilePhone, String email, String skype, Adress adress, String registrationDate, String dateOfChange) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.skype = skype;
        this.adress = adress;
        this.registrationDate = registrationDate;
        this.dateOfChange = dateOfChange;
    }

    public Client(Client client) {
        this.surname = client.surname;
        this.name = client.name;
        this.patronymic = client.patronymic;
        this.nickname = client.nickname;
        this.homePhone = client.homePhone;
        this.mobilePhone = client.mobilePhone;
        this.email = client.email;
        this.skype = client.skype;
        this.adress = client.adress;
        this.registrationDate = client.registrationDate;
        this.dateOfChange = client.dateOfChange;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getIndex() {
        return adress.getIndex();
    }

    public String getCity() {
        return adress.getCity();
    }

    public String getStreet() {
        return adress.getStreet();
    }

    public String getHouseNumber() {
        return adress.getHouseNumber();
    }

    public String getFletNumber() {
        return adress.getFletNumber();
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getDateOfChange() {
        return dateOfChange;
    }

    public void setDateOfChange(String dateOfChange) {
        this.dateOfChange = dateOfChange;
    }
}
