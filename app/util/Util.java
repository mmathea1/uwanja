package util;

import java.util.UUID;

public class Util {

    /**
     * returns a 32 char UUID
     *
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
