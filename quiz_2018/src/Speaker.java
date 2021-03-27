import java.util.List;

public class Speaker extends User {
    int fee;

    public Speaker(String name, int age) { super(name,age); fee = 0; }

    public Speaker(String name) { super(name, 0); fee = 0; }

    public int getFee() { return fee; }

    @Override
    public String toString() {
        return "Speaker " + name + " has a fee value of " + getFee() + ".";
    }
}
