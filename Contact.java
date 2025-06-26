public class Contact{
    String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        if (!phone.isEmpty()) {
            System.out.println("Phone: " + phone);
        }
        if (!email.isEmpty()) {
            System.out.println("Email: " + email + "\n");
        }
    }
}