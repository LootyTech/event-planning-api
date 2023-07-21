# event-planning-api
Event Planning API

## Pre-req:
- Java 17
- Postgresql 15
- Auth0 account

### IDE Setup
If you use Intellij , follow these step belows to add the environment variables
- Navigate to Run/Debug configurations
- Go to Modify Options -> Operating System -> Add "Environment variables"

### Setup database

Add these following env in your IDE with the appropriate configuration as provided below:

```properties
DB_HOST=localhost
DB_PORT=5432
DB_NAME=event-planning
DB_USER=<your-db-user>
DB_PASSWORD=<your-db-password>
```

### Setup Auth0

Create you own Auth0 tenants and change these environment variables below to match with your tenant

```properties
AUTH0_AUDIENCES=<your-auth0-audiences>
AUTH0_ISSUER=<your-auth0-issuer>
```

### Config CORS
Add the URLs you want to excluded in CORS using this variable
```properties
LOOTY_CORS_ORIGINS=<your-cors-origins>
```
For example
```properties
LOOTY_CORS_ORIGINS=http://localhost:3000
```