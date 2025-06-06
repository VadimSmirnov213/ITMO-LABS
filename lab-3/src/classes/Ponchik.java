package classes;



import enums.LegsPosition;
import enums.WalkTypes;
import enums.WeightType;
import enums.WeightlessnessTime;
import interfaces.GetWeight;
import interfaces.Jump;
import java.util.ArrayList;
import java.util.Objects;

public class Ponchik extends Person implements GetWeight, Jump {
    public Ponchik(String name) {
        super(name); // Вызов конструктора суперкласса
    }

    @Override
    public String getName() {
        return this.name; // Возвращает имя
    }

    @Override
    public void setName(String name) {
        this.name = name; // Устанавливает имя
    }

    public void avoid() {
        System.out.println(this.name + " избежал этого");
    }

    public void dontfeel() {
        System.out.println(this.name + " не почувствовал перемен в весе");
    }

    public void weightlessness(WeightlessnessTime time) {
        System.out.println(this.name + " провёл " + time.Type() + " время в состоянии невесомости.");
    }

    public void forget() {
        System.out.println(this.name + " успел отвыкнуть от тяжести");
    }

    public void walkedAhead(WalkTypes types) {
        System.out.println(this.name + " шагал " + types.Type());
    }

    public void feeling(LegsPosition position, ArrayList<String> persons) {
        StringBuilder result = new StringBuilder("Правда, у " + this.name + " появлялось ощущение, будто всё вокруг перевернуто " + position + " ногами.");
        int size = persons.size();
        if (size > 0) {
            result.append(" И "); 
            for (int i = 0; i < size; i++) {
                result.append(persons.get(i)); 
                if (i == size - 2) {
                    result.append(", и "); 
                } else if (i < size - 1) {
                    result.append(", и "); 
                }
            }
    }
    result.append(".");
    System.out.println(result);
    }

    @Override
    public void getweight(CelestialBody name2, CelestialBody name3) {
        System.out.println("Тот вес, который " + this.name + " приобрел на " + name2 
        + ", показался ему самым " + WeightType.NORMAL + ", самым " + WeightType.GOOD + " весом, который " + this.name + " имел на " + name3);
    }

    @Override
    public void jump(CelestialBody name2, CreatureObj name3, CreatureObj name4) {
        System.out.println("Во всяком случае, " + this.name + " не прыгал по " + name2 + " словно какие-нибудь там " + name3 + " или "
        + name4 + ", а ходили нормально.");
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object name_1) {
        if (this == name_1) return true;
        if (name_1 == null || getClass() != name_1.getClass()) return false;
        Ponchik Ponchik = (Ponchik) name_1;
        return Objects.equals(this.name, Ponchik.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
