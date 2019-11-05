package rgc;

public interface CharComparator {

  default boolean areEqual(char ch1, char ch2) {
    return ch1 == ch2;
  }

  default boolean areDistinct(char ch1, char ch2) {
    return ch1 != ch2;
  }
}
