package az.abbtech.lesson_5;

public enum Operation {



    ADD {
        @Override
        public int apply ( int x, int y){
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public int apply ( int x, int y){
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public int apply (int x, int y){
            return x / y;
        }
    };

    public abstract int apply(int x, int y);
}



