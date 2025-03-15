---

# CadastroDeNinjas - Java API

This is a simple API for registering ninjas and missions, developed as part of the Java10x course. The API allows creating, listing, updating, and deleting ninjas and missions, along with other basic CRUD operations.

## Technologies Used

- **Java**: Main programming language.
- **Spring Boot**: Framework for Java application development.
- **Maven**: Dependency management and build tool.
- **H2 Database**: In-memory database for development and testing.
- **JPA**: Java Persistence API for object-relational mapping.
- **Postman**: Tool for testing API requests.

## Requirements

- Java 11 or higher.
- Maven 3.6 or higher.
- Postman or any other tool for testing HTTP requests.
- Any IDE of your choice (IntelliJ IDEA, Eclipse, etc.).

---

## How to Run the Project

1. **Clone the repository**:

   ```bash
   git clone https://github.com/JhonattaCosta/CadastroDeNinjas.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd CadastroDeNinjas
   ```

3. **Compile the project with Maven**:

   ```bash
   mvn clean install
   ```

4. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

5. **Access the API**:

   The API will be available at `http://localhost:8080`.

---

## API Endpoints

The API provides the following endpoints:

### Ninjas

- **GET /ninjas**: Lists all registered ninjas.
- **GET /ninjas/{id}**: Returns details of a specific ninja.
- **POST /ninjas**: Creates a new ninja.
- **PUT /ninjas/{id}**: Updates data of an existing ninja.
- **DELETE /ninjas/{id}**: Deletes a ninja.

### Missions

- **GET /missoes**: Lists all registered missions.
- **GET /missoes/{id}**: Returns details of a specific mission.
- **POST /missoes**: Creates a new mission.
- **PUT /missoes/{id}**: Updates data of an existing mission.
- **DELETE /missoes/{id}**: Deletes a mission.

---

## Registration Models

### Ninja

Here is the registration model for a ninja:

```json
{
    "id": 1,
    "nome": "Naruto Uzumaki",
    "email": "naruto@gmail.com",
    "imgUrl": "naruto",
    "idade": 30,
    "rank": "gennin",
    "missoes": {
        "id": 1,
        "nome": "teste",
        "dificuldade": "Facil"
    }
}
```

### Mission

Here is the registration model for a mission:

```json
{
    "id": 1,
    "nome": "Training Mission",
    "dificuldade": "Easy"
}
```

## Database

The project uses the H2 in-memory database to facilitate development and testing. You can access the H2 console at:

```
http://localhost:8080/h2-console
```

## Contribution

Contributions are welcome! Feel free to open issues and pull requests.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---
