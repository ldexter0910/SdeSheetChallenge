// You are given N number of intervals, where each interval contains two integers denoting the start time and the end time for the interval.
// The task is to merge all the overlapping intervals and return the list of merged intervals sorted by increasing order of their start time.
// Two intervals [A,B] and [C,D] are said to be overlapping with each other if there is at least one integer that is covered by both of them.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
    int start;
    int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class MergeIntervals {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        Arrays.sort(intervals, (Interval a, Interval b) -> {
            if (a.start == b.start) {
                return a.finish - b.finish;
            }
            return a.start - b.start;
        });

        List<Interval> res = new ArrayList<>();
        Interval curr = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            Interval x = intervals[i];
            if (curr.finish < x.start) {
                res.add(curr);
                curr = x;
            } else {
                curr.finish = Math.max(curr.finish, x.finish);
            }
        }
        res.add(curr);
        return res;
    }
}