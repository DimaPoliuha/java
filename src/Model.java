public class Model {
    private Client client = new Client();

    // The Program logic

    public void setSurname(String surname) {
        client.setSurname(surname);
    }

    public void setName(String name) {
        client.setName(name);
    }

    public void setPatronymic(String patronymic) {
        client.setPatronymic(patronymic);
    }

    public void setNickname(String nickname) {
        client.setNickname(nickname);
    }

    public void setHomePhone(String homePhone) {
        client.setHomePhone(homePhone);
    }

    public void setMobilePhone(String mobilePhone) {
        client.setMobilePhone(mobilePhone);
    }

    public void setEmail(String email) {
        client.setEmail(email);
    }

    public void setSkype(String skype) {
        client.setSkype(skype);
    }

    public void setAdress(Adress adress) {
        client.setAdress(adress);
    }

    public void setRegistrationDate(String registrationDate) {
        client.setRegistrationDate(registrationDate);
    }

    public void setDateOfChange(String dateOfChange) {
        client.setDateOfChange(dateOfChange);
    }



    public String getSurname() {
        return client.getSurname();
    }

    public String getName() {
        return client.getName();
    }

    public String getPatronymic() {
        return client.getPatronymic();
    }

    public String getNickname() {
        return client.getNickname();
    }

    public String getHomePhone() {
        return client.getHomePhone();
    }

    public String getMobilePhone() {
        return client.getMobilePhone();
    }

    public String getEmail() {
        return client.getEmail();
    }

    public String getSkype() {
        return client.getSkype();
    }

    public Adress getAdress() {
        return client.getAdress();
    }

    public String getIndex() {
        return client.getIndex();
    }

    public String getCity() {
        return client.getCity();
    }

    public String getStreet() {
        return client.getStreet();
    }

    public String getHouseNumber() {
        return client.getHouseNumber();
    }

    public String getFletNumber() {
        return client.getFletNumber();
    }

    public String getRegistrationDate() {
        return client.getRegistrationDate();
    }

    public String getDateOfChange() {
        return client.getDateOfChange();
    }
}
