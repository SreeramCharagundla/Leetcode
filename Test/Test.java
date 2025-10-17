public class Test {

    public static void main(String[] args) {

        // Iterate from 5 (inclusive) to 10 (exclusive): prints 5 6 7 8 9
        for (int n : new Range(5, 10)) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    /** Simple iterable range: [start, end) */
    private static class Range implements Iterable<Integer> {

        private final int start;
        private final int end;

        Range(int start, int end) {
            this.start = start;
            this.end   = end;
        }

        @Override
        public java.util.Iterator<Integer> iterator() {
            return new java.util.Iterator<>() {
                private int current = start;

                @Override
                public boolean hasNext() {
                    return current < end;
                }

                @Override
                public Integer next() {
                    if (!hasNext())
                        throw new java.util.NoSuchElementException();
                    return current++;
                }
            };
        }
    }
}
