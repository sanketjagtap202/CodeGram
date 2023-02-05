package assignment04;

public class Patient {
	private String patientName;
    private int patientAge;
    private String disease;
    Patient (String patientName, int patientAge, String disease)
    {
        this.patientName= patientName;
        this.patientAge=patientAge;
        this.disease=disease;
    }   

    public String getDisease()
    {return disease;}

    public String toString()
    {
        return (patientName+""+patientAge+""+ disease);
    }
}
