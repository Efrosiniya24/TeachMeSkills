public class Patient {
    private int plan;
    private String doctor;

    public Patient(int plan) {
        this.plan = plan;
    }

    public int getPlan() {
        return plan;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
