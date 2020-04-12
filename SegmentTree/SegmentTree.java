
import java.util.Scanner;

public class SegmentTree {

    public static void build(int[] tree, int[] arr, int s, int e, int index) {

        if (s == e) {
            tree[index] = arr[s];
            return;
        }
        int mid = (s + e) / 2;
        build(tree, arr, s, mid, 2 * index);
        build(tree, arr, mid + 1, e, 2 * index + 1);

        tree[index] = Math.min(tree[2 * index], tree[2 * index + 1]);
        return;
    }

    public static int query(int[] tree, int ss, int se, int qs, int qe, int index) {
        //Complete overlap
        if (ss >= qs && se <= qe) {
            return tree[index];
        }
        //No overlap
        if (qe < ss || qs > se) {
            return Integer.MAX_VALUE;
        }
        // Partial overlap
        int mid = (ss + se) / 2;
        int left = query(tree, ss, mid, qs, qe, 2 * index);
        int right = query(tree, mid + 1, se, qs, qe, 2 * index + 1);
        return Math.min(left, right);

    }

    public static void updateNode(int[] tree, int ss, int es, int i, int inc, int index) {
        //out of Bound
        if (i < ss || i > es) {
            return;
        }
        if (ss == es) {
            tree[index] += inc;
            return;
        }
        int mid = (ss + es) / 2;
        updateNode(tree, ss, mid, i, inc, 2 * index);
        updateNode(tree, mid + 1, es, i, inc, 2 * index + 1);
        tree[index] = Math.min(tree[2 * index], tree[2 * index + 1]);
        return;
    }

    public static void updateRange(int[] tree, int ss, int es, int l, int r, int inc, int index) {

        // No overlap
        if (l > es || r < ss) {
            return;
        }

        if (ss == es) {
            tree[index] += inc;
            return;
        }
        int mid = (ss + es) / 2;
        updateRange(tree, ss, mid, l, r, inc, 2 * index);
        updateRange(tree, mid + 1, es, l, r, inc, 2 * index + 1);
        tree[index] = Math.min(tree[2 * index], tree[2 * index + 1]);
        return;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, -5, 6, 4};
        Scanner s = new Scanner(System.in);

        int[] tree = new int[4 * arr.length + 1];
        build(tree, arr, 0, arr.length - 1, 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
//        updateNode(tree, 0, arr.length - 1, 2, 10, 1);
//        updateNode(tree, 0, arr.length - 1, 3, 15, 1);
        updateRange(tree, 0, arr.length - 1, 1, 2, 10, 1);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }

        int q = 2;
        while (q-- != 0) {
            int qs = s.nextInt();
            int qe = s.nextInt();
            System.out.println();
            System.out.println(query(tree, 0, arr.length - 1, qs, qe, 1));
        }

    }

}

