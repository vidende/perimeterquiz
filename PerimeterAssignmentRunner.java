import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        System.out.println("number of points = " + getNumPoints(s));
        System.out.println("average length = " + getAverageLength(s));
        System.out.println("largest side = " + getLargestSide(s));
        System.out.println("largest X point = " + getLargestX(s));
    }
    
    
    public int getNumPoints (Shape s) {
        // Put code here
        // This method returns an integer that is the number of points in Shape s. Hint: You will need to iterate over all the
        // poits in the Shape s and count them.
        int pCount = 0;
        for (Point pc : s.getPoints()){
            pCount = pCount + 1;
        }
        return pCount;
        //return 0;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        // This method returns a number of type double that is the calculated 
        // average of all the sides' lengths in the Shape S.
        int numSides = getNumPoints(s);
        double avglen = getPerimeter(s) / (double) numSides;
        return avglen;
        //return 0.0;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        // This method returns a number of type double that is the longest side in the Shape S.
                // Start with totalPerim = 0
        //double totalPerim = 0.0;
        double largestDist = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            //totalPerim = totalPerim + currDist;
            if (currDist > largestDist) {
                largestDist = currDist;
            }
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return largestDist;
        //return 0.0;
    }

    public double getLargestX(Shape s) {
        // Put code here
        // This method returns a number of type double that is the largest x value over all the points in the Shape s.
        double largestX = 0.0;
        for (Point currPt : s.getPoints()){
            int currX = currPt.getX();
            if (currX > (int) largestX){
                largestX = (double) currX;
            }
        }
        return largestX;
        //return 0.0;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
