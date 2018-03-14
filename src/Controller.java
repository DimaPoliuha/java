import java.util.Scanner;

public class Controller {

    // The Regex
    // «nick@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    // «+38(044)555-55-55»
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    // «Petya»
    public static final String REGEX_NAME = "^[A-Z]{1}[a-z]{1,10}$";
    // «Pushlin»
    public static final String REGEX_SURNAME = "^[A-Z]{1}[a-z]{1,10}$";
    // «Sergeevich»
    public static final String REGEX_PATRONYMIC = "^[A-Z]?[a-z]{0,10}$";
    // «p.oow123_woop»
    public static final String REGEX_NICKNAME = "^[A-Za-z0-9_.]{2,14}$";
    // «petya_ivanov1986»
    public static final String REGEX_SKYPE = "^[A-Za-z0-9_]{3,25}$";
    // «04012»
    public static final String REGEX_INDEX = "^[0-9]{5}$";
    // «Kyiv»
    public static final String REGEX_CITY = "^[A-Z0-9]{1}[A-Za-z0-9-. ]{1,20}$";
    // «st. Mezhihirska»
    public static final String REGEX_STREET = "^[A-Za-z0-9-. ]{1,40}$";
    // «12/3A»
    public static final String REGEX_HOUSE_NUMBER = "^[0-9]{1,3}[/]?[0-9]{0,2}[A-Za-z]?$";
    // «35»
    public static final String REGEX_FLAT_NUMBER = "^[0-9]{1,3}$";
    // «01.20.1990»
    public static final String REGEX_DATE = "^\\s*(3[01]|[12][0-9]|0?[1-9])\\.(1[012]|0?[1-9])\\.((?:19|20)\\d{2})\\s*$";


    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setSurname(inputSurname(sc));
        model.setName(inputName(sc));
        model.setPatronymic(inputPatronymic(sc));
        model.setNickname(inputNickname(sc));
        model.setHomePhone(inputHomePhone(sc));
        model.setMobilePhone(inputMobilePhone(sc));
        model.setEmail(inputEmail(sc));
        model.setSkype(inputSkype(sc));
        model.setAdress(inputAdress(sc));
        model.setRegistrationDate(inputRegistrationDate(sc));
        model.setDateOfChange(inputDateOfChange(sc));

