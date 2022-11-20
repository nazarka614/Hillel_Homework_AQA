package homeWork10;

public class UserInfo {
    String firstname;
    String lastname;
    String email;
    String mobile;
    String subject;
    String address;


    public UserInfo(String firstname, String lastname, String email, String mobile, String subject, String address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.subject = subject;
        this.address = address;
    }


    public UserInfo() {
        this.firstname = "Nazar";
        this.lastname = "Nerubayko";
        this.email = "nazarka614@gmail.com";
        this.mobile = "0968795857";
        this.subject = "Maths";
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

    public String getMobile() {
        return mobile;
    }

    public String getSubject() {
        return subject;
    }

    public String getAddress() {
        return address;
    }
}
