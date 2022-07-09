===========================================================

This Repository Contains All Rewards And Redemption Modules

===========================================================

Scope & Assumptions : 

- User Service :
  -
  - This where our users stored, each user has its own authority and roles assigned to them.
  - We track all user activities and send message events to reward service whenever user do an activity (e.g. login, create transaction, write comment, recommend some products), we call this activities.

- Reward Service :
  -
  - Campaign that consider as a complicated campaign (have many rules need to be apllied) and can not be processed in real time, because that need so many resources, and this kind of campaign access data from DW which usually not updated in real time.
  - Complicated campaign will be processed every night
  - Points can be exchanged with some available products or services
  - Point can have period, and only active or redeemable within that period.
  - for some type of rewards (e.g. dompet digital), logged in account must have active account in our reward partners, and our system can connect either by using phone number or registered email.
  
