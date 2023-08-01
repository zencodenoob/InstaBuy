# InstaBuy - Spring Boot

## Introduction

This repository contains a demo online shopping application built using Spring Boot, showcasing the fundamental features and functionalities of an e-commerce platform. The application provides a basic foundation for building a full-fledged online shopping website, including product catalog, shopping cart, user authentication, and order processing.


## Features

- **Product Catalog**: Browse a wide range of products with detailed information, including name, description, price, and images.
- **Product Search**: Easily search for products by name or category.
- **Shopping Cart**: Add products to the cart, update quantities, and proceed to checkout.
- **Order Placement**: Place orders and view order history.

## How to Run the Application

1. Clone this repository to your local machine.
2. Make sure you have Java JDK (version 8 or higher) installed.
3. Open the project in your favorite IDE (e.g., IntelliJ, Eclipse).
4. Build the project to resolve dependencies.
5. Run the `InstabuyApplication` class, which is the entry point of the application.
6. The application will start, and you can access it through your web browser at `http://localhost:8080`.

## Demo Data

The application is pre-populated with demo data for products and users. You can explore the product catalog, add products to the cart, and place orders using the existing data.

## API Endpoints

The application offers a simple API to interact with the backend. Here are the main endpoints:

- `GET /products`: Retrieve a list of all products.
- `GET /categories`: Retrieve a list of all categories.
- `GET /deals_of_the_day/{number_of_products}`: Retrieve a list of products as speciefied by the number.
- `POST /checkout`: Add a product to the shopping cart and places order.

## Contribution

This demo online shopping application is intended for educational and illustrative purposes. Feel free to explore, modify, and contribute to this repository. If you encounter any issues or have suggestions for improvement, please open an issue or submit a pull request.

