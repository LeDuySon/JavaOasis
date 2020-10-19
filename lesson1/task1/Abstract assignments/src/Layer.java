import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Remove circles in list.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
                i -= 1;
            }
        }
    }

    /**
     * GetInfor.
     * Get
     * @return string shapes
     */
    public String getInfo() {
        String info = "Layer of crazy shapes: \n";
        for (int i = 0; i < shapes.size(); i++) {
            info = info + shapes.get(i).toString() + "\n";
        }
        return info;
    }


    /**
     * Remove duplicate shape.
     */
    public void removeDuplicates() {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < shapes.size(); i++) {
            if (set.contains(shapes.get(i).hashCode())) {
                shapes.remove(i);
                i--;
            } else {
                set.add(shapes.get(i).hashCode());
            }
        }
    }
}