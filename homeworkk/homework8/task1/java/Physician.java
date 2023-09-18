public class Physician extends Doctor {
    @Override
    public void treat() {
        System.out.println("Пройдите лечение у терапевта");
    }

    public void forPatient(Patient patient){
        switch(patient.getPlan()){
            case 1:
                Surgeon surgeon = new Surgeon();
                patient.setDoctor("Хирург");
                surgeon.treat();
                break;
            case 2:
                Dantist dantist = new Dantist();
                patient.setDoctor("Дантист");
                dantist.treat();
                break;
            default:
                patient.setDoctor("Терапевт");
                treat();
        }
    }

}
