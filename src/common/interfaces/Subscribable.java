package common.interfaces;

import common.models.Person;

public interface Subscribable {
    boolean subscribe(Person p);
    boolean unsubscribe(Person p);
}
