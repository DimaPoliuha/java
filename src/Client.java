public class Client {

    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private String comment;
    private String groups;
    private String homePhone;
    private String firstMobilePhone;
    private String secondMobilePhone;
    private String email;
    private String skype;
    private Adress adress;
    private Date registrationDate;
    private Date dateOfChange;

    public Client(String surname, String name, String patronymic, String nickname, String comment, String groups, String homePhone, String firstMobilePhone, String secondMobilePhone, String email, String skype, Adress adress, Date creationDate, Date dateOfChange) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.comment = comment;
        this.groups = groups;
        this.homePhone = homePhone;
        this.firstMobilePhone = firstMobilePhone;
        this.secondMobilePhone = secondMobilePhone;
        this.email = email;
        this.skype = skype;
        this.adress = adress;
        this.registrationDate = creationDate;
        this.dateOfChange = dateOfChange;
    }


}
