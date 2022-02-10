#API ENDPOINT URLs

#### Create 

http://localhost:8080/user/create

{
	"firstName":"derya",
	"lastName":"ucar"
}

```
POST /user/create HTTP/1.1
Host: localhost:8080
Content-Type: application/json
```

### Get All

http://localhost:8080/user/getAll

```
GET /user/getAll HTTP/1.1
Host: localhost:8080
Content-Type: application/json
```

### GetUser

http://localhost:8080/user/getById/100

```
GET /user/getById/100 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
```


### Pagination

http://localhost:8080/user/pagination?currentPage=2&pageSize=5

```
GET /user/pagination?currentPage=2&amp;pageSize=5 HTTP/1.1
Host: localhost:8080
Content-Type: application/json
```


```
{
    "content": [
        {
            "createdAt": "2022-02-09T17:56:34.347+00:00",
            "createdBy": "Admin",
            "updatedAt": null,
            "updatedBy": null,
            "id": 110,
            "firstName": "derya",
            "lastName": "ucar"
        },
        {
            "createdAt": "2022-02-09T17:56:34.545+00:00",
            "createdBy": "Admin",
            "updatedAt": null,
            "updatedBy": null,
            "id": 111,
            "firstName": "derya",
            "lastName": "ucar"
        },
        {
            "createdAt": "2022-02-09T17:56:34.713+00:00",
            "createdBy": "Admin",
            "updatedAt": null,
            "updatedBy": null,
            "id": 112,
            "firstName": "derya",
            "lastName": "ucar"
        },
        {
            "createdAt": "2022-02-09T17:56:34.879+00:00",
            "createdBy": "Admin",
            "updatedAt": null,
            "updatedBy": null,
            "id": 113,
            "firstName": "derya",
            "lastName": "ucar"
        },
        {
            "createdAt": "2022-02-09T17:56:35.556+00:00",
            "createdBy": "Admin",
            "updatedAt": null,
            "updatedBy": null,
            "id": 114,
            "firstName": "derya",
            "lastName": "ucar"
        }
    ],
    "pageable": {
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "offset": 10,
        "pageNumber": 2,
        "pageSize": 5,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 8,
    "totalElements": 40,
    "last": false,
    "size": 5,
    "number": 2,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "numberOfElements": 5,
    "first": false,
    "empty": false
}
```

### Pagination 

PageRequest(int page, int size, Sort sort) ----->gonderilecek parametreler
http://localhost:8080/user/pagination/v1?page=0&size=&sort=firstName

```
GET /user/pagination/v1?page=0&amp;size=&amp;sort=firstName HTTP/1.1
Host: localhost:8080
Content-Type: application/json
```

### Slice

http://localhost:8080/user/pagination/v2?page=0&sort=lastName


### Custom Pagination

http://localhost:8080/user/pagination/v3?page=0&size=2

```
{
    "content": [
        {
            "firstName": "derya",
            "lastName": "ucar"
        },
        {
            "firstName": "derya",
            "lastName": "ucar"
        }
    ],
    "pageNumber": 0,
    "pageSize": 2,
    "sort": {
        "empty": true,
        "sorted": false,
        "unsorted": true
    },
    "totalPages": 2,
    "totalElements": 3
}
```

### Custom Exception

http://localhost:8080/user/getById/10010