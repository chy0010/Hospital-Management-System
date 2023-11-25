class Doctor extends Person {
    String doctorId;
    String specialization;
    String contactNumber;

    public Doctor(String name, int age, String doctorId, String specialization, String contactNumber) {
        super(name, age);
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.contactNumber = contactNumber;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
