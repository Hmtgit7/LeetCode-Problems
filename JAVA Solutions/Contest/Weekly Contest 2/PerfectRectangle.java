public class PerfectRectangle{
    public static void main(String[] args) {
        int[][] rectangles = {{1,1,3,3},{3,1,4,2},{3,2,4,4},{1,3,2,4},{2,3,3,4}};
        System.out.println(isRectangleCover(rectangles));
    }
    public boolean isRectangleCover(int[][] rectangles) {
        int x1 = Integer.MAX_VALUE, y1 = Integer.MAX_VALUE, x2 = Integer.MIN_VALUE, y2 = Integer.MIN_VALUE;
        int area = 0;
        HashSet<String> set = new HashSet<>();
        for(int[] rect : rectangles){
            x1 = Math.min(x1, rect[0]);
            y1 = Math.min(y1, rect[1]);
            x2 = Math.max(x2, rect[2]);
            y2 = Math.max(y2, rect[3]);
            area += (rect[2] - rect[0]) * (rect[3] - rect[1]);
            String s1 = rect[0] + " " + rect[1];
            String s2 = rect[0] + " " + rect[3];
            String s3 = rect[2] + " " + rect[1];
            String s4 = rect[2] + " " + rect[3];
            if(!set.add(s1)) set.remove(s1);
            if(!set.add(s2)) set.remove(s2);
            if(!set.add(s3)) set.remove(s3);
            if(!set.add(s4)) set.remove(s4);
        }
        if(!set.contains(x1 + " " + y1) || !set.contains(x1 + " " + y2) || !set.contains(x2 + " " + y1) || !set.contains(x2 + " " + y2) || set.size() != 4) return false;
        return area == (x2 - x1) * (y2 - y1);
    }
}