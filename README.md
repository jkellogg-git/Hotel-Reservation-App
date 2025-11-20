# Hotel Reservation App

A hotel reservation web application built with a robust Java Spring Boot backend and a responsive Angular frontend. This project aims to provide a seamless hotel booking experience for end users and an efficient management interface for property owners.

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

---

## Features

- User authentication and registration
- Browse hotels and room types
- Search hotels by location, price, availability, and amenities
- Detailed hotel and room information
- Real-time availability checks
- Secure reservation and booking process
- Manage bookings (modify, cancel)
- Admin dashboard for hotel managers to manage listings, rooms, bookings, and customers
- RESTful API backend
- Responsive design for desktop and mobile

---

## Tech Stack

**Backend**
- Java
- Spring Boot

**Frontend**
- Angular (TypeScript)
- HTML, CSS, JavaScript

**Others**
- REST API
- Database (e.g., MySQL or H2)
- JWT for Authentication

Language composition:
- Java: 54.7%
- HTML: 21.5%
- TypeScript: 21%
- JavaScript: 2.5%
- Other: 0.3%

---

## Getting Started

### Prerequisites

- Java 11 or later
- Node.js & npm
- Angular CLI
- MySQL or H2 (for database)

### Clone the Repo

```sh
git clone https://github.com/jkellogg-git/Hotel-Reservation-App.git
cd Hotel-Reservation-App
```

---

## Project Structure

```text
Hotel-Reservation-App/
├── backend/  # Java Spring Boot server code
│   ├── src/
│   └── ...
├── frontend/ # Angular client code
│   ├── src/
│   └── ...
├── README.md
└── ...
```

---

## Installation

### Backend (Spring Boot)

1. Navigate to the backend directory:

    ```sh
    cd backend
    ```

2. Configure database settings in `src/main/resources/application.properties`.

3. Build and run the Spring Boot server:

    ```sh
    ./mvnw spring-boot:run
    ```
    or
    ```sh
    mvn spring-boot:run
    ```

### Frontend (Angular)

1. Navigate to the frontend directory:

    ```sh
    cd frontend
    ```

2. Install dependencies:

    ```sh
    npm install
    ```

3. Run the Angular app:

    ```sh
    ng serve
    ```

The frontend will run on [http://localhost:4200](http://localhost:4200) by default.

---

## Usage

- Open the web app in your browser.
- Register or log in as a user.
- Search for hotels, view details, and make reservations.
- Admins can log in to manage hotel listings and reservations.

---

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/<feature-name>`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/<feature-name>`)
5. Open a Pull Request

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

For support or questions, contact [jkellogg-git](https://github.com/jkellogg-git).
