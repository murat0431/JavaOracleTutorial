package common.interfaces;

import java.util.List;
import java.util.function.Predicate;

public interface Printable<T> {
    void print(Predicate<T> predicate);
}
