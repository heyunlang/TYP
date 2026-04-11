package gsn.design.validation;

import java.util.Collection;
import java.util.Map;

/**
 * Utility class to provide safe null and empty checks.
 */
public final class ObjectUtils {

    private ObjectUtils() {
        // Prevent instantiation
    }

    /**
     * Checks if a collection is null or empty.
     * 
     * @param collection the collection to check
     * @return true if null or empty, false otherwise
     */
    public static boolean isEmpty(Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    /**
     * Checks if a map is null or empty.
     * 
     * @param map the map to check
     * @return true if null or empty, false otherwise
     */
    public static boolean isEmpty(Map<?, ?> map) {
        if (map == null) {
            return true;
        }
        return map.isEmpty();
    }
}
