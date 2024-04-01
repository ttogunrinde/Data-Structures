public class BloodData {
    private BloodType bloodType;
    private RhFactor rhFactor;

    public BloodData() {
        this(BloodType.O, RhFactor.POSITIVE);
    }

    public BloodData(BloodType bType, RhFactor rh) {
        bloodType = bType;
        rhFactor = rh;
    }

    public void setBloodType(BloodType bType) {
        bloodType = bType;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setRhFactor(RhFactor rh) {
        rhFactor = rh;
    }

    public RhFactor getRhFactor() {
        return rhFactor;
    }

    // Enums for BloodType
    public enum BloodType {
        A,
        B,
        AB,
        O
    }

    // Enums for RhFactor
    public enum RhFactor {
        POSITIVE,
        NEGATIVE
    }
}
