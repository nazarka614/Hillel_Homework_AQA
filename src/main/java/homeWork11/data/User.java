package homeWork11.data;

public class User {
    String firstname;
    String lastname;
    String email;
    boolean male;
    boolean female;
    String mobile;
    String subject;
    Hobbies hobbies;
    String address;


    public User(String firstname, String lastname, String email, boolean male, boolean female, String mobile, String subject, Hobbies hobbies, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.male = male;
        this.female = female;
        this.mobile = mobile;
        this.subject = subject;
        this.hobbies = hobbies;
        this.address = address;
    }

    public User() {
        this.firstname = "Nazar";
        this.lastname = "Nerubayko";
        this.email = "nazarka614@gmail.com";
        this.male = true;
        this.female = false;
        this.mobile = "0968795857";
        this.subject = "Maths";
        this.hobbies = Hobbies.Music;
        this.address = "Odessa";
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isFemale() {
        return female;
    }

    public String getMobile() {
        return mobile;
    }


    public String getSubject() {
        return subject;
    }

    public Hobbies getHobbies() {
        return hobbies;
    }

    public String getAddress() {
        return address;
    }

}
