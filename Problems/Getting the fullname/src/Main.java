class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = null;
        this.lastName = null;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        StringBuilder res = new StringBuilder();
        if (firstName != null && !(firstName.equals(""))) {
            res.append(firstName);
            if (lastName != null && !(lastName.equals(""))) {
                res.append(" ");
            }
        }
        if (lastName != null && !(lastName.equals(""))) {
            res.append(lastName);
        }
        if (firstName == null && lastName == null) {
            return "Unknown";
        }
        return res.toString();
    }

    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName(null);
        tim.setLastName("adsf");
        System.out.println(tim.getFullName());

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());
    }
}