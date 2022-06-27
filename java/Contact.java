package collection;



public class Contact {
    private long phoneNumber;
    private String name;
    private String email;
    private enum gender {male, female};

    public Contact(long phoneNumber, String name, String email) {
        super();
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

            public long getPhoneNumber() {
                return phoneNumber;
            }
            public void setPhoneNumber(long phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }

            public String getEmail() {
                return email;
            }
            public void setEmail(String email) {
                this.email = email;
            }

    @Override
    public String toString() {
        return "ContactDetails [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + "]";
    }

}