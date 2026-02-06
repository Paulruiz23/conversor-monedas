# 💱 Conversor de Monedas

[![Java](https://img.shields.io/badge/Java-17+-blue?logo=java)](https://www.oracle.com/java/)
![Repositorio](https://img.shields.io/badge/repositorio-público-brightgreen) ![Estado del proyecto](https://img.shields.io/badge/estado-en%20progreso-yellow)
---

## 🚀 Descripción

Este proyecto es un **conversor de monedas** desarrollado en Java, que permite convertir entre **USD, PEN, ARS, BRL y COP** usando tasas de cambio actualizadas mediante la API [ExchangeRate-API](https://www.exchangerate-api.com/).
Está diseñado de manera modular y siguiendo buenas prácticas de programación orientada a objetos, con clases separadas para la conversión, historial y menú interactivo.

---

## 🛠 Funcionalidades

* Conversión de monedas.
* Menú interactivo.
* Historial de conversiones.
* Manejo de entradas inválidas del usuario.
* Código modular y fácil de mantener.

---

## 📁 Estructura del proyecto

<details>
<summary>Click para expandir</summary>

```
conversor-monedas/
│
├─ src/
│   ├─ conversor/
│   │   ├─ cliente/
│   │   │   └─ ApiClient.java       # Solicitudes HTTP a la API
│   │   ├─ modelo/
│   │   │   └─ Monedas.java         # Representa las tasas de conversión
│   │   ├─ servicio/
│   │   │   ├─ Conversor.java       # Lógica de conversión
│   │   │   ├─ Historial.java       # Registro de conversiones con timestamp
│   │   │   └─ MenuConversion.java  # Menú de opciones de conversión
│   │   └─ principal/
│   │       └─ Main.java            # Flujo principal e interacción con usuario
│
├─ .gitignore
└─ README.md
```

</details>

---

## ⚡ Uso

1. **Clonar el repositorio**

```bash
git clone https://github.com/Paulruiz23/conversor-monedas.git
cd conversor-monedas
```

2. **Compilar**

```bash
javac -d out src/conversor/**/*.java
```

3. **Ejecutar**

```bash
java -cp out conversor.principal.Main
```

4. **Menú**

* `1` → Convertir moneda
* `2` → Ver historial de conversiones
* `3` → Salir del programa

---

## 🖥 Ejemplo de ejecución

<details>
<summary>Click para ver</summary>

```
=== CONVERSOR DE MONEDAS  ===
1) Convertir moneda
2) Ver historial de conversiones
3) Salir
Elija una opción: 1

Seleccione el tipo de conversión:
1) USD → PEN
2) PEN → USD
3) USD → ARS
4) ARS → USD
5) USD → BRL
6) BRL → USD
7) USD → COP
8) COP → USD
Ingrese la opción: 2
Ingrese el monto: 200

Resultado: 200.00 PEN = 53.42 USD

=== CONVERSOR DE MONEDAS  ===
1) Convertir moneda
2) Ver historial de conversiones
3) Salir
Elija una opción: 2

=== Historial de Conversiones ===
[06-02-2026 00:23:19] 200.00 PEN → 53.42 USD
```

</details>

---

## ✅ Buenas prácticas aplicadas

* Modularidad y separación de responsabilidades (SRP).
* Validación de entradas de usuario.
* Historial legible con timestamps.
* Manejo de excepciones y errores de API.
* Código fácil de escalar y mantener.

---

## 🔮 Próximas mejoras

* Guardar historial en archivo o base de datos.
* Interfaz gráfica o web.
* Soporte para más monedas y actualización automática de tasas.

---

## 👤 Autor

**Paul Stuart Ruiz Cabrera**

[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Paulruiz23) [![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/paulruiz4227/)
