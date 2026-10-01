package Projects;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InMemoryRepository<T, ID> {

    private final Function<T, ID> idOf;
    private final Map<ID, T> storage = new HashMap<>();

    public InMemoryRepository(Function<T, ID> idOf) {
        this.idOf = idOf;
    }


    public void save(T item) {
        storage.put(idOf.apply(item), item);
    }

    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    public List<T> findAll(Comparator<? super T> order) {
        return storage.values().stream()
                .sorted(order)
                .collect(Collectors.toList());
    }

    public List<T> findWhere(Predicate<? super T> filter) {
        return storage.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    public boolean deleteById(ID id) {
        return storage.remove(id) != null;
    }

}

