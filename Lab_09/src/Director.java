class Director {
    private String name;
    private String email;
    private char gender;

    public Director(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getGenderName() {
        if (gender == 'M' || gender == 'm') return "Male";
        if (gender == 'F' || gender == 'f') return "Female";
        return "Unknown";
    }

    public String toString() {
        return name + " (" + email + " | " + getGenderName() + ")";
    }
}