        view.printMessageAndString(view.OUR_SURNAME, model.getSurname());
        view.printMessageAndString(view.OUR_NAME, model.getName());
        view.printMessageAndString(view.OUR_PATRONYMIC, model.getPatronymic());
        view.printMessageAndString(view.OUR_NICKNAME, model.getNickname());
        view.printMessageAndString(view.OUR_HOME_PHONE, model.getHomePhone());
        view.printMessageAndString(view.OUR_MOBILE_PHONE, model.getMobilePhone());
        view.printMessageAndString(view.OUR_EMAIL, model.getEmail());
        view.printMessageAndString(view.OUR_SKYPE, model.getSkype());
        view.printMessage(view.OUR_ADRESS);
        view.printMessageAndString(view.OUR_INDEX, model.getIndex());
        view.printMessageAndString(view.OUR_CITY, model.getCity());
        view.printMessageAndString(view.OUR_STREET, model.getStreet());
        view.printMessageAndString(view.OUR_HOUSE_NUMBER, model.getHouseNumber());
        view.printMessageAndString(view.OUR_FLAT_NUMBER, model.getFletNumber());
        view.printMessageAndString(view.OUR_REGISTRATION_DATE, model.getRegistrationDate());
        view.printMessageAndString(view.OUR_DATE_OF_CHANGE, model.getDateOfChange());
    }

    // The Utility methods
    public String inputStringValueWithScanner(Scanner sc) {
        while( ! sc.hasNextLine() ) {
            view.printMessage(view.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextLine();
    }

    public String inputSurname(Scanner sc){
        String surname;
        do{
            view.printMessage(view.INPUT_SURNAME);
            surname = inputStringValueWithScanner(sc);
        }
        while(!surname.matches(REGEX_SURNAME));
        return surname;
    }

    public String inputName(Scanner sc){
        String name;
        do{
            view.printMessage(view.INPUT_NAME);
            name = inputStringValueWithScanner(sc);
        }
        while(!name.matches(REGEX_NAME));
        return name;
    }

    public String inputPatronymic(Scanner sc){
        String patronymic;
        do{
            view.printMessage(view.INPUT_PATRONYMIC);
            patronymic = inputStringValueWithScanner(sc);
        }
        while(!patronymic.matches(REGEX_PATRONYMIC));
        return patronymic;
    }

    public String inputNickname(Scanner sc){
        String nickname;
        do{
            view.printMessage(view.INPUT_NICKNAME);
            nickname = inputStringValueWithScanner(sc);
        }
        while(!nickname.matches(REGEX_NICKNAME));
        return nickname;
    }

    public String inputHomePhone(Scanner sc){
        String homePhone;
        do{
            view.printMessage(view.INPUT_HOME_PHONE);
            homePhone = inputStringValueWithScanner(sc);
        }
        while(!homePhone.matches(REGEX_PHONE));
        return homePhone;
    }

    public String inputMobilePhone(Scanner sc){
        String mobilePhone;
        do{
            view.printMessage(view.INPUT_MOBILE_PHONE);
            mobilePhone = inputStringValueWithScanner(sc);
        }
        while(!mobilePhone.matches(REGEX_PHONE));
        return mobilePhone;
    }

    public String inputEmail(Scanner sc){
        String email;
        do{
            view.printMessage(view.INPUT_EMAIL);
            email = inputStringValueWithScanner(sc);
        }
        while(!email.matches(REGEX_MAIL));
        return email;
    }

    public String inputSkype(Scanner sc){
        String skype;
        do{
            view.printMessage(view.INPUT_SKYPE);
            skype = inputStringValueWithScanner(sc);
        }
        while(!skype.matches(REGEX_SKYPE));
        return skype;
    }

    public Adress inputAdress(Scanner sc){
        String index;
        String city;
        String street;
        String houseNumber;
        String fletNumber;

        do{
            view.printMessage(view.INPUT_INDEX);
            index = inputStringValueWithScanner(sc);
        }
        while(!index.matches(REGEX_INDEX));

        do{
            view.printMessage(view.INPUT_CITY);
            city = inputStringValueWithScanner(sc);
        }
        while(!city.matches(REGEX_CITY));

        do{
            view.printMessage(view.INPUT_STREET);
            street = inputStringValueWithScanner(sc);
        }
        while(!street.matches(REGEX_STREET));

        do{
            view.printMessage(view.INPUT_HOUSE_NUMBER);
            houseNumber = inputStringValueWithScanner(sc);
        }
        while(!houseNumber.matches(REGEX_HOUSE_NUMBER));

        do{
            view.printMessage(view.INPUT_FLAT_NUMBER);
            fletNumber = inputStringValueWithScanner(sc);
        }
        while(!fletNumber.matches(REGEX_FLAT_NUMBER));

        Adress adress = new Adress(index, city, street, houseNumber, fletNumber);

        return adress;
    }

    public String inputRegistrationDate(Scanner sc){
        String registrationDate;
        do{
            view.printMessage(view.INPUT_REGISTRATION_DATE);
            registrationDate = inputStringValueWithScanner(sc);
        }
        while(!registrationDate.matches(REGEX_DATE));
        return registrationDate;
    }

    public String inputDateOfChange(Scanner sc){
        String dateOfChange;
        do{
            view.printMessage(view.INPUT_DATE_OF_CHANGE);
            dateOfChange = inputStringValueWithScanner(sc);
        }
        while(!dateOfChange.matches(REGEX_DATE));
        return dateOfChange;
    }
}
