package hospital;

public class Patient {

    private int healthLevel;
    private int bloodLevel;


    public int getHealthLevel() {
        return healthLevel;

    }

    public int getBloodLevel() {

        return bloodLevel;
    }

    //default constructor for a patient object
        public Patient() {
            healthLevel = 10; //default patient health level
            bloodLevel = 20; //default patient blood level

        }

        //overloaded constructor
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel = healthLevel;
        this.bloodLevel = bloodLevel;


    }

        public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
