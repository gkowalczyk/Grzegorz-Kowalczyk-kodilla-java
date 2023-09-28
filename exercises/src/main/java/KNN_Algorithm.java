import java.util.Arrays;
import java.util.Comparator;

public class git add  {

    static class Point {
        private int typeOfGroup;
        private double x;
        private double y;
        private double distance;

        @Override
        public String toString() {
            return "Point{" +
                    "typeOfGroup=" + typeOfGroup +
                    ", x=" + x +
                    ", y=" + y +
                    ", distance=" + distance +
                    '}';
        }
    }

    public static int classifyPoint(Point[] points, int n, int k, Point p) {

        for (int i = 0; i < n; i++) {
            points[i].distance = Math.sqrt(
                    (points[i].x - p.x) * (points[i].x - p.x) +
                            (points[i].y - p.y) * (points[i].y - p.y));
        }
        Arrays.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p2.distance < p1.distance ? 1 : (p2.distance > p1.distance ? -1 : 0);
            }
        });
        Arrays.stream(points).forEach(System.out::println);

        int counter0 = 0;
        int counter1 = 0;
        for (int i = 0; i < k; i++) {
            if (points[i].typeOfGroup == 0) {
                counter0++;
            } else if (points[i].typeOfGroup == 1) {
                counter1++;
            }
        }
        return counter0++ > counter1++ ? 0 : 1;
    }

    public static void main(String[] args) {

        int n = 6;
        int k = 3;

        Point[] points = new Point[n];
        Point p = new Point();
        p.x = 0.5;
        p.y = 2.0;

        for (int i = 0; i < n; i++) {
            points[i] = new Point();
        }

        points[0].x = 1;
        points[0].y = 12;
        points[0].typeOfGroup = 0;

        points[1].x = 2;
        points[1].y = 5;
        points[1].typeOfGroup = 0;

        points[2].x = 5;
        points[2].y = 3;
        points[2].typeOfGroup = 1;

        points[3].x = 3;
        points[3].y = 2;
        points[3].typeOfGroup = 1;

        points[4].x = 3;
        points[4].y = 6;
        points[4].typeOfGroup = 0;

        points[5].x = 1.5;
        points[5].y = 9;
        points[5].typeOfGroup = 1;

        System.out.println(classifyPoint(points, n, k, p));
    }
}
