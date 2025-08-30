# Historias de Usuario – Caso de Estudio Distribuidora

Este documento presenta las Historias de Usuario identificadas para el caso de estudio de la distribuidora de alimentos. 
Se redactaron siguiendo el formato estándar de roles, objetivos y beneficios, además de criterios de aceptación claros y medibles.

## HU-01: Registro con Gmail

**Como** cliente
**Quiero** registrarme e iniciar sesión con mi cuenta de Gmail
**Para** no tener que crear otra contraseña y acceder de manera más rápida y segura.

**Criterios de aceptación:**

- El sistema debe mostrar un botón “Continuar con Google”.
- Si el inicio de sesión es exitoso, el cliente accede a su perfil.
- Si falla, se debe mostrar un mensaje de error claro.

## HU-02: Calcular costo de despacho

**Como** cliente
**Quiero** que el sistema calcule automáticamente el costo de despacho según el total de mi compra y la distancia
**Para** saber cuánto debo pagar antes de confirmar mi pedido.

**Criterios de aceptación:**

- Si el total es ≥ $50.000 y la distancia ≤ 20 km → despacho gratis.
- Si el total está entre $25.000 y $49.999 → $150 por km.
- Si el total es < $25.000 → $300 por km.
- Si la distancia es > 20 km → mostrar mensaje: “Zona fuera de cobertura”.

## HU-03: Finalizar compra

**Como** cliente
**Quiero** pagar mi carrito de compras
**Para** confirmar mi pedido y recibir los productos en mi domicilio.

**Criterios de aceptación:**

- El sistema debe permitir simular o usar una pasarela de pago.
- El cliente debe recibir un comprobante de compra con el detalle del pedido.
- El pedido debe registrarse con estado inicial “pendiente”.

## HU-04: Historial de pedidos

**Como** cliente
**Quiero** ver un listado de mis pedidos anteriores
**Para** conocer el estado actual de cada compra y consultar mis compras pasadas.

**Criterios de aceptación:**

- Mostrar la lista de pedidos con fecha, monto y estado (pendiente, en reparto, entregado).
- Permitir ver el detalle de cada pedido (productos, cantidad, costo de despacho).

## HU-05: Administración de productos

**Como** administrador
**Quiero** crear, editar y eliminar productos del catálogo
**Para** mantener la información actualizada y disponible para los clientes.

**Criterios de aceptación:**

- Debe validar que todos los campos (nombre, precio, stock) estén completos.
- No se puede eliminar un producto que tenga pedidos en curso.
- El catálogo debe actualizarse en tiempo real tras cada modificación.

Estas Historias de Usuario servirán como base para definir el backlog inicial del sistema y guiar el desarrollo iterativo de la aplicación.
