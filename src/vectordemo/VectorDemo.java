package vectordemo;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class VectorDemo {

    public static void main(String[] args) {
        Vector a = new Vector(2);
        a.setComponent(0, 2);
        a.setComponent(1, -3);

        Vector b = new Vector(2);
        b.setComponent(0, 4.5);
        b.setComponent(1, 2);
        //Vector Addition
        Vector r = a.add(b);
        a.print();
        b.print();
        r.print();
        //Vector Dot product
        double result = a.dot(b);
        System.out.println("Dot Result : " + result);

    }

}
