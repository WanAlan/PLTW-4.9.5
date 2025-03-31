/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner {
    public static void main(String[] args) {
        Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
        a.isNocturnal();
        //a.trumpet(); // this call is not allowed because the Animal is not guaranteed to have the trumpet method

        Animal a1 = new Animal();
        a1.sleep();
        /*Object a2 = new Animal();
        a2.sleep();*/

        Object o = new Object();
        System.out.println(o.toString());
        Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(e.toString());

        Animal a3 = new Animal();
        System.out.println(a3.toString()); 

        Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(a4.toString());

        Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
        System.out.println(o2.toString());
    }
}
