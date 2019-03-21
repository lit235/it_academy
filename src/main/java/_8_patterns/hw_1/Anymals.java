package _8_patterns.hw_1;

 public class Anymals {
    private Anymals(String anymals) {
        this.anymals = anymals;
    }

    private final String anymals;


    public static class AnymalsBuilder {
        private String anymals;

        public AnymalsBuilder anymals(String anymals) {
            this.anymals = anymals;
            return this;
        }

        public Anymals Build() {
            return new Anymals(this.anymals);
        }
    }

}
