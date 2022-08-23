public class App {
    public static void main(String[] args) {

        Character Controller = new Character();

        Controller.strength = 5;
        Controller.agility = 4;
        Controller.intelligence = 3;
        Controller.name = "Jett";
        Controller.sayMyName();
        Controller.sayMyStrength();
        Controller.sayMyAgility();
        Controller.sayMyIntelligence();


        Character Iniator = new Character();

        Iniator.strength = 3;
        Iniator.agility = 5;
        Iniator.intelligence = 10;
        Iniator.name = "Sova";
        Iniator.sayMyName();
        Iniator.sayMyStrength();
        Iniator.sayMyAgility();
        Iniator.sayMyIntelligence();

        Character Duelist = new Character();

        Duelist.strength = 4;
        Duelist.agility = 6;
        Duelist.intelligence = 3;
        Duelist.name = "Omen";
        Duelist.sayMyName();
        Duelist.sayMyStrength();
        Duelist.sayMyAgility();
        Duelist.sayMyIntelligence();

        Character Sentinel = new Character();

        Sentinel.strength = 2;
        Sentinel.agility = 4;
        Sentinel.intelligence = 8;
        Sentinel.name ="Sage";
        Sentinel.sayMyName();
        Sentinel.sayMyStrength();
        Sentinel.sayMyAgility();
        Sentinel.sayMyIntelligence();

    }
}
