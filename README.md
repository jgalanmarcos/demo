## Demo

The API REST is handler by Swagger UI:

```
http://localhost:8888/api/v1/swagger-ui/
```

##### Supported methods

* getPrice:

```
GET, http://localhost:8888/api/v1/prices?brandId={long}&date={date}&productId={long}
```
```
Input params:
brandId, long value
date, string date value (yyyy-MM-dd-HH.mm.ss)
productId, long value
```
```
Example:

http://localhost:8888/api/v1/prices?brandId=1&date=2020-06-14-10.00.00&productId=35455

Response:
{
  "brandId": 1,
  "startDate": "2020-06-14T00:00:00",
  "endDate": "2020-12-31T23:59:59",
  "priceList": 1,
  "productId": 35455,
  "price": 35.5,
  "currency": "EUR"
}
```

## Data Base

* Embedded H2 DateBase (dev profile):

```
http://localhost:8888/api/v1/h2-console/

Driver: org.h2.Driver
URL: jdbc:h2:mem:db_test
user: sa
password:

```