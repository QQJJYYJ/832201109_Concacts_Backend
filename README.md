
# Contacts Management Backend

This repository contains the backend API for the Contacts Management System. It is built using Java with the Spring Boot framework, providing RESTful endpoints to manage contact information, including features such as adding, updating, deleting, and searching for contacts.

## Project Structure

```
- src
  - main
    - java
      - com.example.demo3        # Java source files
        - controller             # REST controllers
        - service                # Business logic
        - mapper                 # Database mappers (MyBatis)
        - bean                   # Entity classes
    - resources                  # Configuration files
      - application.properties   # Spring Boot configurations
  - test                         # Unit and integration tests
- .gitignore                     # Git ignore file
- pom.xml                        # Maven dependencies and build configuration
- README.md                      # Project documentation
```

## Requirements

- Java 17+
- Maven 3.6+
- MySQL (or other compatible database)
  
## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/QQJJYYJ/832201109_Concacts_Backend.git
   cd 832201109_Concacts_Backend
   ```

2. **Configure the database**:
   - Open `src/main/resources/application.properties`.
   - Update the following properties to match your local database configuration:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_db_username
     spring.datasource.password=your_db_password
     ```

3. **Build and run the application**:
   - Build the project:
     ```bash
     mvn clean install
     ```
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

4. **Access the API**:
   - The application will run on `http://localhost:8081` by default. 
   - Use tools like Postman or curl to test the API endpoints.

## API Endpoints

- **GET /api/select?Name={name}**: Search for contacts by name (supports partial matches).
- **POST /api/add**: Add a new contact. Parameters:
  - `Name` - Contact name
  - `Phone_number` - Contact phone number
- **POST /api/update**: Update an existing contact by ID. Parameters:
  - `ID` - Contact ID
  - `Name` - Updated contact name
  - `Phone_number` - Updated contact phone number
- **POST /api/del**: Delete a contact by ID.

## Code Style

The project follows standard Java conventions. For detailed code styling, please refer to `codestyle.md` in the root directory.

## Contribution

If you’d like to contribute, please fork the repository and use a feature branch. Pull requests are welcome!

## License

This project is licensed under the MIT License. See the LICENSE file for details.
