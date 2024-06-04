public class index {
    public static void main(String[] args) {
        Generic<String> s = new Generic<String>();
        Generic<Integer> i = new Generic<Integer>();

        s.set("Set this type");
        i.set(10);

        System.out.println(s.get() + ": " + i.get());

        GenericTwo<String, Double> g = new GenericTwo<String, Double>("Thomas", 2.0);
        g.get();
    }
}
