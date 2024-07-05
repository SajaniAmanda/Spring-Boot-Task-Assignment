# Spring-Boot-Task-Assignment

## Description
TASK-APP is a simple Spring Boot application designed to provide a RESTful API for managing a list of tasks. Each task has a title, description, and status, allowing users to create, retrieve, update, and delete tasks. The application uses an H2 in-memory database for development and testing purposes.

## Features

Create a New Task
- Add a new task with a title, description, and status.

Retrieve All Tasks
- Fetch a list of all tasks.

Retrieve a Task by ID
- Get details of a specific task using its ID.

Update a Task
- Modify the details of an existing task.

Delete a Task
- Remove a task from the list.

Validation
- Ensure the task title is not empty.

## Getting Started
Prerequisites
- Java 11 or later
- Maven

Running the Application

1. Clone the repository:
```markdown
git clone https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment.git
cd Spring-Boot-Task-Assignment
```
2. Build and run the application:
```markdown
./mvnw spring-boot:run
```
3. The application will start on http://localhost:8080.

## API Endpoints
- POST /tasks: Create a new task.
- GET /tasks: Retrieve all tasks.
- GET /tasks/{id}: Retrieve a task by its ID.
- PUT /tasks/{id}: Update a task by its ID.
- DELETE /tasks/{id}: Delete a task by its ID.

### API Testing with Postman 

![post_test](https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment/assets/109839850/e74a1f80-a0c6-4673-a10e-df63ab5bb4ea)

![get_all_test](https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment/assets/109839850/67816731-e2d7-49e2-8f76-b796fd46685b)

![get_byId_test](https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment/assets/109839850/77625e97-131c-473f-a2b5-c324fd2065ad)

![put_test](https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment/assets/109839850/07762508-c275-418b-883f-1032a71bb00a)

![get_all](https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment/assets/109839850/bfc20022-8a1e-4ca3-bc42-751c2db76a78)

![delete_test](https://github.com/SajaniAmanda/Spring-Boot-Task-Assignment/assets/109839850/bc4fd688-3b8f-4791-9e5d-610d1f9251aa)



