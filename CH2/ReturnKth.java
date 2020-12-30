package CH2;

import helpers.ListNode;

public class ReturnKth {
    private class Data {
        ListNode n;
        int k;

        public Data(ListNode n, int k) {
            this.n = n;
            this.k = k;
        }
    }

    public ListNode solution(ListNode head, int k) {
        return solutionHelper(head, k).n;
    }

    private Data solutionHelper(ListNode head, int k) {
        Data d = new Data(head, k);
        if (head.next != null) {
            d = solutionHelper(head.next, k);
        }
        k = d.k;
        k = k - 1;
        if (k == 0) {
            return new Data(head, k);
        }
        d.k = k;
        return d;
    }
}
