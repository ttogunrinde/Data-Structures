public class TestPatient {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("1234", 35, BloodData.BloodType.B, BloodData.RhFactor.POSITIVE);
        BloodData b2 = new BloodData(BloodData.BloodType.A, BloodData.RhFactor.NEGATIVE);
        display(p1);
        display(p2);
        p1.setId("3456");
        p1.setAge(42);
        BloodData b = new BloodData(BloodData.BloodType.AB, BloodData.RhFactor.NEGATIVE);
        p1.setBloodData(b);
        display(p1);
    }

    public static void display(Patient p) {
        BloodData bt = p.getBloodData();
        System.out.println("Patient #" + p.getId() + "  age: " + p.getAge() +
                "\n   The blood is type " + bt.getBloodType() + " " + bt.getRhFactor());
    }
}
