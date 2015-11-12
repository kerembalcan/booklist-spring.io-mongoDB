# booklist-spring.io-mongoDB

-It is a library catalog that users can add books and list them.

# Spring.io - MongoDB Connection - JUnit Tests

This project uses NOSQL database - MongoDB. The connection provided with mongo driver 3.0.
There is not a local db on this project. It is connected to the a remote mongo cloud, to my personel mongoLab account.

MongoRepository is an interface that supply CRUD Operations. CustomQueries can be found here.

These custom queries and create-read operations tested via JUnit.

To keep the data while not adding a record @Cachable works and caches the data. 
@CacheEvict removes the caches when user add new record.


If you get an error when you run the project on Tomcat please control;

properties for project/Deployment Assembly/Add Maven Dependencies


