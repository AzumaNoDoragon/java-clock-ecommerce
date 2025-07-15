
# ⌚ Clock API - Spring Boot

Esta é uma API RESTful desenvolvida com **Spring Boot** que fornece um catálogo de relógios.

---

## 🚀 Tecnologias

- Java 21+
- Spring Boot
- Maven
- Lombok

---

## 📦 Endpoints da API

### 🔹 Listar todos os relógios

**GET**  
`http://localhost:3339/api/v1/clocks/`

**Resposta:**
```json
[
  {
    "id": 1,
    "name": "Celestial Time",
    "picture": "https://...",
    "originalPrice": 70.0,
    "actualPrice": 60.0,
    "stock": 200
  },
  ...
]
````

---

### 🔹 Buscar relógio por ID

**GET**
`http://localhost:3339/api/v1/clocks/{id}`

Exemplo:
`http://localhost:3339/api/v1/clocks/1`

**Resposta:**

```json
{
  "id": 1,
  "name": "Celestial Time",
  "picture": "https://...",
  "originalPrice": 70.0,
  "actualPrice": 60.0,
  "stock": 200
}
```

**Erro (ID não encontrado):**

```http
404 Not Found
```

---

## 🔧 Como executar o projeto

1. **Clone o repositório**

```bash
git clone https://github.com/felipeAguiarCode/clock-api.git
cd clock-api
```

2. **Compile o projeto**

```bash
mvn clean install
```

3. **Execute a aplicação**

```bash
mvn spring-boot:run
```

A aplicação ficará disponível em:
`http://localhost:3339`

---

## 📁 Estrutura do Projeto

```
com.dio.dio.clocks
├── controllers     → Endpoints REST
├── config          → Configurações
├── services        → Regras de negócio
├── data            → Dados simulados (mock)
└── domain          → Entidades de domínio (Clock)
```

---

## 🌟 Boas Práticas Aplicadas

* Estrutura em camadas (controller, service, domain, data)
* Versionamento de API (`/api/v1`)
* Convenção RESTful nas rotas
* Uso de `ResponseEntity` para controle de status HTTP
* Lombok para reduzir boilerplate

---

## 📌 Observação

> Esta API utiliza dados mockados (em memória). Não há persistência em banco de dados.

---
