import java.util.List;

class Appointment {
    String appointmentId;
    String patientId;
    String doctorId;
    String date;
    boolean isCompleted;

    public Appointment(String appointmentId, String patientId, String doctorId, String date, boolean isCompleted) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }


    static class MedicalRecord {
        String recordId;
        String patientId;
        String diagnosis;
        String treatmentPlan;
        List<String> medications;

        public MedicalRecord(String recordId, String patientId, String diagnosis, String treatmentPlan, List<String> medications) {
            this.recordId = recordId;
            this.patientId = patientId;
            this.diagnosis = diagnosis;
            this.treatmentPlan = treatmentPlan;
            this.medications = medications;
        }

        public String getRecordId() {
            return recordId;
        }

        public void setRecordId(String recordId) {
            this.recordId = recordId;
        }

        public String getPatientId() {
            return patientId;
        }

        public void setPatientId(String patientId) {
            this.patientId = patientId;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        public String getTreatmentPlan() {
            return treatmentPlan;
        }

        public void setTreatmentPlan(String treatmentPlan) {
            this.treatmentPlan = treatmentPlan;
        }

        public List<String> getMedications() {
            return medications;
        }

        public void setMedications(List<String> medications) {
            this.medications = medications;
        }


    }
}
