class Patient extends Person {
    String patientId;
    String contactNumber;
    String address;

    public Patient(String name, int age, String patientId, String contactNumber, String address) {
        super(name, age);
        this.patientId = patientId;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
