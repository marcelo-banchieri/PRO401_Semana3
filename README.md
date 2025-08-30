# PRO401 – Actividad Semana 3

- Alumno: Marcelo Banchieri
- Asignatura: Taller de Aplicaciones Móviles
- Docente: Iván Ayala Ayala
- Fecha: 01-09-2025

## Descripción

Este proyecto corresponde a la Actividad Semana 3 de la asignatura Taller de Aplicaciones Móviles.
El objetivo principal es comprender el proceso de compilación y ejecución de programas en Java utilizando el JDK y la JVM, sin emplear un IDE, y documentar el desarrollo de una aplicación básica en consola.

Adicionalmente, se aborda un caso de estudio de una distribuidora de alimentos que requiere implementar un sistema de compras con cálculo automático de despacho a domicilio, aplicando reglas de negocio predefinidas.

## Caso de Estudio

Si la compra es ≥ $50.000 y la distancia ≤ 20 km → despacho gratis.
Si la compra está entre $25.000 y $49.999 → se cobra $150 por km.
Si la compra es < $25.000 → se cobra $300 por km.

Los usuarios pueden registrarse mediante cuenta Gmail.

## Requerimientos Funcionales (RF)
1. **RF1 – Registro con Gmail:** permitir autenticación mediante OAuth 2.0 con cuentas Gmail.  
2. **RF2 – Catálogo de productos:** mostrar productos con nombre, precio, stock e imagen.  
3. **RF3 – Carrito de compras:** agregar productos, editar cantidades y calcular subtotales/totales.  
4. **RF4 – Cálculo automático de despacho:** aplicar las reglas de negocio según monto y distancia.  
5. **RF5 – Validación de cobertura:** asegurar que la dirección esté dentro del radio de 20 km.  
6. **RF6 – Medio de pago:** simular o integrar pasarela de pago.  
7. **RF7 – Historial de pedidos:** mostrar pedidos previos y sus estados (pendiente, en reparto, entregado).  
8. **RF8 – Perfil de usuario:** permitir edición de datos básicos.  
9. **RF9 – Administración:** gestión (CRUD) de productos y pedidos por parte del administrador.  

---

## Requerimientos No Funcionales (RNF)
1. **RNF1 – Usabilidad:** interfaz simple e intuitiva, con respuesta < 2 segundos.  
2. **RNF2 – Seguridad:** uso de OAuth 2.0 y HTTPS para comunicaciones seguras.  
3. **RNF3 – Disponibilidad:** disponibilidad mínima de 99% en horario laboral.  
4. **RNF4 – Portabilidad:** aplicación accesible desde navegadores y dispositivos móviles.  
5. **RNF5 – Escalabilidad:** diseño preparado para soportar crecimiento de usuarios.  
6. **RNF6 – Mantenibilidad:** código modular, documentado y con buenas prácticas.  
7. **RNF7 – Rendimiento:** operaciones críticas deben resolverse en menos de 1 segundo.  
8. **RNF8 – Observabilidad:** contar con logs de errores y métricas básicas para soporte.

## Tecnologías utilizadas

Lenguaje: Java SE 8+
Compilación: javac (desde línea de comandos)
Ejecución: java en la JVM
Control de versiones: Git y GitHub (opcional, recomendado)

## Cómo compilar y ejecutar

Desde la carpeta raíz del proyecto:
```bash 

# Compilar los programas (archivos .class se generan en la carpeta /out)
javac -d out src\ActividadVehiculo.java src\ActividadNombreEdad.java

# Ejecutar programa ActividadVehiculo
java -cp out ActividadVehiculo

# Ejecutar programa ActividadNombreEdad
java -cp out ActividadNombreEdad
```
## Autor
Marcelo Banchieri – Estudiante de Ingeniería en Informática (AIEP)

