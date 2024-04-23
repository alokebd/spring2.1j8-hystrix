#The netflix-hystrix as Circuit Breaker (load balancing)
# Note: 
# (1) Run the discovery service then other services 
# (2) Add data in following order: customer, vehicle and rental services 
# (3) As default loadbalancing as round robin, by calling http://localhost:8091/services/rent/{rend id}?type=Y 
