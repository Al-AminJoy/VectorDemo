package vectordemo;

/**
 *
 * @author Al-Amin Islam <alaminislam3555@gmail.com>
 */
public class Vector {

    public double[] components;

    public Vector(int dimention) {
        components = new double[dimention];
    }

    public void setComponent(int index, double component) {
        components[index] = component;
    }

    public Vector add(Vector that) {
        Vector r = new Vector(that.components.length);
        for (int i = 0; i < that.components.length; i++) {
            r.setComponent(i, this.components[i] + that.components[i]);
        }

        return r;
    }

    public double dot(Vector that) {
        double sum = 0.0;
        for (int i = 0; i < that.components.length; i++) {
            sum = sum + this.components[i] * that.components[i];
        }
        return sum;
    }

    public void print() {
        System.out.print("(");
        for (int i = 0; i < this.components.length; i++) {
            if (i == 0) {
                System.out.print(components[i]);
            } else {
                System.out.print("," + components[i]);
            }
        }
        System.out.println(")");
    }
}
