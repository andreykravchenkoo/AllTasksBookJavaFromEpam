package project.main;

import project.entity.Point;
import project.entity.Vector;
import project.utils.Utils;

public class MainClass {
    public static void main(String[] args) {
        Utils utils = new Utils();

        Vector vector1 = new Vector(new Point(5, 3), new Point(8, 4));
        Vector vector2 = new Vector(new Point(2, 7), new Point(2, 9));

        utils.addVector(vector1);
        utils.addVector(vector2);
        utils.getModuleVector(vector1);
        utils.getModuleVector(vector2);
        utils.getScalarProduct(vector1, vector2);
        utils.getVectorAdditionAndSubtraction(vector1, vector2);
        utils.getMultiplicationConstant(vector1, 2);
        utils.showList();
    }
}
