class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> res = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        int i = 0;

        // newInterval se pehle wale intervals
        while (i < intervals.length && intervals[i][1] < start) {
            res.add(intervals[i]);
            i++;
        }

        // overlapping intervals merge
        while (i < intervals.length && intervals[i][0] <= end) {

            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);

            i++;
        }

        // merged interval
        res.add(new int[]{start, end});

        // bache hue intervals
        while (i < intervals.length) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}