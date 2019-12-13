# RestaurantsAssignment

Clone this repositry 
Import as maven project.
build this repositry through maven and java 1.8 and above.
Run src/main/java/com/wynk/wynk/WynkApplication.java as Java Application

Available status for Delivey Person 
ACTIVE
INACTIVE

Available status for Order
PLACED
ACCEPTED
NOT ACCEPTED
INPROGRESS
DELIVERED
RECHED BACK

Available rest end point

POST /restaurant/place-order
input = {itemId : "avgh-1332", noOfItem : 5}
output = {orderId: "38f41fc8-1d9b-11ea-978f-2e728ce88125", "status" : "PLACED" }

GET /restaurant/order-status/{orderId}
output = {orderId: "38f41fc8-1d9b-11ea-978f-2e728ce88125", "status" : "INPROGRESS" }

POST /restaurant/update-delivery-status
input = {"orderId" : "32f41fc8-1d9b-11ea-978f-2e728ce88125", status : "DELIVERED"}
output = {"orderId" : "32f41fc8-1d9b-11ea-978f-2e728ce88125", status : "DELIVERED"}

GET /restaurant/all-delivery-person-status
output = 
[
  {"deliveryPersonId" : "32f41fc8-1d9b-11ea-978f-2e728ce88125", status : "ACTIVE"},
  {"deliveryPersonId" : "67f41fc8-1d9b-11ea-978f-2e728ce88125", status : "INACTIVE"}
]


POST /delivery-person/delegate
input = {orderId : "38f41fc8-1d9b-11ea-978f-2e728ce88125", deliveryPersonId : "32f41fc8-1d9b-11ea-978f-2e728ce88125"}
output = {"status" : "ACCEPTED" }

GET /delivery-person/status/{deliveryPersonId}
output = {orderId: "38f41fc8-1d9b-11ea-978f-2e728ce88125", "status" : "ACTIVE" , "MinuteLeft" : 55}
