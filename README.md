# Spring boot device seller

## Endpoints

### Sign Up
````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 77

{
"name": "admin",
"username": "admin",
"password": "admin"
}
````
### Sign In
````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 57

{
"username":"user",
"password":"user"
}
````
### Change Role
````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjozLCJleHAiOjE2NDM0NTU5NTB9.IbxGAxvtEt5w-0Zr5R6DzLrta3RYTLW8hmImMWxud8JQRNFYdqTl28kd0jOKeqDUmMyA8kzDNc5D5zCmHMx2Dg
````
### Save Device
````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MywiZXhwIjoxNjQzNzExMjI0fQ.OJ41dDNuY340CgQxdpWSDeyuGBFJdO7mIJWwiCsTSXBwvDXk9NdpGVcbR4BK2jBGpihF8K9hxnD51cVrW1Fa3g
Content-Type: application/json
Content-Length: 102

{
"name":"device-2",
"description":"desc-2",
"price": 9,
"deviceType": "LAPTOP"
}
````

### Delete Device

````
DELETE /api/device/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MywiZXhwIjoxNjQzNDU5MjkwfQ.j-4Kw0t4vEh5Pwh1e1dP41BD4G7-P3q6TFBuba_135zepPlUVbEC4u0aIoQetk4Co_Lig7sHf1D2VIdttugaFg
````

### Save Purchase

````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MywiZXhwIjoxNjQzNzExMjI0fQ.OJ41dDNuY340CgQxdpWSDeyuGBFJdO7mIJWwiCsTSXBwvDXk9NdpGVcbR4BK2jBGpihF8K9hxnD51cVrW1Fa3g
Content-Type: application/json
Content-Length: 77

{
    "userId":3,
    "deviceId":4,
    "price":8.0,
    "color":"red"
}
````
### Get all Purchases

````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MywiZXhwIjoxNjQzNzExMjI0fQ.OJ41dDNuY340CgQxdpWSDeyuGBFJdO7mIJWwiCsTSXBwvDXk9NdpGVcbR4BK2jBGpihF8K9hxnD51cVrW1Fa3g
````