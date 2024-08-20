package game.hero;

public class Elf {
    int id;
    String name;
    int age;
    String skill;
    String weapon;
    public int getId() {
        return id;
    }
     public String getName(){
        return name;
     }
     public int getAge(){
        return age;
     }
     public String getSkill(){
        return skill;
     }
     public String getWeapon(){
        return weapon;
     }

    public void setAge(int age) { //вносим значение
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
