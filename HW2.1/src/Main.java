import game.hero.Elf;

public class Main {
    public static void main (String[] args){
        Elf elf = new Elf();
        elf.setAge(24);
        elf.setName("Tom");
        elf.setSkill("FireBall");
        elf.setWeapon("sword");
        elf.setId(46567);
        System.out.println("Имя героя: " + elf.getName() + "\n" + "Возвраст героя:" + elf.getAge() + "\n" + "Спец навык:" + elf.getSkill() + "\n" + "Оружияе:" + elf.getWeapon() + "\n" + "id:" + elf.getId() );
    }
}
