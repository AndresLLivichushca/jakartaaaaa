package config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class AppConfig extends Application {
    // Aquí se registra automáticamente el filtro mediante @Provider
}
