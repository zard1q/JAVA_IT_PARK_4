public class Main {


    public static void main(String args[]) {
        HumanDataStorage humans = new HumanDataStorage();
        humans.addHuman(39,"Василий", "Австралия");
        System.out.println(humans.getAll());
        System.out.println(humans.getByAge(23));
        System.out.println(humans.getByName("Инокентий"));
        System.out.println(humans.getByCitizen("Россия"));


    }
}
