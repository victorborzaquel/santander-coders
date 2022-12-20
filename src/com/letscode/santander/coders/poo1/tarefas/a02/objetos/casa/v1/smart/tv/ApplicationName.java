package com.letscode.santander.coders.poo1.tarefas.a02.objetos.casa.v1.smart.tv;

import java.util.HashMap;
import java.util.Map;

public enum ApplicationName {
    MENU(1),
    NETFLIX(2),
    DISNEY_PLUS(3),
    HBO_MAX(4),
    AMAZON_PRIME(5);

    private final int id;
    private static final Map<Integer, ApplicationName> map = new HashMap<>();

    ApplicationName(int id) {
        this.id = id;
    }

    static {
        for (ApplicationName application : ApplicationName.values()) {
            map.put(application.id, application);
        }
    }

    public static ApplicationName valueOf(int id) {
        return map.get(id);
    }

    public int getId() {
        return this.id;
    }
}
