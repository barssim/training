package javaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class AsMatchPredicate {

  public static void main(String[] args) {

    List<String> words = new ArrayList<>();
    words.add("book");
    words.add("bookshelf");
    words.add("bookworm");
    words.add("bookcase");
    words.add("bookish");
    words.add("bookkeeper");
    words.add("booklet");
    words.add("bookmark");

    Predicate<String> pred = Pattern.compile("book(worm|mark|keeper)?").asPredicate();
    words.stream().filter(pred).forEach(System.out::println);
  }
}
