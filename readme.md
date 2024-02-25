SWAP

init project : 
1.install docker locally
2. run commend in root folder : docker-compose up -d
3. Start spring boot normally by run or debug

For manage mongo db user robo 3t ( preferred ) or studiot 3t
Connect to mongo instance according application.yml file
For manage rabbit mq user rabbit MQ ui on port 15672

Microservices for Product Verification System (SWAP)

The SWAP project is a microservices-based architecture designed to facilitate product verification. The project involves the development of various microservices and their integration to create a robust and scalable Product Verification System. Below are the key components and stages of the project:

1. API-Gateway SWAP Development with MongoDB and Docker

The project starts with the creation of an API-Gateway for SWAP, acting as the main entry point for communication. MongoDB is employed for data storage, and Docker is used for containerization, ensuring portability and ease of management.

2. Verification-Service Microservice Creation + Testing

This microservice is responsible for handling product verification processes. It includes the development of endpoints and integration with MongoDB for data storage. Rigorous testing, including unit tests, is conducted to validate the correctness of the verification functionalities.

3. Product-Service Microservice Development. Retrieval of Product Data for Verification + Testing

The Product-Service microservice is designed to fetch product data required for the verification process. The development includes integration with external systems, and thorough testing is carried out to ensure data accuracy and service reliability.

4. Integration of Verification Process in SWAP and Integration with Other Microservices

This phase involves integrating the Verification-Service and Product-Service microservices into the SWAP ecosystem. The goal is to establish seamless communication and data flow between the microservices to enable a streamlined product verification process.

5. Integration of RabbitMQ Queues for Internal Communication Between Microservices

RabbitMQ queues are introduced to enhance internal communication between microservices. The asynchronous message exchange facilitated by RabbitMQ improves system responsiveness and resilience by decoupling the microservices.

6. Creation of Endpoints for Changing Product Status: VERIFY, DESTROY, EXPIRE, RETURN, SAMPLE

Endpoints are added to SWAP to allow for the modification of product statuses. Operations such as verification confirmation, destruction, expiration, return, and sampling are implemented, providing comprehensive control over product lifecycle states.

7. UAT Testing, Integration Testing, Performance Testing

Testing is a crucial phase, covering User Acceptance Testing (UAT), Integration Testing, and Performance Testing. These tests ensure the reliability of the system, the seamless integration of microservices, and optimal performance under various conditions.

8. Application Testing and Bug Fixing (Weeks 9-12)

The final phase involves extensive testing, bug detection, and fixing. This iterative process aims to enhance the system's overall quality, addressing any issues identified during testing and ensuring a stable and efficient Product Verification System.

The technology stack includes Spring Boot (Java), MongoDB, Docker, and RabbitMQ, providing scalability, flexibility, and high performance for the SWAP system.
