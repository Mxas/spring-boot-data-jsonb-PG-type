# spring-boot-data-jsonb-PG-type
Spring Boot Data 3.x.x with example of PostgreSQL's JSONB data type usage




# Solution



For people using Spring-boot there are two ways to do what @Craig Ringer said
    
    spring.datasource.url=jdbc:postgresql://localhost:5432/postgres?stringtype=unspecified
    
or using properties
    
    spring.datasource.hikari.data-source-properties.stringtype=unspecified

