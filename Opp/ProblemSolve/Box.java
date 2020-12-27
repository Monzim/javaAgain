package Opp.ProblemSolve;

public class Box {

    double height, width, depth;

    // Box(double h, double w, double d) {
    Box(double height, double width, double depth) {

        // height = h;
        // width = w;
        // depth = d;
        this.height = height;
        this.width = width;
        this.depth = depth;

    }

    void displayVol() {
        double vol;
        vol = height * width * depth;

        System.out.println("Volume of Box1: " + vol);

    }

}
